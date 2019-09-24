package com.rbkmoney.machinarium.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class TSinkEvent<T> {

    private final long id;

    private final String namespace;

    private final String sourceId;

    private final TMachineEvent<T> event;

}
