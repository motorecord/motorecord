package io.zbc.motorecord.entity;

import java.time.LocalDateTime;

public class Owner {
    /**
     * 车主
     */
    private Integer ownerId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 车辆ID
     */
    private Integer motorId;

    /**
     * 插入时间
     */
    private LocalDateTime insertTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMotorId() {
        return motorId;
    }

    public void setMotorId(Integer motorId) {
        this.motorId = motorId;
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