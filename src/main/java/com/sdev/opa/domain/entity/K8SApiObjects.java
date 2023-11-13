package com.sdev.opa.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class K8SApiObjects {
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("metadata")
    private List<Metadata> metadata;
    @JsonProperty("spec")
    private List<Spec> spec;
}
