package com.sv.mjxt.web.entity;

import java.util.Date;

public class TbNonMachineryAccess extends BaseEntity{
    private static final long serialVersionUID = 1L;
    private Long nrmacId;
    private Long nrmId;
    private Long  acId;

    private String direction;
    private Date createTime;


    private String flagForbidden;


    private String reasonForbidden;

    private String reasonRelease;

    public Long getNrmacId() {
        return nrmacId;
    }

    public void setNrmacId(Long nrmacId) {
        this.nrmacId = nrmacId;
    }

    public Long getNrmId() {
        return nrmId;
    }

    public void setNrmId(Long nrmId) {
        this.nrmId = nrmId;
    }

    public Long getAcId() {
        return acId;
    }

    public void setAcId(Long acId) {
        this.acId = acId;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFlagForbidden() {
        return flagForbidden;
    }

    public void setFlagForbidden(String flagForbidden) {
        this.flagForbidden = flagForbidden;
    }

    public String getReasonForbidden() {
        return reasonForbidden;
    }

    public void setReasonForbidden(String reasonForbidden) {
        this.reasonForbidden = reasonForbidden;
    }

    public String getReasonRelease() {
        return reasonRelease;
    }

    public void setReasonRelease(String reasonRelease) {
        this.reasonRelease = reasonRelease;
    }
}
