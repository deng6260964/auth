package com.bdz.base.model;

/**
 * com.bdz.base.model
 * Created by dengjinhui on 2018/2/23.
 */
public enum DelFlagEnum {
    DELETED_YES("已删除","1"),
    DELETED_NO("未删除","0");

    private String name;
    private String value;

    private DelFlagEnum(String name,String value){
        this.name = name;
        this.value = value;
    }
    // 普通方法
    public static String getName(String value) {
        for (DelFlagEnum c : DelFlagEnum.values()) {
            if (c.getValue() == value) {
                return c.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
