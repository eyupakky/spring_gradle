package org.smart.springboot.service;

import org.smart.springboot.dto.BusDto;

import java.util.List;

public interface BusService {
    BusDto add(BusDto busDto);
    BusDto update(BusDto busDto);
    String delete(Long id);
    List<BusDto> allBus();

}
