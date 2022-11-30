package com.entitysample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entitysample.dto.Entitydto;
import com.entitysample.service.Entityservice;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor

@RequestMapping("/test")
public class Entitycontroller {
    private final Entityservice entityservice;

    @GetMapping("/new/{str}")
    public String test(@PathVariable String str) {
    	Entitydto res = entityservice.EntityserviceMethod(str);

        return "hello "+res.getTestStr() ;
    }
}
