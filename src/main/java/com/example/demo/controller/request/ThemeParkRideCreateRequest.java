package com.example.demo.controller.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Data
@ToString
@NoArgsConstructor
public class ThemeParkRideCreateRequest {
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
    private int thrillFactor;
    private int vomitFactor;

    public ThemeParkRideCreateRequest(String name, String description, int thrillFactor, int vomitFactor) {
        this.name = name;
        this.description = description;
        this.thrillFactor = thrillFactor;
        this.vomitFactor = vomitFactor;
    }

}
