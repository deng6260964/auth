package com.auth.service;

import com.auth.model.AuthUserModel;

/**
 * com.auth.service
 * Created by dengjinhui on 16/8/15.
 */
public interface UserService {
    public AuthUserModel add(AuthUserModel m);
    public AuthUserModel update();
    public void delete();
}
