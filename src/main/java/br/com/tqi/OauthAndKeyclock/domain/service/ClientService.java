package br.com.tqi.OauthAndKeyclock.domain.service;

import br.com.tqi.OauthAndKeyclock.api.mapper.ClientMapper;
import br.com.tqi.OauthAndKeyclock.api.model.request.ClientRequest;
import br.com.tqi.OauthAndKeyclock.api.model.response.ClientResponse;
import br.com.tqi.OauthAndKeyclock.domain.exception.ClientNotFoundException;
import br.com.tqi.OauthAndKeyclock.domain.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ClientService {

    private final ClientRepository repository;

    private final ClientMapper mapper;


     public ClientService(ClientRepository repository, ClientMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }



    public ResponseEntity<ClientResponse> findById(Long id) throws ClientNotFoundException {
         ClientResponse client = mapper.toModel(repository.findById(id).orElseThrow(() -> new ClientNotFoundException(id)));
        return ResponseEntity.ok(client);
    }

    public List<ClientResponse> findAll (){
        return mapper.toCollection(repository.findAll());
    }

    public ResponseEntity<String> create (ClientRequest client){
        repository.save(mapper.toEntity(client));
        return ResponseEntity.ok("Cliente - " + client.getName() + " - cadastrado com sucesso. ");
    }

}
