package cn.com.java.core.util;

/**
 * Created by xiaolei on 2017/1/12.
 */

/**
 * 验证工具类
 *
 */
public class Validation {

    /**
     * 判断Object是否为空
     * @param object
     * @return boolean
     */
    public static boolean objectIsNull(Object object){
        if(object == null){
            return  false;
        }else{
            return  true;
        }
    }

}
