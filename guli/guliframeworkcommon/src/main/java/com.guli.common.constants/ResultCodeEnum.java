package com.guli.common.constants;

import lombok.Getter;
@Getter
//返回数据统一处理的枚举类
public enum ResultCodeEnum {
    SUCCESS(true, 20000,"成功"),
    BAD_SQL_GRAMMAR(false, 21001, "sql语法错误"),
    JSON_PARSE_ERROR(false, 21002, "json解析异常"),
    PARAM_ERROR(false, 21003,"参数不合法"),
    UNKNOWN_REASON(false, 20001, "未知错误");
    private Boolean success;
    private Integer code;
    private String message;
    private ResultCodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
