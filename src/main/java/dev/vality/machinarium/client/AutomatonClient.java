package dev.vality.machinarium.client;

import dev.vality.machinarium.domain.TMachineEvent;
import dev.vality.machinarium.exception.*;
import dev.vality.machinegun.stateproc.HistoryRange;
import dev.vality.machinegun.stateproc.Machine;

import java.util.List;

public interface AutomatonClient<A, V> {

    void start(String machineId, A args) throws MachineAlreadyExistsException, MachineFailedException, NamespaceNotFoundException;

    V call(String machineId, A args) throws NamespaceNotFoundException, MachineFailedException, MachineNotFoundException, MachineAlreadyWorkingException;

    Machine getMachine(String machineId) throws MachineNotFoundException, NamespaceNotFoundException;

    Machine getMachine(String machineId, HistoryRange historyRange) throws MachineNotFoundException, NamespaceNotFoundException;

    List<TMachineEvent<V>> getEvents(String machineId) throws MachineNotFoundException, NamespaceNotFoundException;

    List<TMachineEvent<V>> getEvents(String machineId, HistoryRange historyRange) throws MachineNotFoundException, NamespaceNotFoundException;

}
