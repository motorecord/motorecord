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

    public Integer getMotorId() {
        return motorId;
    }

    public void setMotorId(Integer motorId) {
        this.motorId = motorId;
    }

    public String getMotorAlias() {
        return motorAlias;
    }

    public void setMotorAlias(String motorAlias) {
        this.motorAlias = motorAlias;
    }

    public String getMotorName() {
        return motorName;
    }

    public void setMotorName(String motorName) {
        this.motorName = motorName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Integer displacement) {
        this.displacement = displacement;
    }

    public LocalDate getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(LocalDate enrollDate) {
        this.enrollDate = enrollDate;
    }

    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}