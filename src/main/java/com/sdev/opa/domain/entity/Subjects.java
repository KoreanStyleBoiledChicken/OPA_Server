package com.sdev.opa.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Subjects {
    @JsonProperty("apiGroup")
    private String apiGroup;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("name")
    private String name;
    @JsonProperty("namespace")
    private String namespace;
}
