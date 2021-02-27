package org.ecoding.limesicommon.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@ToString
public class User implements Serializable {
    //主键
    private Integer id;
    //实名
    private String realname;
    //昵称
    private String nickname;
    //登录账号
    private String loginname;
    // 密码
    private String password;
    //电话
    private String phone;
    //区号
    private String phonePrefix;
    //常用地址
    private String address;
    //户籍所在地
    private String domicileLocation;
    //性别 1男 2女
    private Integer sex;
    //部门id
    private Integer departmentId;
    //是否可用 1可用 0 不可以用
    private Integer enable;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;
}
