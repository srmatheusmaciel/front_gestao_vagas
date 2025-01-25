package br.com.matheusmaciel.front_gestao_vagas.modules.candidate.service;

import java.util.Map;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.HttpClientErrorException.Unauthorized;
import org.springframework.beans.factory.annotation.Value;

import br.com.matheusmaciel.front_gestao_vagas.modules.candidate.dto.ProfileUserDTO;

@Service
public class ProfileCandidateService {

    @Value("${host.api.gestao.vagas}")
    private String hostAPIGestaoVagas;

    public ProfileUserDTO execute(String token) {
        RestTemplate rt = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);
        HttpEntity<Map<String, String>> request = new HttpEntity<>(headers);

        var url = hostAPIGestaoVagas.concat("/candidate/");

        try {
            var result = rt.exchange(url, HttpMethod.GET, request, ProfileUserDTO.class);
            System.out.println(result);

            return result.getBody();

        } catch (Unauthorized e) {
            throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
        }
    }
}