package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTests {

    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testTextMail() {
        mailClient.sendMail("2844233274@qq.com", "TEST", "Welcome.");
    }


    @Test
    public void testHtmlMail() {
        //建内容对象
        Context context = new Context();
        context.setVariable("username", "sunday");
        //把内容投到模版引擎上,这个模版是html，符合格式
        String content = templateEngine.process("/mail/demo", context);
        System.out.println(content);

        mailClient.sendMail("2844233274@qq.com", "HTML", content);
    }

}
