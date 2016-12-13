package com.lanccj.services.response;


import com.lanccj.manage.model.Group;

import java.util.List;

/**
 * Created by lanccj on 16/12/13.
 */
public class GroupResponse{
    public List<Group> groups;

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "GroupResponse{" +
                "groups=" + groups +
                '}';
    }
}
