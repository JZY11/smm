package ssm.dao;

import java.io.Serializable;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/22.
 * smm.
 */
public interface GenericDao<T extends Serializable, ID extends Number> {

    void create(T t);

    void remove(ID id);

    void modify(T t);

    T query(String statement,Object parameter);
}
