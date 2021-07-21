package com.sv.mjxt.web.entity;



import java.util.Date;

public class TbEmergencyResponse extends  BaseEntity{

    private static final long serialVersionUID = 1L;
    private long erId;
    private String erLevel;
    private Date erStartTime;
    private Date erEndTime;
    private String status;

    public long getErId() {
        return erId;
    }

    public void setErId(long erId) {
        this.erId = erId;
    }

    public String getErLevel() {
        return erLevel;
    }

    public void setErLevel(String erLevel) {
        this.erLevel = erLevel;
    }

    public Date getErStartTime() {
        return erStartTime;
    }

    public void setErStartTime(Date erStartTime) {
        this.erStartTime = erStartTime;
    }

    public Date getErEndTime() {
        return erEndTime;
    }

    public void setErEndTime(Date erEndTime) {
        this.erEndTime = erEndTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
