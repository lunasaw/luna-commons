package com.luna.baidu;

import com.luna.baidu.config.GetBaiduKey;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @Package: com.luna.baidu
 * @ClassName: BaiduApplicationTest
 * @Author: luna
 * @CreateTime: 2020/7/16 16:11
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class BaiduApplicationTest {

    @Autowired
    private GetBaiduKey getBaiduKey;

    @Test
    public void atest() throws UnsupportedEncodingException, IOException {
        System.out.println(getBaiduKey.getAuth());
    }
}
