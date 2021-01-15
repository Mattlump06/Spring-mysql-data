package com.nerdsthink.springmysql.repositories;

import com.nerdsthink.springmysql.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
