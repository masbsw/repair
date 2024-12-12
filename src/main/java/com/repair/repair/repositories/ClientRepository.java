package com.repair.repair.repositories;

import com.repair.repair.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findClientByMail(String mail);
    Boolean existsByFullName(String fullName);
    Boolean existsByMail(String mail);


}
