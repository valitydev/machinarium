package com.rbkmoney.machinarium.domain;

import com.rbkmoney.machinegun.stateproc.ComplexAction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@AllArgsConstructor
public class CallResultData<T> {

    private final T callResult;

    private final List<T> newEvents;

    private final ComplexAction complexAction;

}
