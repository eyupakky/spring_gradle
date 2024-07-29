package org.smart.springboot.controller;

import org.smart.springboot.dto.BusDto;
import org.smart.springboot.dto.KisiDto;
import org.smart.springboot.service.BusService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/bus")
@RestController
public class BusController {
    private final BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @PostMapping("add")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<BusDto> kaydet(@RequestBody BusDto busDto) {
        return ResponseEntity.ok(busService.add(busDto));
    }
    @DeleteMapping("delete")
    public ResponseEntity<String> deleteBus(@RequestBody Long id) {
        return ResponseEntity.ok(busService.delete(id));
    }
    @PostMapping("update")
    public ResponseEntity<BusDto> deleteBus(@RequestBody BusDto busDto) {
        return ResponseEntity.ok(busService.update(busDto));
    }
    @GetMapping("all")
    public ResponseEntity<List<BusDto>> getAllData() {
        return ResponseEntity.ok(busService.allBus());
    }
}
