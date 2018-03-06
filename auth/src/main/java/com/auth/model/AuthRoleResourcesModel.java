package com.auth.model;

import com.bdz.base.model.BaseModel;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * com.auth.model
 * Created by dengjinhui on 2017/12/20.
 */
@Entity
@Table(name = "auth_role_resources", schema = "auth", catalog = "")
public class AuthRoleResourcesModel extends BaseModel {


    private String roleId;
    private String resourcesId;

    @Basic
    @Column(name = "role_id")
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "resources_id")
    public String getResourcesId() {
        return resourcesId;
    }

    public void setResourcesId(String resourcesId) {
        this.resourcesId = resourcesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthRoleResourcesModel that = (AuthRoleResourcesModel) o;

        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;
        return resourcesId != null ? resourcesId.equals(that.resourcesId) : that.resourcesId == null;
    }

    @Override
    public int hashCode() {
        int result = roleId != null ? roleId.hashCode() : 0;
        result = 31 * result + (resourcesId != null ? resourcesId.hashCode() : 0);
        return result;
    }
}
