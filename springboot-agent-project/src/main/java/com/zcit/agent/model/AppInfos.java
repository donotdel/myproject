package com.zcit.agent.model;

import java.util.Date;

public class AppInfos {
    private Integer id;

    private Integer bossId;

    private String appName;

    private Integer registerMaxnum;

    private Integer accountMaxage;

    private Integer validDate;

    private Integer jobLimit;

    private String unvalidLimit;

    private String defaultLimit;

    private String serviceQq;

    private String serviceWechat;

    private String servicePhone;

    private Date createTime;

    private String createUsercode;

    private Date operateTime;

    private String operator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBossId() {
        return bossId;
    }

    public void setBossId(Integer bossId) {
        this.bossId = bossId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public Integer getRegisterMaxnum() {
        return registerMaxnum;
    }

    public void setRegisterMaxnum(Integer registerMaxnum) {
        this.registerMaxnum = registerMaxnum;
    }

    public Integer getAccountMaxage() {
        return accountMaxage;
    }

    public void setAccountMaxage(Integer accountMaxage) {
        this.accountMaxage = accountMaxage;
    }

    public Integer getValidDate() {
        return validDate;
    }

    public void setValidDate(Integer validDate) {
        this.validDate = validDate;
    }

    public Integer getJobLimit() {
        return jobLimit;
    }

    public void setJobLimit(Integer jobLimit) {
        this.jobLimit = jobLimit;
    }

    public String getUnvalidLimit() {
        return unvalidLimit;
    }

    public void setUnvalidLimit(String unvalidLimit) {
        this.unvalidLimit = unvalidLimit == null ? null : unvalidLimit.trim();
    }

    public String getDefaultLimit() {
        return defaultLimit;
    }

    public void setDefaultLimit(String defaultLimit) {
        this.defaultLimit = defaultLimit == null ? null : defaultLimit.trim();
    }

    public String getServiceQq() {
        return serviceQq;
    }

    public void setServiceQq(String serviceQq) {
        this.serviceQq = serviceQq == null ? null : serviceQq.trim();
    }

    public String getServiceWechat() {
        return serviceWechat;
    }

    public void setServiceWechat(String serviceWechat) {
        this.serviceWechat = serviceWechat == null ? null : serviceWechat.trim();
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone == null ? null : servicePhone.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUsercode() {
        return createUsercode;
    }

    public void setCreateUsercode(String createUsercode) {
        this.createUsercode = createUsercode == null ? null : createUsercode.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}