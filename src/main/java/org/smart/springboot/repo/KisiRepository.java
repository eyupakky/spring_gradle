package org.smart.springboot.repo;

import org.smart.springboot.entity.Kisi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KisiRepository extends JpaRepository<Kisi, Long> {
}
