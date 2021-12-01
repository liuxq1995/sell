package com.wk.sell.utils;

import com.wk.sell.enums.CodeEnum;

import java.util.UUID;

/**
 * Description:
 *获取返回码
 */
public class EnumUtil {
    public static <T extends CodeEnum>T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (each.getCode().equals(code)) {
                return each;
            }
        }
        return null;
    }
}
