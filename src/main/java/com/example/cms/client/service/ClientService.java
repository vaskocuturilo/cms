package com.example.cms.client.service;

import com.example.cms.client.entity.ClientEntity;

import java.util.List;

public interface ClientService {

    ClientEntity findClient(Long id);

    List<ClientEntity> findAllClients();

    ClientEntity createClient(ClientEntity client);

    ClientEntity updateClient(ClientEntity client);

    void deleteClient(Long id);
}
