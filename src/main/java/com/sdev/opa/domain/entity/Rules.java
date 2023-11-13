package com.sdev.opa.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Rules {
    @JsonProperty("apiGroups")
    private List<String> apiGroups;
    @JsonProperty("resources")
    private List<String> resources;
    @JsonProperty("verbs")
    private List<String> verbs;
}
