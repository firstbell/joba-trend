package com.plus1250.jobaTrend.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

    @Id
    @Column(name="user_id")
    private String userId;

    @Column(name="user_email")
    private String userEmail;

    @Column(name="user_pw")
    private String userPw;
}
