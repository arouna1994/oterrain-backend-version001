package com.connecsen.oterrain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connecsen.oterrain.domaine.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
public Role findByLibelle(String libelle);
}
