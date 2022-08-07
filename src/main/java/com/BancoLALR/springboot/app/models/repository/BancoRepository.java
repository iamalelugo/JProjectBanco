package com.BancoLALR.springboot.app.models.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BancoLALR.springboot.app.models.entity.Banco;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Serializable> {

}
