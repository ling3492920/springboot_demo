package cn.jhd.springboot_demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jianghd
 * @create 2019/8/30-11:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        //断言端口不为空
        Assert.assertNotNull(port);
        System.out.println("prot:"+port);
        //断言请求url响应内容包含“Hello”
        Assert.assertTrue(
                this.restTemplate.getForObject("http://localhost:" + port + "/",
                String.class).contains("Hello"));
        System.out.println(this.restTemplate.getForObject("http://localhost:" + port + "/",
                String.class));
    }
}
