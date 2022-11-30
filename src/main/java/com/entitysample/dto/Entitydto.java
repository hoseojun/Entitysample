package com.entitysample.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Entitydto {
    private String testStr;

    public Entitydto(String testStr) {
        this.testStr = testStr;
    }
}