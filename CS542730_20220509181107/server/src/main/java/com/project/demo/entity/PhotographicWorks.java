package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *摄影作品：(PhotographicWorks)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "PhotographicWorks")
public class PhotographicWorks implements Serializable {

    //PhotographicWorks编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photographic_works_id")
    private Integer photographic_works_id;
    // 作品名称
    @Basic
    private String work_name;
    // 摄影类型
    @Basic
    private String photography_type;
    // 摄影封面
    @Basic
    private String photographic_cover;
    // 拍摄时间
    @Basic
    private Timestamp shooting_time;
    // 拍摄地点
    @Basic
    private String shooting_location;
    // 摄影师
    @Basic
    private String photographer;
    // 作品详情
    @Basic
    private String work_details;
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
