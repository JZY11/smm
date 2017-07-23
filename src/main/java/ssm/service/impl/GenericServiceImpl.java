package ssm.service.impl;

import ssm.dao.GenericDao;
import ssm.service.GenericService;
import ssm.util.Pagination;

import java.io.Serializable;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/23.
 * smm.
 */
public abstract class GenericServiceImpl<T extends Serializable, ID extends Number> implements GenericService<T, ID>{

    //GenericServiceImpl依赖于GenericDao接口
    GenericDao<T, ID> genericDao;
    // 然后做其的一个抽象的set方法，genericDao将会在泛型的服务类的实现类的子类中被实例化
    abstract void setGenericDao(GenericDao<T, ID> genericDao);

    @Override
    public void create(T t) {
        genericDao.create(t);
    }

    @Override
    public void remove(ID id) {
        genericDao.remove(id);
    }

    @Override
    public void remove(String statement, Object parameter) {
        genericDao.remove(statement, parameter);
    }

    @Override
    public void modify(T t) {
        genericDao.modify(t);
    }

    @Override
    public void modify(String statement, Object parameter) {
        genericDao.modify(statement, parameter);
    }

    @Override
    public T query(String statement, Object parameter) {
        return genericDao.query(statement, parameter);
    }

    @Override
    public T queryById(ID id) {
        return genericDao.queryById(id);
    }

    @Override
    public Pagination<T> query(String statement, Object parameter, int currentPage) {
        return genericDao.query(statement, parameter, currentPage);
    }

    @Override
    public Pagination<T> queryAll(int currentPage) {
        return genericDao.queryAll(currentPage);
    }
}
