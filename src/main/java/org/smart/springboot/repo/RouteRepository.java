package org.smart.springboot.repo;

import org.smart.springboot.entity.Bus;
import org.smart.springboot.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, Long> {
}
