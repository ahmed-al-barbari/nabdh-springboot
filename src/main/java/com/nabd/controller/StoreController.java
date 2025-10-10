package com.nabd.controller;

import com.nabd.model.Store;
import com.nabd.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stores")
@RequiredArgsConstructor
public class StoreController {
    private final StoreService storeService;

    @GetMapping
    public List<Store> all() { return storeService.getAll(); }

    @PostMapping
    public Store create(@RequestBody Store s) { return storeService.create(s); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { storeService.delete(id); }
}
