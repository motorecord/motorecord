/*
*
* Motorcycle.java
* Copyright(C) 2017-2020 fendo公司
* @date 2020-09-25
*/
package io.zbc.motorecord.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Motorcycle {
    /**
     * 车辆ID
     */
    private Integer motorId;

    /**
     * 车辆别名
     */
    private String motorAlias;

    /**
     * 车辆名称
     */
    private String motorName;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 排量（ml）
     */
    private Integer displacement;

    /**
     * 上牌日期
     */
    private LocalDate enrollDate;

    /**
     * 插入时间
     */
    private LocalDateTime insertTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 车辆ID
     * @return motor_id 车辆ID
     */
    public Integer getMotorId() {
        return motorId;
    }

    /**
     * 车辆ID
     * @param motorId 车辆ID
     */
    public void setMotorId(Integer motorId) {
        this.motorId = motorId;
    }

    /**
     * 车辆别名
     * @return motor_alias 车辆别名
     */
    public String getMotorAlias() {
        return motorAlias;
    }

    /**
     * 车辆别名
     * @param motorAlias 车辆别名
     */
    public void setMotorAlias(String motorAlias) {
        this.motorAlias = motorAlias;
    }

    /**
     * 车辆名称
     * @return motor_name 车辆名称
     */
    public String getMotorName() {
        return motorName;
    }

    /**
     * 车辆名称
     * @param motorName 车辆名称
     */
    public void setMotorName(String motorName) {
        this.motorName = motorName;
    }

    /**
     * 品牌
     * @return brand 品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 品牌
     * @param brand 品牌
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 排量（ml）
     * @return displacement 排量（ml）
     */
    public Integer getDisplacement() {
        return displacement;
    }

    /**
     * 排量（ml）
     * @param displacement 排量（ml）
     */
    public void setDisplacement(Integer displacement) {
        this.displacement = displacement;
    }

    /**
     * 上牌日期
     * @return enroll_date 上牌日期
     */
    public LocalDate getEnrollDate() {
        return enrollDate;
    }

    /**
     * 上牌日期
     * @param enrollDate 上牌日期
     */
    public void setEnrollDate(LocalDate enrollDate) {
        this.enrollDate = enrollDate;
    }

    /**
     * 插入时间
     * @return insert_time 插入时间
     */
    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    /**
     * 插入时间
     * @param insertTime 插入时间
     */
    public void setInsertTime(LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}