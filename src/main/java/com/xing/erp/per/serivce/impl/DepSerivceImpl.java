package com.xing.erp.per.serivce.impl;

import com.xing.erp.com.util.JsonResponseBody;
import com.xing.erp.com.util.PageBean;
import com.xing.erp.com.util.ResponseStatus;
import com.xing.erp.per.mapper.DepMapper;
import com.xing.erp.per.model.Dep;
import com.xing.erp.per.serivce.IDepSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepSerivceImpl implements IDepSerivce {

    @Autowired
    private DepMapper depMapper;

    @Override
    public JsonResponseBody<?> deleteByPrimaryKey(Integer uuid) {
        int i=depMapper.deleteByPrimaryKey(uuid);
        if (i<1){
            return new JsonResponseBody<>(ResponseStatus.STATUS_203);
        }
        return new JsonResponseBody<>();
    }

    @Override
    public JsonResponseBody<?> insert(Dep record) {
        int i=depMapper.insert(record);
        if (i<1){
            return new JsonResponseBody<>(ResponseStatus.STATUS_203);
        }
        return new JsonResponseBody<>();
    }

    @Override
    public JsonResponseBody<?> insertSelective(Dep record) {
        int i=depMapper.insertSelective(record);
        if (i<1){
            return new JsonResponseBody<>(ResponseStatus.STATUS_203);
        }
        return new JsonResponseBody<>();
    }

    @Override
    public JsonResponseBody<?> selectByPrimaryKey(Integer uuid) {
        Dep dep = depMapper.selectByPrimaryKey(uuid);
        if(null==dep)
            return new JsonResponseBody<>(ResponseStatus.STATUS_202);
        return new JsonResponseBody<>(dep);
    }

    @Override
    public JsonResponseBody<?> updateByPrimaryKeySelective(Dep record) {
        int i=depMapper.updateByPrimaryKeySelective(record);
        if (i<1){
            return new JsonResponseBody<>(ResponseStatus.STATUS_203);
        }
        return new JsonResponseBody<>();
    }

    @Override
    public JsonResponseBody<?> updateByPrimaryKey(Dep record) {
        int i=depMapper.updateByPrimaryKey(record);
        if (i<1){
            return new JsonResponseBody<>(ResponseStatus.STATUS_203);
        }
        return new JsonResponseBody<>();
    }

    @Override
    public JsonResponseBody<?> query(Dep dep, PageBean pageBean) {
        List<Dep> query = depMapper.query(dep);
        return new JsonResponseBody<>(query);
    }

}
