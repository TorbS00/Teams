package com.github.beastyboo.teams.config;

import com.github.beastyboo.teams.adapter.InMemoryTeamRepository;
import com.github.beastyboo.teams.domain.port.TeamRepository;
import com.github.beastyboo.teams.usecase.CreateTeam;
import com.github.beastyboo.teams.usecase.DeleteTeam;
import com.github.beastyboo.teams.usecase.FindTeam;

/**
 * Created by Torbie on 16.11.2020.
 */
public class ManualConfig {

    private final TeamRepository repository = new InMemoryTeamRepository();

    public CreateTeam createTeam() {
        return new CreateTeam(repository);
    }

    public DeleteTeam deleteTeam() {return  new DeleteTeam(repository); }

    public FindTeam findTeam() {
        return new FindTeam(repository);
    }

}
