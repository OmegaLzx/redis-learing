package com.yada.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author zexuan.Li
 * @date 2021/6/1
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResultData<T> {
    private String code;
    private String msg;
    private T      data;

    public static ResultData<String> success(String data) {
        return new ResultData<>("200", "SUCCESS", data);
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
