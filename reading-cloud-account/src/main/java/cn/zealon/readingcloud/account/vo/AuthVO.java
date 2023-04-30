package cn.zealon.readingcloud.account.vo;

import lombok.Data;

/**
 * 认证VO
 */
@Data
public class AuthVO {
    private String token;
    private UserVO user;
}
