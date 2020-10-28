package com.example.demo.controller;

import com.example.demo.config.SwaggerExposeClass;
import com.example.demo.controller.request.ThemeParkRideCreateRequest;
import com.example.demo.entity.ThemeParkRide;
import com.example.demo.service.RideService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@SwaggerExposeClass
public class ThemeParkRideController {

    private final RideService rideService;
    public ThemeParkRideController(RideService rideService) {
        this.rideService = rideService;
    }

    @GetMapping(value = "/ride", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Iterable<ThemeParkRide> getRides() {
        return rideService.findAll();
    }

    @GetMapping(value = "/ride/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ThemeParkRide getRide(@PathVariable long id) {
        return rideService.getById(id);
    }

    @PostMapping(value = "/ride", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ThemeParkRide createRide(@Valid @RequestBody ThemeParkRideCreateRequest themeParkRide) {
        return rideService.create(themeParkRide);
    }
}
