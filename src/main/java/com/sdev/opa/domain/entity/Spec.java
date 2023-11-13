package com.sdev.opa.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Spec {
    @JsonProperty("container")
    private List<Container> container;
}
