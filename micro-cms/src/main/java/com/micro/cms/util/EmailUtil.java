package com.micro.cms.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

/**
 * 邮件工具类
 */
public class EmailUtil {

    private static final String user="yangzhi_1@ebupt.com";
    private static final String password="a1B2C3";
    private static final String sendHost="smtp.exmail.qq.com";
    private static final int port=465;
    private static final JavaMailSender maillSend=createSender();
    private static final Logger logger= LoggerFactory.getLogger(EmailUtil.class);

    /**
     * 发送邮件
     */
    public static void sendEmailMsg() throws UnsupportedEncodingException, MessagingException {
        MimeMessage mailMessage = maillSend.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mailMessage, true, "utf-8");
            helper.setFrom("yangzhi_1@ebupt.com");// 设置发件人
            helper.setTo("1143802555@qq.com");// 设置收件人
//            helper.setCc(cc);// 设置抄送
            helper.setSubject("验证码");// 设置主题
            helper.setText("<html></html>");// 邮件体

            maillSend.send(mailMessage);// 发送邮件
            logger.info("邮件发送成功...");
        } catch (Exception e) {
            logger.error("邮件发送发生异常:" + e.getMessage(), e);

        }
    }
    private static JavaMailSender createSender(){
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setHost("smtp.exmail.qq.com");
        javaMailSender.setPort(465);
        javaMailSender.setUsername("yangzhi_1@ebupt.com");
        javaMailSender.setPassword("A1b2c3");
        Properties properties = new Properties();
        properties.setProperty("mail.host", "smtp.qq.com");
        properties.setProperty("mail.transport.protocol", "smtp");
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.setProperty("mail.smtp.port", "465");
        properties.setProperty("mail.smtp.socketFactory.port", "465");

        javaMailSender.setJavaMailProperties(properties);
        return javaMailSender;
    }
}
