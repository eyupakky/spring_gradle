package org.smart.springboot.controller;

import org.smart.springboot.dto.BusDto;
import org.smart.springboot.dto.RouteDto;
import org.smart.springboot.service.BusService;
import org.smart.springboot.service.RouteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api/route")
@RestController
public class RouteController {
    private final RouteService service;

    public RouteController(RouteService service) {
        this.service = service;
    }

    @PostMapping("add")
    public ResponseEntity<RouteDto> kaydet(@RequestBody RouteDto dto) {
        return ResponseEntity.ok(service.add(dto));
    }
    @DeleteMapping("delete")
    public ResponseEntity<String> deleteBus(@RequestBody Long id) {
        return ResponseEntity.ok(service.delete(id));
    }
    @PostMapping("update")
    public ResponseEntity<RouteDto> deleteBus(@RequestBody RouteDto dto) {
        return ResponseEntity.ok(service.update(dto));
    }
    @GetMapping("all")
    public ResponseEntity<List<RouteDto>> getAllData() {
        return ResponseEntity.ok(service.all());
    }
}
