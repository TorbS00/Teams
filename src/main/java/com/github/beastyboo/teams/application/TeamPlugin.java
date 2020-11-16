package com.github.beastyboo.teams.application;

import org.bukkit.plugin.java.JavaPlugin;

public final class TeamPlugin extends JavaPlugin {

    private Team core;

    @Override
    public void onEnable() {
        core = new Team(this);
        core.load();

    }

    @Override
    public void onDisable() {
        core.close();
        core = null;
    }
}
