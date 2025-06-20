package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *取消预约：(CancelReservation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CancelReservation")
public class CancelReservation implements Serializable {

    //CancelReservation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cancel_reservation_id")
    private Integer cancel_reservation_id;
    // 摄影师姓名
    @Basic
    private String photographer_name;
    // 摄影等级
    @Basic
    private String photographic_grade;
    // 预约价格
    @Basic
    private String reservation_price;
    // 用户
    @Basic
    private Integer user;
    // 预约时间
    @Basic
    private Timestamp time_of_appointment;
    // 摄影地点
    @Basic
    private String photography_location;
    // 取消原因
    @Basic
    private String cancellation_reason;
    // 审核状态
    @Basic
    private String examine_state;
    // 审核回复
    @Basic
    private String examine_reply;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
