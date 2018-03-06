package com.auth.dao;

import com.auth.model.AuthUserModel;
import org.springframework.data.repository.CrudRepository;

/**
 * com.auth.dao
 * Created by dengjinhui on 2017/12/24.
 */

public interface UserDAO extends CrudRepository<AuthUserModel,String>{
}
