package com.xing.erp.per.controller;

import com.xing.erp.com.util.PageBean;
import com.xing.erp.per.model.Dep;
import com.xing.erp.per.serivce.impl.DepSerivceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/dep")
public class Depcontroller {

        @Resource
        private DepSerivceImpl depSerivce;

    /**
     * 查询全部部门
      * @param dep
     * @param pageBean
     * @return
     */
    @RequestMapping("/querypager")
    public Map<String,Object> query(Dep dep, PageBean pageBean) {
        List<Dep> deps = depSerivce.querypager(dep,pageBean);
        Map<String,Object> map=new HashMap<>();
        map.put("rwos",deps);
        map.put("tatol",pageBean.getTotal());
        return map;
    }



    /**
     * 增加部门
     * @param dep
     * @return
     */
    @RequestMapping("/insert")
    public Map<String,Object> insertDep(Dep dep){
        int i = depSerivce.insert(dep);
        Map<String,Object> json=new HashMap<>();
        if(i!=0){
            json.put("msg","增加部门成功！！");
        }else{
            json.put("msg","增加失败！！");
        }
        return json;
    }


    /**
     * 删除方法
     * @param uuid
     * @return
     */
    @RequestMapping("/delete")
    public Map<String,Object> delDep(Integer uuid) {
        int i = depSerivce.deleteByPrimaryKey(uuid);
        Map<String,Object> json=new HashMap<>();
        if(i!=0){
            json.put("msg","删除部门成功！！");
            json.put("i",i);
        }else{
            json.put("msg","删除失败！！");
            json.put("i",i);
        }
        return json;
    }


    /**
     * 修改部门信息
     * @param dep
     * @return
     */
    @RequestMapping("/update")
    public Map<String,Object> updateDep(Dep dep){
        int i = depSerivce.updateByPrimaryKey(dep);
        Map<String,Object> json=new HashMap<>();
        if(i!=0){
            json.put("msg","修改部门信息成功！！");
        }else{
            json.put("msg","修改失败！！");
        }
        return json;
    }






}





