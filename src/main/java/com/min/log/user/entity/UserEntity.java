package com.min.log.user.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue
    private Integer user_num;

    private String user_id;

    private String email;

    private String name;

    private String decription;

    private String subscribe;

}
