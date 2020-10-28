package com.example.demo.service;

import com.example.demo.controller.request.ThemeParkRideCreateRequest;
import com.example.demo.entity.ThemeParkRide;

public interface RideService {

    ThemeParkRide getById(long id);

    Iterable<ThemeParkRide> findAll();

    ThemeParkRide create(ThemeParkRideCreateRequest themeParkRideCreateRequest);
}
