package com.github.thiagosena.citiesapi.countries.repository;

import com.github.thiagosena.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long>{
}
