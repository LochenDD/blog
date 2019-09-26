package com.red.blog.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author red
 * @version 1.00
 * @Date 2019/9/24 13:36
 */

@Getter
@Setter
@ToString
public class User {
    private String name;
    private String password;
    private String salt;
}
