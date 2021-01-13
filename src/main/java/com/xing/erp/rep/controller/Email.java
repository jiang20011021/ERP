package com.xing.erp.rep.controller;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;

/**
 * Created by Administrator on 2018/5/19.
 */
@Controller  //声明为控制器
@RequestMapping(path = "/testemail")
public class Email {
    @Resource(name = "mailSender")
    JavaMailSenderImpl mailSender;

    @RequestMapping(path = "/sendword")
    public void handle() {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo("2782587567@qq.com");
        mailMessage.setFrom("1764023594@qq.com");//一定要写，501 mail from address must be same as authorization user的错误
        mailMessage.setSubject("第一个文本文件");
        mailMessage.setText("程丽姣大牛");
        mailSender.send(mailMessage);
    }

    @RequestMapping(path = "/sendhtml")
    public void handle1() {
        MimeMessage mimeMsg = mailSender.createMimeMessage();
        try {
            String html = "<html><head>" +
                    "</head><body>" +
                    "<h1>Hello,this is first html!</h1>" +
                    "<span style='color:red;font-size:36px;'>hello</span>" +
                    "<img src='https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1526734280537&di=0f7ac79302207a66fe4db36162486167&imgtype=0&src=http%3A%2F%2Fimg5.duitang.com%2Fuploads%2Fitem%2F201510%2F07%2F20151007101227_jkevU.jpeg'>" +
                    "</body></html>";
            MimeMessageHelper helper = new MimeMessageHelper(mimeMsg, true);
            helper.setTo("qq目的地");
            helper.setFrom("qq发送端账号");//一定要写，501 mail from address must be same as authorization user的错误
            helper.setSubject("你好");
            helper.setText(html, true);
            mailSender.send(mimeMsg);
        } catch (Exception e) {
        }


    }

}

