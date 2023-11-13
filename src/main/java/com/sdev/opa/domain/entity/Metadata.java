package com.sdev.opa.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Metadata {
    @JsonProperty("name")
    private String name;
    @JsonProperty("namespace")
    private String namespace;
}
