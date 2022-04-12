package br.com.tqi.OauthAndKeyclock.api.mapper;

import br.com.tqi.OauthAndKeyclock.api.model.request.ClientRequest;
import br.com.tqi.OauthAndKeyclock.api.model.response.ClientResponse;
import br.com.tqi.OauthAndKeyclock.domain.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;


import java.util.List;


@Mapper(componentModel = "spring")
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);


    @Mapping(source = "name", target = "name")
    @Mapping(source = "id", target = "id")
    ClientResponse toModel (Client client);

    @Mapping(target = "id", ignore = true)
    Client toEntity (ClientRequest request);

    List<ClientResponse> toCollection (List<Client> clients);
}
