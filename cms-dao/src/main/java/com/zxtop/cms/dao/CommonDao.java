package com.zxtop.cms.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CommonDao {
    List<Map<String,Object>> selectList(
            @Param(value = "tableName") String tableName,
            @Param(value = "startIndex") int startIndex,
            @Param(value = "endIndex") int endIndex,
            @Param(value="where") String where,
            @Param(value = "orderBy") String orderBy);

    <T> int addObject(
            @Param(value = "tableName") String tableName,
            @Param(value = "t") T t,
            @Param(value = "sqlFileds") String sqlFileds,
            @Param(value = "values")String values
    );
    int selectCount(@Param(value = "tableName") String tableName,@Param(value = "where") String where);
}
