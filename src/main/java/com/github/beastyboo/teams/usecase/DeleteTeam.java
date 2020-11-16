package com.github.beastyboo.teams.usecase;

import com.github.beastyboo.teams.domain.entity.TeamEntity;
import com.github.beastyboo.teams.domain.exception.CreatorAlreadyExistsException;
import com.github.beastyboo.teams.domain.exception.TeamAlreadyExistsException;
import com.github.beastyboo.teams.domain.port.TeamRepository;
import com.github.beastyboo.teams.usecase.validator.TeamValidator;

/**
 * Created by Torbie on 16.11.2020.
 */
public class DeleteTeam {

    private final TeamRepository repository;

    public DeleteTeam(TeamRepository repository) {
        this.repository = repository;
    }


    public TeamEntity delete(final TeamEntity team) {
        TeamValidator.validateDeleteTeam(team);

        if(repository.findByName(team.getName()) == null) {
            throw new TeamAlreadyExistsException(team.getName() + " could not be found..");
        }

        if(repository.findByCrator(team.getCreator()) == null) {
            throw new CreatorAlreadyExistsException(team.getCreator().toString() + " is not the creator of this team..");
        }

        return repository.delete(team);
    }

}
