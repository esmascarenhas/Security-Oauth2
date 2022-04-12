package br.com.tqi.OauthAndKeyclock.api.model.response;




import java.util.UUID;


public record ClientResponse (Long id, String name, String email, String password, String cpf) {


}
