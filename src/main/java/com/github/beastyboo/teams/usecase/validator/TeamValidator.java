package com.github.beastyboo.teams.usecase.validator;

import com.github.beastyboo.teams.domain.entity.TeamEntity;
import com.github.beastyboo.teams.domain.exception.TeamValidationException;

import static org.apache.commons.lang.StringUtils.isBlank;

/**
 * Created by Torbie on 16.11.2020.
 */
public class TeamValidator {

    private TeamValidator() {

    }

    public static void validateCreateTeam(final TeamEntity team) {
        if(team == null) throw new TeamValidationException("The selected team is null");
        if(isBlank(team.getName())) throw new TeamValidationException("Team name should not be null");
        if(isBlank(team.getCreator().toString())) throw new TeamValidationException("Team creator should not be null");
    }

    public static void validateDeleteTeam(final TeamEntity team) {
        if(team == null) throw new TeamValidationException("The selected team is null");
        if(isBlank(team.getName())) throw new TeamValidationException("Team name should not be null");
        if(isBlank(team.getCreator().toString())) throw new TeamValidationException("Team creator should not be null");
    }


}
