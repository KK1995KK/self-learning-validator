package com.example.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    PARAM_ERROR("400", "parameter error");
    private String code;
    private String msg;
}
