package com.github.Je_Dalcin.countries.repositories;

import com.github.Je_Dalcin.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
