package com.zxtop.cms.service.Impl;

import com.zxtop.cms.commons.PageUtil;
import com.zxtop.cms.service.CommonService;
import com.zxtop.cms.service.UserService;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.zxtop.cms.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private CommonService commonService;

    @Override
    public Map<String, Object> getUserList(int currentPage) {
        PageUtil pageUtil=new PageUtil();
        pageUtil.setCurrentPage(currentPage);
        User user=new User();
        int amount = commonService.selectCount(user.getClass(),null);
        pageUtil.setAmount(amount);
        int startIndex=pageUtil.getStartIndex();
        int endIndex=pageUtil.getEndIndex();
        List<Map<String,Object>> userListInfo = commonService.selectList(user.getClass(),startIndex,endIndex,null,null);
        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("pageInfo",userListInfo);
        resultMap.put("amount",amount);
        return  resultMap;
    }
}
