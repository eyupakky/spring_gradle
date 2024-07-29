package org.smart.springboot.repo;

import org.smart.springboot.entity.Bus;
import org.smart.springboot.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}
