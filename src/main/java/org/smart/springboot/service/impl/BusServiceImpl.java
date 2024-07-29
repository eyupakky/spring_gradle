package org.smart.springboot.service.impl;

import org.hibernate.Session;
import org.modelmapper.ModelMapper;
import org.smart.springboot.dto.BusDto;
import org.smart.springboot.dto.UserDto;
import org.smart.springboot.entity.Bus;
import org.smart.springboot.entity.User;
import org.smart.springboot.repo.BusRepository;
import org.smart.springboot.repo.RouteRepository;
import org.smart.springboot.service.BusService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BusServiceImpl implements BusService {
    private final BusRepository busRepository;
    private final RouteRepository routeRepository;
    private final ModelMapper modelMapper;

    public BusServiceImpl(BusRepository busRepository, RouteRepository routeRepository, ModelMapper modelMapper) {
        this.busRepository = busRepository;
        this.routeRepository = routeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public BusDto add(BusDto busDto) {
        Bus bus = modelMapper.map(busDto, Bus.class);
        bus.setRoute(routeRepository.findById(busDto.getRouteId()).get());
        busRepository.save(bus);
        return busDto;
    }

    @Override
    public BusDto update(BusDto busDto) {
        Bus bus = modelMapper.map(busDto, Bus.class);
        busRepository.save(bus);
        return busDto;
    }

    @Override
    public String delete(Long id) {
        busRepository.deleteById(id);
        return "success";
    }

    @Override
    public List<BusDto> allBus() {
        List<Bus> busList = busRepository.findAll();
        return busList.stream().map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }
    private BusDto convertEntityToDto(Bus bus) {
        return modelMapper.map(bus,BusDto.class);
    }
}
