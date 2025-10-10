package com.nabd.service;

import com.nabd.model.Store;
import com.nabd.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreService {
    private final StoreRepository storeRepository;

    public List<Store> getAll() { return storeRepository.findAll(); }
    public Store create(Store s) { return storeRepository.save(s); }
    public void delete(Long id) { storeRepository.deleteById(id); }
}
