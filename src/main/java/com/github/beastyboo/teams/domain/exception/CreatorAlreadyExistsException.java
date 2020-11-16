package com.github.beastyboo.teams.domain.exception;

/**
 * Created by Torbie on 16.11.2020.
 */
public class CreatorAlreadyExistsException extends RuntimeException{

    public CreatorAlreadyExistsException(final String creator) {
        super(creator);
    }

}
