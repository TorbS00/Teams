package com.github.beastyboo.teams.domain.exception;

/**
 * Created by Torbie on 16.11.2020.
 */
public class TeamAlreadyExistsException extends RuntimeException{

    public TeamAlreadyExistsException(final String name) {
        super(name);
    }

}
