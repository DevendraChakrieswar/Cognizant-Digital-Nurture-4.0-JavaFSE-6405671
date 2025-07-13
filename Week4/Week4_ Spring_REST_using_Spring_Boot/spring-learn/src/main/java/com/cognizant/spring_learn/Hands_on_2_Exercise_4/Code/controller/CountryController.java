package com.cognizant.spring_learn.Hands_on_2_Exercise_4.controller;

import com.cognizant.spring_learn.Hands_on_2_Exercise_4.Country;
import com.cognizant.spring_learn.Hands_on_2_Exercise_4.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.info("START");

        Country country = countryService.getCountry(code);

        LOGGER.info("END");
        return country;
    }
}
