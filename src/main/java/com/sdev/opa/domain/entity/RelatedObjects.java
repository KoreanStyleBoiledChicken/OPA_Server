package com.sdev.opa.domain.entity;

import java.util.List;

public class RelatedObjects {
    private String apiVersion;
    private String kind;
    private List<Metadata> metadata;
    private List<Rules> rules;
    private List<RoleRef> roleRef;
    private List<Subjects> subjects;
}
