package com.sdev.opa.domain.repository;

import com.sdev.opa.domain.entity.Deny;
import com.sdev.opa.domain.entity.DenyEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DenyRepository extends MongoRepository<Deny, String> {
    public Deny findAllById(ObjectId id);
}
