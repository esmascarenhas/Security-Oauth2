package br.com.tqi.OauthAndKeyclock.domain.exception;

import java.util.UUID;

public class ClientNotFoundException extends Exception {
    public ClientNotFoundException(Long id) {
        super(String.format("Client not found with ID %s " , id));
    }
}
