package ru.university.authenticationservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.university.authenticationservice.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
