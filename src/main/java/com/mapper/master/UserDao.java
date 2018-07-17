package com.mapper.master;

import com.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author: will
 * @Date: 2018/7/12 17:09
 * @Description:
 */
public interface UserDao {
    /**
     * 根据用户名获取用户信息
     *
     * @param userName
     * @return
     */
    User findByName(@Param("userName") String userName);
}
