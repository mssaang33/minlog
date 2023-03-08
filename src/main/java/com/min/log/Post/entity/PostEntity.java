package com.min.log.Post.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Getter
@Setter
public class PostEntity {

    @Id
    @GeneratedValue
    private Integer post_num;

    private String user_id;

    private String title;

    private Date write_date;

    private String like_count;
}
