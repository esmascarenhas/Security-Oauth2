package br.com.tqi.OauthAndKeyclock.api.controller;

import br.com.tqi.OauthAndKeyclock.api.model.request.ClientRequest;
import br.com.tqi.OauthAndKeyclock.api.model.response.ClientResponse;
import br.com.tqi.OauthAndKeyclock.domain.exception.ClientNotFoundException;
import br.com.tqi.OauthAndKeyclock.domain.service.ClientService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
@AllArgsConstructor
@NoArgsConstructor
public class clientController {

    @Autowired
    private ClientService service;

    @GetMapping()
    public List<ClientResponse> findAll (){
        return service.findAll();
    }
    @GetMapping("/v1/client/{clientId}")
    public ResponseEntity findById (@PathVariable Long clientId) throws ClientNotFoundException {
        return service.findById(clientId);
    }
    @PostMapping("/v1/client")
    public ResponseEntity create ( @RequestBody @Valid ClientRequest request){
        return service.create(request);
    }
}
