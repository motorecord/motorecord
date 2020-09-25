/*
*
* Motorecord.java
* Copyright(C) 2017-2020 fendo公司
* @date 2020-09-25
*/
package io.zbc.motorecord.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Motorecord {
    /**
     * 记录ID
     */
    private Integer recordId;

    /**
     * 花费
     */
    private BigDecimal recordCost;

    /**
     * 类型
     */
    private String recordType;

    /**
     * 时间
     */
    private LocalDateTime recordTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 车辆ID
     */
    private Integer motorId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 插入时间
     */
    private LocalDateTime insertTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 记录ID
     * @return record_id 记录ID
     */
    public Integer getRecordId() {
        return recordId;
    }

    /**
     * 记录ID
     * @param recordId 记录ID
     */
    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    /**
     * 花费
     * @return record_cost 花费
     */
    public BigDecimal getRecordCost() {
        return recordCost;
    }

    /**
     * 花费
     * @param recordCost 花费
     */
    public void setRecordCost(BigDecimal recordCost) {
        this.recordCost = recordCost;
    }

    /**
     * 类型
     * @return record_type 类型
     */
    public String getRecordType() {
        return recordType;
    }

    /**
     * 类型
     * @param recordType 类型
     */
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    /**
     * 时间
     * @return record_time 时间
     */
    public LocalDateTime getRecordTime() {
        return recordTime;
    }

    /**
     * 时间
     * @param recordTime 时间
     */
    public void setRecordTime(LocalDateTime recordTime) {
        this.recordTime = recordTime;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

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
     * 用户ID
     * @return user_id 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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