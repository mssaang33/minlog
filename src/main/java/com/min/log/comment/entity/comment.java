package com.min.log.comment.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class comment {

    @Id
    @GeneratedValue
    private Integer com_num;

    private String user_id;

    private String comment;

    private String com_ord;

    private Integer com_group;
}
