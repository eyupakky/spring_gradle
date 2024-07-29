package org.smart.springboot.service;

import org.smart.springboot.dto.BusDto;
import org.smart.springboot.dto.RouteDto;

import java.util.List;

public interface RouteService {
    RouteDto add(RouteDto busDto);
    RouteDto update(RouteDto busDto);
    String delete(Long id);
    List<RouteDto> all();

}
