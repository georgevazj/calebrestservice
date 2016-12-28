package com.jorge.dev.models;

import org.springframework.data.annotation.Id;

/**
 * Created by Jorge on 27/12/16.
 */

public class Role {

    @Id
    private String id;
    private String rolename;
    private String description;

    public Role() {
    }

    public Role(String rolename, String description) {
        this.rolename = rolename;
        this.description = description;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}