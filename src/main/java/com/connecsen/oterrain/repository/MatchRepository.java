package com.connecsen.oterrain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connecsen.oterrain.domaine.Match;

public interface MatchRepository extends JpaRepository<Match, Long>{
	Match findByStatusAndId(boolean status,Long id);
	List<Match> findByStatus(boolean status);
	List<Match> findByMatchDejaJoue(boolean matchDejaJoue);
}