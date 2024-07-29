package org.smart.springboot.repo;

import org.smart.springboot.entity.Bus;
import org.smart.springboot.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
}
