package com.oauth2.oauth2service.repository;

import com.oauth2.oauth2service.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by user on 04/07/2017.
 */
public interface UserRepository extends CrudRepository<User, String>{
    @Query("SELECT u FROM User u WHERE LOWER(u.username) = LOWER(:username)")
    User findByUsernameCaseInsensitive(@Param("username") String username);

    User findByEmail(String email);

    User findByEmailAndActivationKey(String email, String activationKey);

    User findByEmailAndResetPasswordKey(String email, String resetPasswordKey);
}