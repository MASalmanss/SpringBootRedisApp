package org.example.redisspring.controller;

import lombok.RequiredArgsConstructor;
import org.example.redisspring.entity.Country;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
@RequiredArgsConstructor
public class CountryController {
    private final CountryService countryService;


    @GetMapping("")
    public List<Country> getAll(){
        return countryService.findAll();
    }

    @PostMapping("")
    public Country createCountry(@RequestBody Country country){
        return countryService.createCountry(country);
    }
}
