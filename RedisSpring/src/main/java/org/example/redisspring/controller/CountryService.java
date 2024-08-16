package org.example.redisspring.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.redisspring.CountryRepository;
import org.example.redisspring.entity.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final CountryRepository countryRepository;

    public List<Country> findAll(){
        return countryRepository.findAll();
    }
}
