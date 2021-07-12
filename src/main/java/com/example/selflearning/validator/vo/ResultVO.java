package com.example.selflearning.validator.vo;

import com.example.enums.ErrorCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO {
    private boolean success;
    private String code;
    private String msg;
    private Object data;

    public static ResultVO success() {
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(true);
        return resultVO;
    }

    public static ResultVO success(Object data) {
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(true);
        resultVO.setData(data);
        return resultVO;
    }

    public static ResultVO fail(ErrorCode code) {
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(false);
        resultVO.setCode(code.getCode());
        resultVO.setMsg(code.getMsg());
        return resultVO;
    }

    public static ResultVO fail(ErrorCode code, Object data) {
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(false);
        resultVO.setCode(code.getCode());
        resultVO.setMsg(code.getMsg());
        resultVO.setData(data);
        return resultVO;
    }

    public boolean isSuccess() {
        return success;
    }
}
