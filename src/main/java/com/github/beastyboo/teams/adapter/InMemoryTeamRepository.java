package com.github.beastyboo.teams.adapter;

import com.github.beastyboo.teams.domain.entity.TeamEntity;
import com.github.beastyboo.teams.domain.port.TeamRepository;

import java.util.*;

/**
 * Created by Torbie on 16.11.2020.
 */
public class InMemoryTeamRepository implements TeamRepository{

    private final Map<String, TeamEntity> inMemory = new HashMap<>();


    @Override
    public TeamEntity create(TeamEntity team) {
        inMemory.put(team.getName().toLowerCase(), team);
        return team;
    }

    @Override
    public TeamEntity delete(TeamEntity team) {
        inMemory.remove(team.getName().toLowerCase(), team);
        return team;
    }

    @Override
    public Optional<TeamEntity> findByName(String name) {
        return Optional.ofNullable(inMemory.get(name.toLowerCase()));
    }

    @Override
    public Optional<TeamEntity> findByCrator(UUID creator) {
        return inMemory.values().stream()
                .filter(team -> team.getCreator().equals(creator)).findAny();
    }

    @Override
    public Set<TeamEntity> findAllTeams() {
        return new HashSet<>(inMemory.values());
    }
}
