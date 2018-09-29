package com.zxtop.cms.commons;

import java.lang.reflect.Field;

public class SqlHelper {
    /**
     * 获得要插入数据库中的字段
     * 此字段名跟实体类的属性名相同
     * 获得的结果例如:id,name,phone
     * @param t
     * @param <T>
     * @return
     */
    public static <T> String getInsertSqlFiled(T t){
        Class tClass = t.getClass();
        Field [] fields = tClass.getDeclaredFields();
        StringBuilder result=new StringBuilder("");
        for (int i=0;i<fields.length;i++){
            if (i!=0){
                result = result.append(result).append(",").append(fields[i].getName());
            }else{
                result=new StringBuilder(fields[i].getName());
            }
        }
        return  result.toString();
    }

    /**
     * 获得要插入到数据库字段的values字符串
     *
     * 例如:#{t.id},#{t.name},#{t.phone}等
     * @param t
     * @param prefix 要拼接的前缀
     * @param <T>
     * @return
     */
    public static <T> String getInsertSqlFiledValues(T t,String prefix){
        Class tClass = t.getClass();
        Field [] fields = tClass.getDeclaredFields();
        StringBuilder result=new StringBuilder("");
        for (int i=0;i<fields.length;i++){
            if (i!=0){
                result = result.append(result).append(",").append("#{ ").append(prefix).append(".").append(fields[i].getName()).append(" }");
            }else{
                result=result.append("#{ ").append(prefix).append(".").append(fields[i].getName()).append(" }");
            }
        }
        return  result.toString();
    }
}
