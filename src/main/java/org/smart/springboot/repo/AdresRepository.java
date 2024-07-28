package org.smart.springboot.repo;

import org.smart.springboot.entity.Adres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresRepository extends JpaRepository<Adres, Long> {

}
