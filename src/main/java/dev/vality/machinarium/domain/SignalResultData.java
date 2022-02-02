package dev.vality.machinarium.domain;

import dev.vality.machinegun.msgpack.Value;
import dev.vality.machinegun.stateproc.ComplexAction;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@RequiredArgsConstructor
public class SignalResultData<T> {

    private final Value state;

    private final List<T> newEvents;

    private final ComplexAction complexAction;

}
