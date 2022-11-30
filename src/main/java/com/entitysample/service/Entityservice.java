package com.entitysample.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.entitysample.dto.Entitydto;
import com.entitysample.repository.Entityrepository;

import lombok.RequiredArgsConstructor;

@Service
@Component
@RequiredArgsConstructor
public class Entityservice {
    private final Entityrepository entityrepository;

    public Entitydto EntityserviceMethod(String str) {
        Entitydto entitydto = new Entitydto(str);

        return entitydto;
    }
}