package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *摄影师：(Photographer)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "Photographer")
public class Photographer implements Serializable {

    //Photographer编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photographer_id")
    private Integer photographer_id;
    // 摄影师姓名
    @Basic
    private String photographer_name;
    // 摄影等级
    @Basic
    private String photographic_grade;
    // 头像
    @Basic
    private String head_portrait;
    // 预约价格
    @Basic
    private String reservation_price;
    // 主摄类型
    @Basic
    private String subject_type;
    // 获奖记录
    @Basic
    private String award_record;
    // 个人简历
    @Basic
    private String curriculum_vitae;
    // 点击数
    @Basic
    private Integer hits;
    // 点赞数
    @Basic
    private Integer praise_len;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
