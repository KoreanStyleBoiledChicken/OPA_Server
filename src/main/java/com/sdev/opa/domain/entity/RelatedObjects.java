package com.sdev.opa.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class RelatedObjects {
    @JsonProperty("apiVersion")
    private String apiVersion;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("rules")
    private List<Rules> rules;
    @JsonProperty("roleRef")
    private RoleRef roleRef;
    @JsonProperty("subjects")
    private List<Subjects> subjects;
}
