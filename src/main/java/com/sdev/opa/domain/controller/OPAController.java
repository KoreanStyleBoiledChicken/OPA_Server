package com.sdev.opa.domain.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sdev.opa.domain.service.InputService;
import com.sdev.opa.domain.service.OutputService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OPAController {
    private final InputService inputService;
    private final OutputService outputService;

    @PostMapping("/input")
    public void input(@RequestBody String deny) throws JsonProcessingException {
        inputService.inputDeny(deny);
    }

    @GetMapping("/output")
    public String output() throws JsonProcessingException {
        return outputService.outputDeny();
    }
}
