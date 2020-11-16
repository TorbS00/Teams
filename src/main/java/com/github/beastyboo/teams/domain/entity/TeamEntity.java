package com.github.beastyboo.teams.domain.entity;

import java.util.Set;
import java.util.UUID;

/**
 * Created by Torbie on 16.11.2020.
 */
public class TeamEntity {

    private final String name;
    private final UUID creator;
    private final Set<UUID> members;

    public TeamEntity(String name, UUID creator, Set<UUID> members) {
        this.name = name;
        this.creator = creator;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public UUID getCreator() {
        return creator;
    }

    public Set<UUID> getMembers() {
        return members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamEntity that = (TeamEntity) o;

        if (!getName().equals(that.getName())) return false;
        if (!getCreator().equals(that.getCreator())) return false;
        return getMembers() != null ? getMembers().equals(that.getMembers()) : that.getMembers() == null;
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getCreator().hashCode();
        result = 31 * result + (getMembers() != null ? getMembers().hashCode() : 0);
        return result;
    }


}
