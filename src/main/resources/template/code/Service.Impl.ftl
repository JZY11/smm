package ${package}.service.impl;

import ${package}.model.${model};
import ${package}.service.${model}Service;
import ${package}.dao.GenericDao;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Service
public class ${model}ServiceImpl extends GenericServiceImpl<${model}, ${PK}> implements ${model}Service {

    @Override
    @Autowired
    @Qualifier("${model?uncap_first}DaoImpl")//指定将来自动装配进来的具体的类型是当前模型类的一个Dao的一个实现类将其赋值给父类的GenericDao
    void setGenericDao(GenericDao<${model}, ${PK}> genericDao) {
        super.genericDao = genericDao;
    }
}