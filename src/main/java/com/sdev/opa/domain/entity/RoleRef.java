package com.sdev.opa.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoleRef {
    @JsonProperty("apiGroup")
    private String apiGroup;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("name")
    private String name;
}
