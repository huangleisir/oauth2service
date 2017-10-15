package com.oauth2.oauth2service.repository;


import com.oauth2.oauth2service.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by user on 01/09/2017.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
