package com.rbkmoney.machinarium.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.Instant;

@Getter
@ToString
@AllArgsConstructor
public class TMachineEvent<T> {

    private final long id;

    private final Instant createdAt;

    private final T data;

}
