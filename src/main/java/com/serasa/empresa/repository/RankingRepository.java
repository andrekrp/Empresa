package com.serasa.empresa.repository;

import com.serasa.empresa.model.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankingRepository extends JpaRepository <Ranking, Long> {
}
