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

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public BigDecimal getRecordCost() {
        return recordCost;
    }

    public void setRecordCost(BigDecimal recordCost) {
        this.recordCost = recordCost;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public LocalDateTime getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(LocalDateTime recordTime) {
        this.recordTime = recordTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getMotorId() {
        return motorId;
    }

    public void setMotorId(Integer motorId) {
        this.motorId = motorId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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