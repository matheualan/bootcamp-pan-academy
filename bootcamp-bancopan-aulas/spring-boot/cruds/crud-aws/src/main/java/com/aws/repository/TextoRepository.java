package com.aws.repository;

import com.aws.model.Texto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextoRepository extends JpaRepository<Texto, Long> {

}
