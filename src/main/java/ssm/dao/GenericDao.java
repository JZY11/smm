package ssm.dao;

import ssm.util.Pagination;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/22.
 * smm.
 */
public interface GenericDao<T extends Serializable, ID extends Number> {

    void create(T t);

    void remove(ID id);

    void remove(String statement, Object parameter);

    void modify(T t);

    void modify(String statement, Object parameter);

    T queryOne(String statement,Object parameter);

    T queryById(ID id);

    List<T> queryList(String statement,Object parameter);

    List<T> queryAll();

    Pagination<T> query(String statement, Object parameter, int currentPage);

    Pagination<T> queryAll(int currentPage);
}
