package com.sdev.opa.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Container {
    @JsonProperty("image")
    private String image;
    @JsonProperty("name")
    private String name;
}
