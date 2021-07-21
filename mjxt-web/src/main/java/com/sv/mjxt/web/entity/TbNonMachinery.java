package com.sv.mjxt.web.entity;

import java.util.Date;

public class TbNonMachinery {
    private Long nrmId;

    private String envCode;
    private Date productDate;


    private String stage;

    /**
     * 机械环保代码
     */
    private String menvCode;

    private String engineBrand;


    private String flagInternal;
    private Date createTime;
    private String producedCountry;
    /**
     * 机械类型
     */
    private String type;

    public Long getNrmId() {
        return nrmId;
    }

    public void setNrmId(Long nrmId) {
        this.nrmId = nrmId;
    }

    public String getEnvCode() {
        return envCode;
    }

    public void setEnvCode(String envCode) {
        this.envCode = envCode;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getMenvCode() {
        return menvCode;
    }

    public void setMenvCode(String menvCode) {
        this.menvCode = menvCode;
    }

    public String getEngineBrand() {
        return engineBrand;
    }

    public void setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
    }

    public String getFlagInternal() {
        return flagInternal;
    }

    public void setFlagInternal(String flagInternal) {
        this.flagInternal = flagInternal;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getProducedCountry() {
        return producedCountry;
    }

    public void setProducedCountry(String producedCountry) {
        this.producedCountry = producedCountry;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
