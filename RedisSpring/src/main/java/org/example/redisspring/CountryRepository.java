package org.example.redisspring;

import org.example.redisspring.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country , Long> {
}
