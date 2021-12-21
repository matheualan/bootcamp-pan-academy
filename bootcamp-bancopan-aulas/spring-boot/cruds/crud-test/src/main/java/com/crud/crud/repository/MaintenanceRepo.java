package com.crud.crud.repository;

import com.crud.crud.model.MaintenanceModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintenanceRepo extends JpaRepository<MaintenanceModel, Long> {

}
