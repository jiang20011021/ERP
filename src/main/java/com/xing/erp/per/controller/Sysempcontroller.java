package com.xing.erp.per.controller;

import com.xing.erp.com.util.JsonResponseBody;
import com.xing.erp.com.util.PageBean;
import com.xing.erp.com.util.ResponseStatus;
import com.xing.erp.per.model.SysEmp;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/emp")
public class Sysempcontroller  {

    @Resource
    private com.xing.erp.per.serivce.ISysEmpService ISysEmpService;

    /**
     * 分页查询全部员工
     * @param sysEmp
     * @param pageBean
     * @return
     */
    @RequestMapping("/querypager")
    public Map<String,Object> query(SysEmp sysEmp) {
        PageBean pageBean = new PageBean();
        List<SysEmp> sysEmps = ISysEmpService.querypager(sysEmp,pageBean);
        Map<String,Object> map=new HashMap<>();
        map.put("rwos",sysEmps);
        map.put("tatol",pageBean.getTotal());
        return map;
    }

    /**
     * 增加员工
     * @param sysEmp
     * @return
     */
    @RequestMapping("/insert")
    public Map<String,Object> insertDep(SysEmp sysEmp){
        int i = ISysEmpService.insert(sysEmp);
        Map<String,Object> json=new HashMap<>();
        if(i!=0){
            json.put("msg","增加员工成功！！");
        }else{
            json.put("msg","增加失败！！");
        }
        return json;
    }


    /**
     * 删除员工
     * @param uuid
     * @return
     */
    @RequestMapping("/delete")
    public Map<String,Object> delSysEmp(Integer uuid) {
        int i = ISysEmpService.deleteByPrimaryKey(uuid);
        Map<String,Object> json=new HashMap<>();
        if(i!=0){
            json.put("msg","删除员工成功！！");
            json.put("i",i);
        }else{
            json.put("msg","删除失败！！");
            json.put("i",i);
        }
        return json;
    }


    /**
     * 修改员工信息
     * @param sysEmp
     * @return
     */
    @RequestMapping("/update")
    public Map<String,Object> updateDep(SysEmp sysEmp){
        int i = ISysEmpService.updateByPrimaryKey(sysEmp);
        Map<String,Object> json=new HashMap<>();
        if(i!=0){
            json.put("msg","修改员工信息成功！！");
        }else{
            json.put("msg","修改失败！！");
        }
        return json;
    }






}
