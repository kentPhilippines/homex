package com.ruoyi.framework.security;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户登录对象
 *
 * @author ruoyi
 */
@ApiModel(value="用户登录对象",description="用户登录对象")
public class LoginBody {
    /**
     * 用户名
     */
    @ApiModelProperty(example = "用户名")
    private String username;

    /**
     * 用户密码
     */
    @ApiModelProperty(example = "用户密码")
    private String password;

    /**
     * 验证码
     */
    @ApiModelProperty(example = "验证码")
    private String code;

    /**
     * 唯一标识
     */
    private String uuid = "";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
