package org.example.redisspring.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.redisspring.CountryRepository;
import org.example.redisspring.entity.Country;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final CountryRepository countryRepository;

    @Cacheable("countries")
    public List<Country> findAll(){
        System.out.println("burası calisti");
        return countryRepository.findAll();
    }

    @CacheEvict(value = "countries" , allEntries = true)
    public Country createCountry(Country country){
        System.out.println("Burasi calisti");
        return countryRepository.save(country);
    }
}
