package com.rbkmoney.machinarium.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.Instant;

@Getter
@ToString
@RequiredArgsConstructor
public class TMachineEvent<T> {

    private final long id;

    private final Instant createdAt;

    private final T data;

}
