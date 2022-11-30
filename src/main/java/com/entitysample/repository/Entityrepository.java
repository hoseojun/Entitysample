package com.entitysample.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entitysample.entity.Entitytest;

@Repository
public interface Entityrepository extends JpaRepository<Entitytest, Integer> {
    Optional<Entitytest> findById(Integer id);
}
