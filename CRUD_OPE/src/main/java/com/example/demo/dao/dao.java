package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.entity;

public interface dao extends JpaRepository<entity, Long> {

}
