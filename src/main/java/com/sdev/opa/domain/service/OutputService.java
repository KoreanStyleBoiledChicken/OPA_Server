package com.sdev.opa.domain.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sdev.opa.domain.entity.Deny;
import com.sdev.opa.domain.entity.DenyEntity;
import com.sdev.opa.domain.repository.DenyRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OutputService {
    private final DenyRepository denyRepository;

    public String outputDeny() throws JsonProcessingException {
        //collection에서 id 찾아오기
        ObjectId objId = new ObjectId("655235590c5ffd0c9d3ec579");
        Deny findDeny = denyRepository.findAllById(objId);

        try{
            ObjectMapper objectMapper = new ObjectMapper();

            String jsonString = objectMapper.writeValueAsString(findDeny);
            return jsonString;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
