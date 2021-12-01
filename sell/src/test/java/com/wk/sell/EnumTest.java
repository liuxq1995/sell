package com.wk.sell;

import com.wk.sell.enums.ProductStatusEnum;
import com.wk.sell.enums.SystemCode;
import com.wk.sell.utils.EnumUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description:
 *
 * EnumTest
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EnumTest {
    
    @Test
    public void test1() {
        System.out.println("这个code的值是：" + EnumUtil.getByCode(0, SystemCode.class).getMsg());
        System.out.println("这个code的值是：" + EnumUtil.getByCode(0, ProductStatusEnum.class).getMsg());
    }
    
}
