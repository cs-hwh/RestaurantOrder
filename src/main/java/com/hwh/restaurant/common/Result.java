package com.hwh.restaurant.common;

import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hwh
 * @description:统一结果返回类
 * @create 2023-07-29 16:54
 */
public class Result {
    @ApiModelProperty(value = "是否成功")
    private Boolean success;



    @ApiModelProperty(value = "返回码")
    private String code;

    @ApiModelProperty(value = "返回消息")
    private String info;

    @ApiModelProperty(value = "返回数据")
    private Map<String, Object> data = new HashMap<String, Object>();

    private Result(){}

    public static Result ok(){
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(Constants.ResponseCode.SUCCESS.getCode());
        result.setInfo(Constants.ResponseCode.SUCCESS.getInfo());
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(Constants.ResponseCode.UN_ERROR.getCode());
        result.setInfo(Constants.ResponseCode.UN_ERROR.getInfo());
        return result;
    }

    public Result success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public Result message(String message){
        this.setInfo(message);
        return this;
    }

    public Result code(String code){
        this.setCode(code);
        return this;
    }

    public Result data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public Result data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
