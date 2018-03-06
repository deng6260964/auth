package com.bdz.base.dao;

import com.bdz.base.model.BaseModel;

import java.util.List;

/**
 * DAO基类
 * com.bdz.base.dao
 * Created by dengjinhui on 16/5/15.
 */
public interface BaseDAO<M extends BaseModel, QM extends M> {
    void createOrUpdate(M m);

    void update(M m);

    void updateCell(M m, String opeCellName);

    void delete(M m);

    void deletes(List<String> ids);

    M getById(String var1);

    M getByUuid(String var1);

    List<M> getAll();

    List<M> getAll(int start, int pageShow);

    List<M> getByCondition(QM qm);

    List<M> getByCondition(QM qm, int start, int pageShow);

    List<String> getIdsByCondition(QM qm, int start, int pageShow);

    List<String> getUuidsByCondition(QM var1, int var2, int var3);

    int getCount(QM qm);

    void setDataDeleteFlag(String var1, int var2);
}
