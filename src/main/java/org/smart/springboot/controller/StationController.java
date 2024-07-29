package org.smart.springboot.controller;

import org.smart.springboot.dto.RouteDto;
import org.smart.springboot.dto.StationDto;
import org.smart.springboot.service.RouteService;
import org.smart.springboot.service.StationService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api/station")
@RestController
public class StationController {
    private final StationService service;

    public StationController(StationService service) {
        this.service = service;
    }

    @PostMapping("add")
    public ResponseEntity<StationDto> kaydet(@RequestBody StationDto dto) {
        return ResponseEntity.ok(service.add(dto));
    }
    @DeleteMapping("delete")
    public ResponseEntity<String> deleteBus(@RequestBody Long id) {
        return ResponseEntity.ok(service.delete(id));
    }
    @PostMapping("update")
    public ResponseEntity<StationDto> deleteBus(@RequestBody StationDto dto) {
        return ResponseEntity.ok(service.update(dto));
    }
    @GetMapping("all")
    public ResponseEntity<List<StationDto>> getAllData() {
        return ResponseEntity.ok(service.all());
    }
}
