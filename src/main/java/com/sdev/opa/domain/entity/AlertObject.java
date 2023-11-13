package com.sdev.opa.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class AlertObject {

    @JsonProperty("externalObjects")
    private ExternalObjects externalObjects;
    @JsonProperty("k8sApiObjects")
    private List<K8SApiObjects> k8sApiObjects;
}
