package com.example.demo.service;

import com.example.demo.controller.request.ThemeParkRideCreateRequest;
import com.example.demo.entity.ThemeParkRide;
import com.example.demo.repository.ThemeParkRideRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class RideServiceImpl implements RideService {
    private final ThemeParkRideRepository themeParkRideRepository;

    public RideServiceImpl(ThemeParkRideRepository themeParkRideRepository) {
        this.themeParkRideRepository = themeParkRideRepository;
    }

    @Override
    public ThemeParkRide getById(long id) {
        return themeParkRideRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Invalid ride id %s", id)));
    }

    @Override
    public Iterable<ThemeParkRide> findAll() {
        return themeParkRideRepository.findAll();
    }

    @Override
    public ThemeParkRide create(ThemeParkRideCreateRequest themeParkRideCreateRequest) {
        final ThemeParkRide themeParkRide = ThemeParkRide.builder()
                .name(themeParkRideCreateRequest.getName())
                .description(themeParkRideCreateRequest.getDescription())
                .thrillFactor(themeParkRideCreateRequest.getThrillFactor())
                .vomitFactor(themeParkRideCreateRequest.getVomitFactor()).build();
        return themeParkRideRepository.save(themeParkRide);
    }
}
