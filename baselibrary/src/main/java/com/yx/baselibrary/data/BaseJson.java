package com.yx.baselibrary.data;

import java.util.List;

public class BaseJson {

    private boolean success;
    private ErrorBean error;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ErrorBean getError() {
        return error;
    }

    public void setError(ErrorBean error) {
        this.error = error;
    }


    public  class ErrorBean {
        /**
         * code : 701
         * message : 验证码错误
         */
        private ExtraBean extra;
        private int code;
        private String message;
        public ExtraBean getExtra() {
            return extra;
        }

        public void setExtra(ExtraBean extra) {
            this.extra = extra;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }


    }




    public  class ExtraBean {
        private List<String> misKeys;

        public List<String> getMisKeys() {
            return misKeys;
        }

        public void setMisKeys(List<String> misKeys) {
            this.misKeys = misKeys;
        }
    }
}
