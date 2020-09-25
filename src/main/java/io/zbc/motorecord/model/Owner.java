/*
*
* Owner.java
* Copyright(C) 2017-2020 fendo公司
* @date 2020-09-25
*/
package io.zbc.motorecord.model;

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

    /**
     * 车主
     * @return owner_id 车主
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * 车主
     * @param ownerId 车主
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
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