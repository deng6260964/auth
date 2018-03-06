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
@Table(name = "auth_user_role", schema = "auth", catalog = "")
public class AuthUserRoleModel extends BaseModel {
    private String roleId;
    private String userId;

    @Basic
    @Column(name = "role_id")
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthUserRoleModel that = (AuthUserRoleModel) o;

        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;
        return userId != null ? userId.equals(that.userId) : that.userId == null;
    }

    @Override
    public int hashCode() {
        int result = roleId != null ? roleId.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }
}
