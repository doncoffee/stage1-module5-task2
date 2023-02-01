package com.epam.mjc;

import java.util.List;
import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return new Operation<>() {
            @Override
            public List<Integer> apply(List<Integer> arg) {
                return arg.stream()
                        .map(i -> i / divider)
                        .collect(Collectors.toList());
            }
        };
    }
}
