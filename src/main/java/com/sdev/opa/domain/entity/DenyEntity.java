package com.sdev.opa.domain.entity;

import com.sdev.opa.config.BaseTimeEntity;
import jakarta.persistence.*;
import org.bson.types.ObjectId;

import java.util.List;

//@Getter
//@NoArgsConstructor
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIgnoreProperties(ignoreUnknown = true)
//@Document(collection = "deny")
public class DenyEntity extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ObjectId id;
    private List<Deny> denyList;
}
