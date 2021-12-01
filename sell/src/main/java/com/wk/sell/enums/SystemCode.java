package com.wk.sell.enums;

import lombok.Getter;

@Getter
public enum SystemCode implements CodeEnum {

    SUCCESS( false , 0, "成功")

    ;

    private boolean printFlag;
    private Integer code;
    private String msg;

    SystemCode(boolean printFlag, Integer code, String msg) {
        this.printFlag = printFlag;
        this.code = code;
        this.msg = msg;
    }

}
