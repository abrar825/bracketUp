package com.amc.bracketup.entity;

public class WorldCup32Team extends Tournament implements TournamentFormat  {



    @Override
    public int getNumberOfTeams() {
        return 0;
    }

    @Override
    public int getNumberOfGroups() {
        return 0;
    }

    @Override
    public String getFormatName() {
        return null;
    }
}
