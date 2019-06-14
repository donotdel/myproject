package com.zcit.agent.model;

public class CbaAccountWithBLOBs extends CbaAccount {

    private String roleIds;

    private String orgIds;

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds == null ? null : roleIds.trim();
    }

    public String getOrgIds() {
        return orgIds;
    }

    public void setOrgIds(String orgIds) {
        this.orgIds = orgIds == null ? null : orgIds.trim();
    }
}