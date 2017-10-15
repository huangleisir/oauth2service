package com.oauth2.oauth2service.security;

import org.springframework.security.core.AuthenticationException;

/**
 * Created by user on 01/09/2017.
 */
public class UserNotActivatedException extends AuthenticationException {

    public UserNotActivatedException(String msg, Throwable t) {
        super(msg, t);
    }

    public UserNotActivatedException(String msg) {
        super(msg);
    }
}