package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *摄影分类：(PhotographicClassification)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "PhotographicClassification")
public class PhotographicClassification implements Serializable {

    //PhotographicClassification编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photographic_classification_id")
    private Integer photographic_classification_id;
    // 摄影类型
    @Basic
    private String photography_type;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
