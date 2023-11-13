package com.sdev.opa.domain.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sdev.opa.domain.dto.GithubDto;
import com.sdev.opa.domain.service.GithubService;
import com.sdev.opa.domain.service.InputService;
import com.sdev.opa.domain.service.OutputService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OPAController {
    private final InputService inputService;
    private final OutputService outputService;
    private final GithubService githubService;

    @PostMapping("/input")
    public void input(@RequestBody String deny) throws JsonProcessingException {
        inputService.inputDeny(deny);
    }

    @GetMapping("/output")
    public String output() throws JsonProcessingException {
        return outputService.outputDeny();
    }

    @GetMapping("/repos/{owner}/{repo}/pulls/{pull_number}")
    public GithubDto.PullR pullR(@PathVariable("owner") String owner, @PathVariable("repo") String repo, @PathVariable("pull_number") Integer pull_number){
        return githubService.getPullR(owner, repo, pull_number);
    }
}
