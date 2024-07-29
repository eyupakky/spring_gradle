package org.smart.springboot.service.impl;

import org.modelmapper.ModelMapper;
import org.smart.springboot.dto.BusDto;
import org.smart.springboot.dto.RouteDto;
import org.smart.springboot.entity.Bus;
import org.smart.springboot.entity.Route;
import org.smart.springboot.repo.BusRepository;
import org.smart.springboot.repo.RouteRepository;
import org.smart.springboot.service.BusService;
import org.smart.springboot.service.RouteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RouteServiceImpl implements RouteService {
    private final RouteRepository repository;
    private final ModelMapper modelMapper;
    public RouteServiceImpl(RouteRepository busRepository, ModelMapper modelMapper) {
        this.repository = busRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public RouteDto add(RouteDto routeDto) {
        Route route = modelMapper.map(routeDto, Route.class);;
        repository.saveAndFlush(route);
        return routeDto;
    }

    @Override
    public RouteDto update(RouteDto routeDto) {
        Route route1 = repository.save(modelMapper.map(routeDto, Route.class));
        return modelMapper.map(route1, RouteDto.class);
    }

    @Override
    public String delete(Long id) {
        repository.deleteById(id);
        return "success";
    }

    @Override
    public List<RouteDto> all() {
        List<Route> routesList = repository.findAll();
        return routesList.stream().map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }
    private RouteDto convertEntityToDto(Route route) {
        return modelMapper.map(route,RouteDto.class);
    }
}
