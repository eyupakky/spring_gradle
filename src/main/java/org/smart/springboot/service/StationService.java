package org.smart.springboot.service;

import org.smart.springboot.dto.BusDto;
import org.smart.springboot.dto.RouteDto;
import org.smart.springboot.dto.StationDto;

import java.util.List;

public interface StationService {
    StationDto add(StationDto busDto);
    StationDto update(StationDto busDto);
    String delete(Long id);
    List<StationDto> all();

}
