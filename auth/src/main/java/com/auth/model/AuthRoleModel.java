package com.auth.model;

import com.bdz.base.model.BaseModel;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

/**
 * com.auth.model
 * Created by dengjinhui on 2017/12/20.
 */
@Entity
@Table(name = "auth_role", schema = "auth", catalog = "")
public class AuthRoleModel extends BaseModel {
    private String roleName;

    @Basic
    @Column(name = "role_name")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthRoleModel that = (AuthRoleModel) o;
        return Objects.equals(roleName, that.roleName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(roleName);
    }
}
