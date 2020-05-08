package com.yx.usercenter.data;


import com.yx.baselibrary.data.BaseJson;

import java.io.Serializable;

public class LoginUserEntity extends BaseJson implements Serializable {


    /**
     * payload : {"userId":"10000020","nickName":"","name":"","idCardNo":"","state":"","phone":"1326683****","email":"","status":"1","inviteUserId":"0","inviteCode":"G51MBT27","avatar":"/data/apps/account-service/public/image/default.jpg","lastLoginTime":"0","lastLoginIp":"","createTime":"1524649697","updateTime":"0","remark":"","regType":"1","bankCardNo":""}
     */

    private PayloadBean payload;

    public PayloadBean getPayload() {
        return payload;
    }

    public void setPayload(PayloadBean payload) {
        this.payload = payload;
    }

    public static class PayloadBean {
        /**
         * userId : 10000020
         * nickName :
         * name :
         * idCardNo :
         * state :
         * phone : 1326683****
         * email :
         * status : 1
         * inviteUserId : 0
         * inviteCode : G51MBT27
         * avatar : /data/apps/account-service/public/image/default.jpg
         * lastLoginTime : 0
         * lastLoginIp :
         * createTime : 1524649697
         * updateTime : 0
         * remark :
         * regType : 1
         * bankCardNo :
         */

        private String userId;
        private String nickName;
        private String name;
        private String idCardNo;
        private String state;
        private String phone;
        private String email;
        private String status;
        private String inviteUserId;
        private String inviteCode;
        private String avatar;
        private String lastLoginTime;
        private String lastLoginIp;
        private String createTime;
        private String updateTime;
        private String remark;
        private String regType;
        private String bankCardNo;
        //"isBindGa":"1"绑定0//没有绑定
        private int isBindGa;
        public String getUserId() {
            return userId;
        }

        public int getIsBindGa() {
            return isBindGa;
        }

        public void setIsBindGa(int isBindGa) {
            this.isBindGa = isBindGa;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIdCardNo() {
            return idCardNo;
        }

        public void setIdCardNo(String idCardNo) {
            this.idCardNo = idCardNo;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getInviteUserId() {
            return inviteUserId;
        }

        public void setInviteUserId(String inviteUserId) {
            this.inviteUserId = inviteUserId;
        }

        public String getInviteCode() {
            return inviteCode;
        }

        public void setInviteCode(String inviteCode) {
            this.inviteCode = inviteCode;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getLastLoginTime() {
            return lastLoginTime;
        }

        public void setLastLoginTime(String lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
        }

        public String getLastLoginIp() {
            return lastLoginIp;
        }

        public void setLastLoginIp(String lastLoginIp) {
            this.lastLoginIp = lastLoginIp;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRegType() {
            return regType;
        }

        public void setRegType(String regType) {
            this.regType = regType;
        }

        public String getBankCardNo() {
            return bankCardNo;
        }

        public void setBankCardNo(String bankCardNo) {
            this.bankCardNo = bankCardNo;
        }
    }
}
