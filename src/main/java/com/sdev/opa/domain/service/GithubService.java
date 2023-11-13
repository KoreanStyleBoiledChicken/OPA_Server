package com.sdev.opa.domain.service;

import com.sdev.opa.common.GithubFeignClient;
import com.sdev.opa.domain.dto.GithubDto;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GithubService {
    private final GithubFeignClient githubFeignClient;
    private Environment environment;

    public List<GithubDto.Contents> getRepository(String user, String repo, String branch){
        return githubFeignClient.getRepositoryDetails(user, repo, branch);
    }


    public GithubDto.PullR getPullR(String owner, String repo, Integer pull_number){
        return githubFeignClient.getaPr(owner, repo, pull_number);
    }
}
