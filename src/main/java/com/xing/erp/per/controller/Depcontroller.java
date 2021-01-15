package com.xing.erp.per.controller;

import com.xing.erp.com.execption.BusinessException;
import com.xing.erp.com.util.JsonResponseBody;
import com.xing.erp.com.util.PageBean;
import com.xing.erp.com.util.ResponseStatus;
import com.xing.erp.per.model.Dep;
import com.xing.erp.per.serivce.IDepSerivce;
import com.xing.erp.per.serivce.impl.DepSerivceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/dep")
public class Depcontroller {

        @Autowired
        private IDepSerivce depSerivce;

    /**
     * 查询全部部门
      * @param dep
     * @param pageBean
     * @return
     */
    @RequestMapping("/query")
    @ResponseBody
    public JsonResponseBody query(Dep dep, PageBean pageBean) {
        try {
            return depSerivce.query(dep,pageBean);
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_204);
        }
    }



    /**
     * 增加部门
     * @param dep
     * @return
     */
    @RequestMapping("/insert")
    @ResponseBody
    public JsonResponseBody insertDep(Dep dep){
        try {
            return depSerivce.insert(dep);
        } catch (Exception e) {
           throw  new BusinessException(ResponseStatus.STATUS_201);
        }
    }


    /**
     * 删除方法
     * @param uuid
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public JsonResponseBody delDep(Integer uuid) {
        try {
            return depSerivce.deleteByPrimaryKey(uuid);
        } catch (Exception e) {
            throw  new BusinessException(ResponseStatus.STATUS_203);
        }
    }


    /**
     * 修改部门信息
     * @param dep
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public JsonResponseBody updateDep(Dep dep){
        try {
            return depSerivce.updateByPrimaryKey(dep);
        } catch (Exception e) {
            throw  new BusinessException(ResponseStatus.STATUS_201);
        }
    }






}





