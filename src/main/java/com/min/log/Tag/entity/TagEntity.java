package com.min.log.Tag.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class TagEntity {

    @Id
    @GeneratedValue
    private Integer post_num;

    private String tag;

}
