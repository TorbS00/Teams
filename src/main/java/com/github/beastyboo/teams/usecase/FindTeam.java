package com.github.beastyboo.teams.usecase;

import com.github.beastyboo.teams.domain.entity.TeamEntity;
import com.github.beastyboo.teams.domain.port.TeamRepository;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Torbie on 16.11.2020.
 */
public class FindTeam {

    private final TeamRepository repository;

    public FindTeam(final TeamRepository repository){
        this.repository = repository;
    }

    public Optional<TeamEntity> findByName(final String name) {
        return repository.findByName(name);
    }

    public Optional<TeamEntity> findByCreator(final UUID creator) {
        return repository.findByCreator(creator);
    }


    public Set<TeamEntity> findAllTeams() {
        return repository.findAllTeams();
    }

}
