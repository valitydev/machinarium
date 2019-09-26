package com.rbkmoney.machinarium.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class TSinkEvent<T> {

    private final long id;

    private final String namespace;

    private final String sourceId;

    private final TMachineEvent<T> event;

}
