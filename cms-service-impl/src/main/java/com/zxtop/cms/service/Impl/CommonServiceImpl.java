package com.zxtop.cms.service.Impl;

import com.zxtop.cms.commons.SqlHelper;
import com.zxtop.cms.commons.StringUtil;
import com.zxtop.cms.dao.CommonDao;
import com.zxtop.cms.service.CommonService;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class CommonServiceImpl implements CommonService {
    @Resource
    private CommonDao commonDao;
    /**
     * select * from Class
     * @param t
     * @return
     */
    @Override
    public List<Map<String, Object>> selectList(Class t, int startIndex, int endIndex, String orderBy, String where) {
        if (where==null){
            where="";
        }
        if (orderBy==null){
            orderBy="";
        }
        String tableName = "["+StringUtil.toLowerCaseFirstOne(t.getSimpleName())+"]";
        return commonDao.selectList(tableName,startIndex,endIndex,where,orderBy);
    }

    @Override
    public <T> int addObject(T t) {
        String sqlField=SqlHelper.getInsertSqlFiled(t);
        String values=SqlHelper.getInsertSqlFiledValues(t,"t");
        String tableName = "["+StringUtil.toLowerCaseFirstOne(t.getClass().getSimpleName())+"]";
        return commonDao.addObject(tableName,t,sqlField,values);
    }

    @Override
    public int selectCount(Class t, String where) {
        String tableName = "["+StringUtil.toLowerCaseFirstOne(t.getSimpleName())+"]";
        if (where==null){
            where="";
        }
        return commonDao.selectCount(tableName,where);
    }
}
