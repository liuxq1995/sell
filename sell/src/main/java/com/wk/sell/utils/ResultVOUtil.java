package com.wk.sell.utils;

import com.wk.sell.VO.ResultVO;
import com.wk.sell.enums.SystemCode;

/**
 * Description:
 *
 * @author LXQ
 * @create 2020/6/4
 * @since 1.0.0
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(SystemCode.SUCCESS.getCode());
        resultVO.setMsg(SystemCode.SUCCESS.getMsg());
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(SystemCode systemCode) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(systemCode.getCode());
        resultVO.setMsg(systemCode.getMsg());
        return resultVO;
    }

}
