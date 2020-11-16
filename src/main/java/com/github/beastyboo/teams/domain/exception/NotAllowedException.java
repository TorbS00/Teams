package com.github.beastyboo.teams.domain.exception;

/**
 * Created by Torbie on 16.11.2020.
 */
public class NotAllowedException extends RuntimeException{

    public NotAllowedException(final String message) {
        super(message);
    }

}
