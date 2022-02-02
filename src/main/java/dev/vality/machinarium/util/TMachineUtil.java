package dev.vality.machinarium.util;

import dev.vality.geck.serializer.Geck;
import dev.vality.machinarium.domain.TMachineEvent;
import dev.vality.machinegun.msgpack.Value;
import dev.vality.machinegun.stateproc.Event;
import dev.vality.machinegun.stateproc.Machine;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.thrift.TBase;

import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TMachineUtil {

    public static <T extends TBase> List<TMachineEvent<T>> getMachineEvents(Machine machine, Class<T> eventType) {
        return machine.getHistory().stream()
                .sorted(Comparator.comparingLong(Event::getId))
                .map(event -> eventToTMachineEvent(event, eventType))
                .collect(Collectors.toList());
    }

    public static <T extends TBase> TMachineEvent<T> eventToTMachineEvent(Event event, Class<T> eventType) {
        return new TMachineEvent<>(
                event.getId(),
                Instant.parse(event.getCreatedAt()),
                msgPackToTBase(event.getData(), eventType)
        );
    }

    private static <T extends TBase> T msgPackToTBase(Value data, Class<T> eventType) {
        if (data.isSetBin()) {
            return Geck.msgPackToTBase(data.getBin(), eventType);
        }
        return null;
    }

}
