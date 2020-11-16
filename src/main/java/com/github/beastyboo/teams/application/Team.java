package com.github.beastyboo.teams.application;

import com.github.beastyboo.teams.config.ManualConfig;
import com.github.beastyboo.teams.usecase.CreateTeam;
import com.github.beastyboo.teams.usecase.DeleteTeam;
import com.github.beastyboo.teams.usecase.FindTeam;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * Created by Torbie on 16.11.2020.
 */
public class Team {

    private final JavaPlugin plugin;
    private final ManualConfig config;
    private final CreateTeam createTeam;
    private final DeleteTeam deleteTeam;
    private final FindTeam findTeam;

    Team(JavaPlugin plugin) {
        this.plugin = plugin;
        config = new ManualConfig();
        createTeam = config.createTeam();
        deleteTeam = config.deleteTeam();
        findTeam = config.findTeam();
    }

    void load() {

        Bukkit.getConsoleSender().sendMessage("§6Teams loading up...");
        /*

        TeamEntity team = new TeamEntity("test", UUID.randomUUID(), new HashSet<>());

        //Creates team
        TeamEntity actualTeam = createTeam.create(team);

        //Finds a team by name
        Optional<TeamEntity> actualFindTeamName = findTeam.findByName(actualTeam.getName());

        //Finds a team by uuid
        Optional<TeamEntity> actualFindTeamUUID = findTeam.findByCrator(actualTeam.getCreator());

        //List all teams
        Set<TeamEntity> teams = findTeam.findAllTeams();

         */

    }

    void close() {
        Bukkit.getConsoleSender().sendMessage("§6Teams closing down...");
    }

}
