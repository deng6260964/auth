package com.bdz.base.service.impl;

import com.bdz.base.dao.BaseDAO;
import com.bdz.base.model.BaseModel;
import com.bdz.base.model.DelFlagEnum;
import com.bdz.base.service.BaseService;

/**
 * com.bdz.base.service.impl
 * Created by dengjinhui on 2017/12/26.
 */
public class BaseServiceImpl<M,QM extends M> implements BaseService{

    private BaseDAO baseDAO;

    public BaseModel add(BaseModel m) {
        m.setDelFlag(DelFlagEnum.DELETED_NO.getValue());
        m.setOpeDate();
        return null;
    }


}
