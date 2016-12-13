package com.lanccj.services.model;

/**
 * Created by lanccj on 16/12/13.
 */
public class Group {
    public String groupId;
    public String groupName;
    public String groupParent;
    public String groupCreater;
    public String groupCreateTime;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupParent() {
        return groupParent;
    }

    public void setGroupParent(String groupParent) {
        this.groupParent = groupParent;
    }

    public String getGroupCreater() {
        return groupCreater;
    }

    public void setGroupCreater(String groupCreater) {
        this.groupCreater = groupCreater;
    }

    public String getGroupCreateTime() {
        return groupCreateTime;
    }

    public void setGroupCreateTime(String groupCreateTime) {
        this.groupCreateTime = groupCreateTime;
    }

    @Override
    public String toString() {
        return "GroupParams{" +
                "groupId='" + groupId + '\'' +
                ", groupName='" + groupName + '\'' +
                ", groupParent='" + groupParent + '\'' +
                ", groupCreater='" + groupCreater + '\'' +
                ", groupCreateTime='" + groupCreateTime + '\'' +
                '}';
    }
}
