package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *预约信息：(ReservationInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ReservationInformation")
public class ReservationInformation implements Serializable {

    //ReservationInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_information_id")
    private Integer reservation_information_id;
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
    // 预约状态
    @Basic
    private String reservation_status;
    // 预约回复
    @Basic
    private String reservation_reply;
    // 支付状态
    @Basic
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @Basic
    private String pay_type;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
