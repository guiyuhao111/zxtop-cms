package com.zxtop.cms.service;

import java.util.List;
import java.util.Map;

/**
 * 创建一个增删改查的公共服务
 * 用于简化日常查询操作
 */
public interface CommonService {
    //1.查询列表-查询统一返回List<Map<String,Object>>对象
    List<Map<String,Object>> selectList(Class t,int startIndex,int endIndex,String orderBy,String where);
    <T> int addObject(T t);

    /**
     * 总数查询
     * @param t
     * @param where
     * @return
     */
    int selectCount(Class t,String where);
}
