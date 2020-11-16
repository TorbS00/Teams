package com.github.beastyboo.teams.domain.exception;

/**
 * Created by Torbie on 16.11.2020.
 */
public class TeamValidationException extends RuntimeException{

    public TeamValidationException(final String message) {
        super(message);
    }

}
