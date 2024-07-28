package org.smart.springboot.controller;

import org.smart.springboot.dto.KisiDto;
import org.smart.springboot.service.KisiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/kisi/")
public class KisiController {

    private final KisiService kisiService;

    public KisiController(KisiService kisiService) {
        this.kisiService = kisiService;
    }

    @PostMapping("ekle")
    public ResponseEntity<KisiDto> kaydet( @RequestBody KisiDto kisiDto) {
        return ResponseEntity.ok(kisiService.save(kisiDto));
    }
    @GetMapping("getKisi")
    public ResponseEntity<KisiDto> getItem( @RequestParam Long id) {
        return ResponseEntity.ok(kisiService.getKisi(id));
    }
    @GetMapping("getData")
    public ResponseEntity<List<KisiDto>> tumunuListele() {
        return ResponseEntity.ok(kisiService.getAll());
    }
}
