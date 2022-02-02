package dev.vality.machinarium.client;

import dev.vality.machinarium.domain.TSinkEvent;
import dev.vality.machinarium.exception.EventSinkNotFoundException;

import java.util.List;
import java.util.Optional;

public interface EventSinkClient<T> {

    List<TSinkEvent<T>> getEvents(int limit) throws EventSinkNotFoundException;

    List<TSinkEvent<T>> getEvents(int limit, long after) throws EventSinkNotFoundException;

    Optional<Long> getLastEventId() throws EventSinkNotFoundException;

}
