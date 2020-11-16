package com.github.beastyboo.teams.domain.port;

import com.github.beastyboo.teams.domain.entity.TeamEntity;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Torbie on 16.11.2020.
 */
public interface TeamRepository {

    TeamEntity create(TeamEntity team);
    TeamEntity delete(TeamEntity team);
    Optional<TeamEntity> findByName(String name);
    Optional<TeamEntity> findByCrator(UUID creator);
    Set<TeamEntity> findAllTeams();

}
