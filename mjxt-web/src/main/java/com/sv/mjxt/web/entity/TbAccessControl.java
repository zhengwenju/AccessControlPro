package com.sv.mjxt.web.entity;

public class TbAccessControl extends BaseEntity{

    private static final long serialVersionUID = 1L;
    //门禁id
    private long acId;
    //门禁名称
    private String acName;
    //门禁类型
    private String acType;
    //门禁位置
    private String acLocation;
    //门禁进出类型
    private String inOutType;

    public long getAcId() {
        return acId;
    }

    public void setAcId(long acId) {
        this.acId = acId;
    }

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }

    public String getAcType() {
        return acType;
    }

    public void setAcType(String acType) {
        this.acType = acType;
    }

    public String getAcLocation() {
        return acLocation;
    }

    public void setAcLocation(String acLocation) {
        this.acLocation = acLocation;
    }

    public String getInOutType() {
        return inOutType;
    }

    public void setInOutType(String inOutType) {
        this.inOutType = inOutType;
    }
}
