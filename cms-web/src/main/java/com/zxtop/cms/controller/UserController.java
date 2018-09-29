package com.zxtop.cms.controller;

import com.zxtop.cms.commons.JsonResult;
import com.zxtop.cms.service.CommonService;
import com.zxtop.cms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("getUserList")
    @ResponseBody
    public JsonResult getUserList(int currentPage){
        return new JsonResult(userService.getUserList(currentPage));
    }
}
