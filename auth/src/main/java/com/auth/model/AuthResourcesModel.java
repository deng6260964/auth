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
@Table(name = "auth_resources", schema = "auth", catalog = "")
public class AuthResourcesModel extends BaseModel {

    private String resourcesName;
    private String resourcesUrl;

    @Basic
    @Column(name = "resources_name")
    public String getResourcesName() {
        return resourcesName;
    }

    public void setResourcesName(String resourcesName) {
        this.resourcesName = resourcesName;
    }

    @Basic
    @Column(name = "resources_url")
    public String getResourcesUrl() {
        return resourcesUrl;
    }

    public void setResourcesUrl(String resourcesUrl) {
        this.resourcesUrl = resourcesUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthResourcesModel that = (AuthResourcesModel) o;

        if (resourcesName != null ? !resourcesName.equals(that.resourcesName) : that.resourcesName != null)
            return false;
        return resourcesUrl != null ? resourcesUrl.equals(that.resourcesUrl) : that.resourcesUrl == null;
    }

    @Override
    public int hashCode() {
        int result = resourcesName != null ? resourcesName.hashCode() : 0;
        result = 31 * result + (resourcesUrl != null ? resourcesUrl.hashCode() : 0);
        return result;
    }
}
