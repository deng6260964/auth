package com.auth.service.impl;

import com.auth.dao.UserDAO;
import com.auth.model.AuthUserModel;
import com.auth.model.AuthUserQueryModel;
import com.auth.service.UserService;
import com.bdz.base.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * com.auth.service.impl
 * Created by dengjinhui on 16/8/15.
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<AuthUserModel,AuthUserQueryModel> implements UserService{

    @Autowired
    private UserDAO myDao;
    /**
     * 新增user
     * @return
     */
    public AuthUserModel add(AuthUserModel m) {
        myDao.save(m);
        return null;
    }

    /**
     * 修改user
     * @return
     */
    public AuthUserModel update() {
        return null;
    }

    /**
     * 删除user
     */
    public void delete() {

    }
}
