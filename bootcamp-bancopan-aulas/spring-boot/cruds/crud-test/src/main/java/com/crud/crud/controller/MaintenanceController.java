package com.crud.crud.controller;

import com.crud.crud.model.MaintenanceModel;
import com.crud.crud.repository.MaintenanceRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MaintenanceController {

    @Autowired
    private MaintenanceRepo repository;

    @GetMapping("/pegar")
    public List<MaintenanceModel> getAll() {
        return repository.findAll();
    }

    @PostMapping("/inserir")
    public ResponseEntity<MaintenanceModel> create(@RequestBody MaintenanceModel model) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(model));
    }
}
