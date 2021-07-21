package com.sv.mjxt.web.entity;

import java.util.Date;

/**
 * 车辆通行记录
 */



public class TbVehicleAccess extends BaseEntity{

    private static final long serialVersionUID = 1L;
    private long vehicleId;
    private long acId;
    private String vehiclePlate;
    private String vehicleColor;
    private String stage;
    private Date entryTime;
    private Date outTime;
    private String flagForbidden;
    private String flagUndercontrol;
    private long duration;
    private String direction;
    private String forbidden;
    private String remark;

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public long getAcId() {
        return acId;
    }

    public void setAcId(long acId) {
        this.acId = acId;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public String getFlagForbidden() {
        return flagForbidden;
    }

    public void setFlagForbidden(String flagForbidden) {
        this.flagForbidden = flagForbidden;
    }

    public String getFlagUndercontrol() {
        return flagUndercontrol;
    }

    public void setFlagUndercontrol(String flagUndercontrol) {
        this.flagUndercontrol = flagUndercontrol;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getForbidden() {
        return forbidden;
    }

    public void setForbidden(String forbidden) {
        this.forbidden = forbidden;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
