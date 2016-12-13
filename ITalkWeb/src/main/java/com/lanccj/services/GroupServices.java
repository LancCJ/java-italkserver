package com.lanccj.services;

import com.alibaba.fastjson.JSON;
import com.lanccj.manage.model.Group;
import com.lanccj.manage.model.User;
import com.lanccj.services.framework.Responce;
import com.lanccj.services.framework.StateCodes;
import com.lanccj.services.param.GroupParams;
import com.lanccj.services.response.GroupResponse;
import com.lanccj.services.response.LoginResponse;
import com.lanccj.util.MyUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.UUID;

/**
 * Created by lanccj on 16/12/13.
 */
public class GroupServices {
    private static Logger logger = LogManager.getLogger("GroupServices");

    /**
     *查询组
     */
    public Responce list(HttpServletRequest request, HttpServletResponse response){
        Responce responce=new Responce();
        String ParamsJson= MyUtils.getBodyContent(request);
            GroupParams Params= JSON.parseObject(ParamsJson, GroupParams.class);
            List<Group> groups=Group.dao.find("select * from group where 1=1 ");

            if(groups.size()>0){
                GroupResponse groupResponse=new GroupResponse();
                groupResponse.setGroups(groups);
                responce.setData(groupResponse);
                responce.setCode(StateCodes.SUCCESS);
            }else{
                responce.setCode(StateCodes.USER_LOGIN_PARAMS_USERNAMENOTMATCHPWD);
            }
        logger.info("查询组返回JOSN:"+responce.toString());
        return responce;
    }



}
