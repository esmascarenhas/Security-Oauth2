package br.com.tqi.OauthAndKeyclock.domain.repository;

import br.com.tqi.OauthAndKeyclock.domain.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository<Client , Long> {
}
