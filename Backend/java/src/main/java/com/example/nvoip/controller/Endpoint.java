package com.example.nvoip.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.nvoip.model.CalculaSalarioRequestDTO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController("/")
public class Endpoint {

    @PostMapping("/calculaSalario")
    public ResponseEntity<CalculaSalarioRequestDTO> calculaSalario(@RequestBody CalculaSalarioRequestDTO entity) {

        System.out.println("Requisição acionada com sucesso!");

        return ResponseEntity.ok().build();
    }

}
