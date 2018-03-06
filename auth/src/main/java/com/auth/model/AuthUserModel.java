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
@Table(name = "auth_user", schema = "auth", catalog = "")
public class AuthUserModel extends BaseModel {
    private String loginName;
    private String password;

    @Basic
    @Column(name = "login_name")
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthUserModel that = (AuthUserModel) o;

        if (loginName != null ? !loginName.equals(that.loginName) : that.loginName != null) return false;
        return password != null ? password.equals(that.password) : that.password == null;
    }

    @Override
    public int hashCode() {
        int result = loginName != null ? loginName.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
