package com.serasa.empresa.repository;

import com.serasa.empresa.model.Notas_Fiscais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface NotaFicalRepository extends JpaRepository <Notas_Fiscais, Long>{
}
