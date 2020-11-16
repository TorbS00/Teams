package com.github.beastyboo.teams.usecase;

import com.github.beastyboo.teams.domain.entity.TeamEntity;
import com.github.beastyboo.teams.domain.exception.CreatorAlreadyExistsException;
import com.github.beastyboo.teams.domain.exception.TeamAlreadyExistsException;
import com.github.beastyboo.teams.domain.port.TeamRepository;
import com.github.beastyboo.teams.usecase.validator.TeamValidator;

/**
 * Created by Torbie on 16.11.2020.
 */
public class CreateTeam {

    private final TeamRepository repository;

    public CreateTeam(final TeamRepository repository) {
        this.repository = repository;
    }

    public TeamEntity create(final TeamEntity team) {
        TeamValidator.validateCreateTeam(team);

        if(repository.findByName(team.getName()).isPresent()) {
            throw new TeamAlreadyExistsException(team.getName());
        }

        if(repository.findByCrator(team.getCreator()).isPresent()) {
            throw new CreatorAlreadyExistsException(team.getCreator().toString());
        }

        return repository.create(team);
    }

}
