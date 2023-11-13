package com.sdev.opa.domain.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sdev.opa.domain.entity.Deny;
import com.sdev.opa.domain.entity.DenyEntity;
import com.sdev.opa.domain.repository.DenyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InputService {
    private final DenyRepository denyRepository;
    public void inputDeny(String response) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        DenyEntity deny = objectMapper.readValue(response, DenyEntity.class);
        denyRepository.save(deny);
    }
}
