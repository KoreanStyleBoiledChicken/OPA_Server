package com.sdev.opa.domain.entity;

import com.sdev.opa.config.BaseTimeEntity;
import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document()
public class Deny extends BaseTimeEntity {
    private List<Alert> alertList;
}
