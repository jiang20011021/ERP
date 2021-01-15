package com.xing.erp.per.controller;

import com.xing.erp.com.execption.BusinessException;
import com.xing.erp.com.util.JsonResponseBody;
import com.xing.erp.com.util.PageBean;
import com.xing.erp.com.util.ResponseStatus;
import com.xing.erp.per.model.SysEmp;
import com.xing.erp.per.serivce.ISysEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/emp")
public class Sysempcontroller  {

    @Autowired
    private ISysEmpService ISysEmpService;

    /**
     * 分页查询全部员工
     * @param sysEmp
     * @return
     */
    @RequestMapping("/querypager")
    @ResponseBody
    public JsonResponseBody querypager(SysEmp sysEmp,PageBean pageBean) {
        try {
            return ISysEmpService.querypager(sysEmp,pageBean);
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_204);
        }
    }

    /**
     * 增加员工
     * @param sysEmp
     * @return
     */
    @RequestMapping("/insert")
    @ResponseBody
    public JsonResponseBody insertDep(SysEmp sysEmp){

        try {
            return ISysEmpService.insert(sysEmp);
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_201);
        }
    }


    /**
     * 删除员工
     * @param uuid
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public JsonResponseBody delSysEmp(Integer uuid) {
        try {
            return ISysEmpService.deleteByPrimaryKey(uuid);
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_203);
        }
    }


    /**
     * 修改员工信息
     * @param sysEmp
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public JsonResponseBody updateDep(SysEmp sysEmp){
        try {
            return ISysEmpService.updateByPrimaryKey(sysEmp);
        } catch (Exception e) {
            throw new BusinessException(ResponseStatus.STATUS_201);
        }
    }






}
