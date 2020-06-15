package com.serasa.empresa.repository;

import com.serasa.empresa.model.DadosContabeis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosContabeisRepository extends JpaRepository <DadosContabeis, Long>{
}
