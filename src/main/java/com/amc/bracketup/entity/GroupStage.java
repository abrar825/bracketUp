package com.amc.bracketup.entity;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;

@Slf4j
public class GroupStage {

    int numGroups;
    HashMap<String, Group> groups;

    public GroupStage(List<Group> groups) {
        for (Group group : groups) {
            addGroup(group);
        }
    }

    public void addGroup(Group group) {
        this.groups.put(group.getGroupName(), group);
    }
}
