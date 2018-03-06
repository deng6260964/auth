package com.bdz.base.dao.impl;

import com.bdz.base.dao.BaseDAO;
import com.bdz.base.model.BaseModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * com.bdz.base.dao.impl
 * Created by dengjinhui on 16/5/15.
 */
public class BaseDAOImpl<M extends BaseModel,QM extends M> implements BaseDAO<M,QM>{

   /* @Autowired
    public SessionFactory sessionFactory;*/


    /*protected Session getSession(){
        Session session = null;
        try{
            return this.sessionFactory.getCurrentSession();
        }catch(Exception e){
            return this.sessionFactory.openSession();
        }
    }*/
    @PersistenceContext
    private EntityManager em;

    @Override
    public void createOrUpdate(M m) {
        em.persist(m);
    }

    @Override
    public void update(M m) {

    }

    @Override
    public void updateCell(M m, String opeCellName) {
        String hql = "update "+m.getClass().getName()+" set "+opeCellName+"=:"+opeCellName+" where uuid=:uuid";
        Map valueMap = new HashMap<String,String>();
        valueMap.put("uuid",m.getUuid());
        valueMap.put(opeCellName,this.getOneFieldValue(m,opeCellName));
        exeHql(hql,valueMap);
    }

    @Override
    public void delete(M var1) {

    }

    @Override
    public void deletes(List<String> var1) {

    }

    @Override
    public M getById(String var1) {
        return null;
    }

    @Override
    public M getByUuid(String var1) {
        return null;
    }

    @Override
    public List<M> getAll() {
        return null;
    }

    @Override
    public List<M> getAll(int var1, int var2) {
        return null;
    }

    @Override
    public List<M> getByCondition(QM var1) {
        return null;
    }

    @Override
    public List<M> getByCondition(QM var1, int var2, int var3) {
        return null;
    }

    @Override
    public List<String> getIdsByCondition(QM qm, int start, int pageShow) {
        return null;
    }

    @Override
    public List<String> getUuidsByCondition(QM var1, int var2, int var3) {
        return null;
    }

    @Override
    public int getCount(QM var1) {
        return 0;
    }

    @Override
    public void setDataDeleteFlag(String var1, int var2) {

    }

    public Object getOneFieldValue(Object obj,String fieldName){
        try{
            Method method = obj.getClass().getMethod("get"+fieldName.substring(0,1).toUpperCase(),new Class[0]);
            return method.invoke(obj,new Object[0]);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    protected void exeHql(String hql, Map<String, Object> mapParams) {
        Query q = em.createQuery(hql);
        Iterator i$ = mapParams.keySet().iterator();

        while(i$.hasNext()) {
            String key = (String)i$.next();
            Object obj = mapParams.get(key);
            if(obj instanceof Object[]) {
                q.setParameter(key, (Object[])obj);
            } else {
                q.setParameter(key, obj);
            }
        }

        q.executeUpdate();
    }
}
