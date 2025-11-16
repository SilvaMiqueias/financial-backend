package com.example.financial.repository;


import com.example.financial.model.Role;
import com.example.financial.model.enumerador.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName roleName);
}
