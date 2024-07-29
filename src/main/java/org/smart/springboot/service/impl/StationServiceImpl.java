package org.smart.springboot.service.impl;

import org.modelmapper.ModelMapper;
import org.smart.springboot.dto.BusDto;
import org.smart.springboot.dto.StationDto;
import org.smart.springboot.entity.Bus;
import org.smart.springboot.entity.Route;
import org.smart.springboot.entity.Station;
import org.smart.springboot.repo.BusRepository;
import org.smart.springboot.repo.RouteRepository;
import org.smart.springboot.repo.StationRepository;
import org.smart.springboot.service.BusService;
import org.smart.springboot.service.StationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StationServiceImpl implements StationService {
    private final StationRepository repository;
    private final RouteRepository routeRepository;
    private final ModelMapper modelMapper;

    public StationServiceImpl(StationRepository repository, RouteRepository routeRepository, ModelMapper modelMapper) {
        this.repository = repository;
        this.routeRepository = routeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public StationDto add(StationDto stationDto) {
        Station station = modelMapper.map(stationDto, Station.class);
        station.setRoute(routeRepository.findById(stationDto.getRouteId()).get());
        repository.save(station);
        return stationDto;
    }

    @Override
    public StationDto update(StationDto stationDto) {
        Station station = modelMapper.map(stationDto, Station.class);
        station.setRoute(routeRepository.findById(stationDto.getRouteId()).get());
        repository.save(station);
        return stationDto;
    }

    @Override
    public String delete(Long id) {
        repository.deleteById(id);
        return "success";
    }

    @Override
    public List<StationDto> all() {
        List<Station> stations = repository.findAll();

         return stations.stream().map(this::convertEntityToDto)
                 .collect(Collectors.toList());
    }
    private StationDto convertEntityToDto(Station station) {
        return modelMapper.map(station,StationDto.class);
    }
}
