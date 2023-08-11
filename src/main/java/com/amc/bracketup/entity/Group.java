package com.amc.bracketup.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public class Group {

    char groupName;
    int numberOfTeams;
    HashMap<String, Integer> table;

    public Group(char name, List<String> teams) {
        for (String team: teams) {
            this.table.put(team, 0);
        }
        this.numberOfTeams = teams.size();
        this.groupName = name;
    }

    public List<String> getTeams() {
        return new ArrayList<String>(this.table.keySet());
    }
}
