package org.smart.springboot.service;

import org.smart.springboot.dto.KisiDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface KisiService {

    KisiDto save(KisiDto kisiDto);

    KisiDto getKisi(Long id);

    List<KisiDto> getAll();

    Page<KisiDto> getAll(Pageable pageable);
}
