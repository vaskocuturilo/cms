package com.example.cms.client.repository;

import com.example.cms.client.entity.ClientEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<ClientEntity, String> {
}
