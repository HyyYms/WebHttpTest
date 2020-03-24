package com.web.demo.jsoup;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class JsoupFirstTest {
    @Test
    public void testUrl() throws IOException {
        // 解析url地址，第一个参数是访问的url，第二个参数是访问时候的超时时间
        Document doc =Jsoup.parse(new URL("http://www.itcast.cn"),1000);

        // 使用标签选择器，获取title标签中的内容
        String title = doc.getElementsByTag("title").first().text();

        // 打印
        System.out.println(title);
    }

    @Test
    public void  testString() throws IOException {
        // 使用工具类读取文件，获取字符串
        String content  = FileUtils.readFileToString(new File("F:\\Work\\JsoupStringTest.html"),"utf8");

        // 解析字符串
        Document doc = Jsoup.parse(content);

        // 使用标签选择器，获取title标签中的内容
        String title = doc.getElementsByTag("title").first().text();

        // 打印
        System.out.println(title);
    }
}
