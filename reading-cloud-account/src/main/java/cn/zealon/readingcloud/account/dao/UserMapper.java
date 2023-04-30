package cn.zealon.readingcloud.account.dao;

import cn.zealon.readingcloud.common.pojo.account.User;

/**
 * 用户
 */
public interface UserMapper {

    int insert(User user);

    int updateByLoginName(User user);

    User selectByLoginName(String loginName);

}
