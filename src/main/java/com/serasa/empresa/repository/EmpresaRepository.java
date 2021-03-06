package com.serasa.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serasa.empresa.model.Empresa;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
