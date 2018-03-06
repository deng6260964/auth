package com.bdz.base.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * com.auth.model
 * Created by dengjinhui on 2017/12/20.
 */
@MappedSuperclass
public class BaseModel implements Serializable{
    @Id
    @GeneratedValue(generator = "paymentableGenerator")
    @GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
    private String uuid;
    private String ope;
    @Column(name = "ope_date")
    private String opeDate;
    @Column(name = "del_flag")
    private String delFlag;


    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOpeDate() {
        return opeDate;
    }

    public void setOpeDate(String opeDate) {
        this.opeDate = opeDate;
    }

    public String getOper() {
        return ope;
    }

    public void setOper(String oper) {
        this.ope = oper;
    }
}
