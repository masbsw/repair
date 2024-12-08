package com.repair.repair.service;

import com.repair.repair.models.Client;
import com.repair.repair.repositories.ClientRepository;
import com.repair.repair.security.ClientDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements UserDetailsService {

    private ClientRepository clientRepository;

    @Autowired
    public void setClientRepository(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String mail) throws UsernameNotFoundException {
        Client client = clientRepository.findClientByMail(mail).orElseThrow(() -> new UsernameNotFoundException(
                String.format("User '%s' not found", mail)
        ));
        return ClientDetailsImpl.build(client);
    }
}
