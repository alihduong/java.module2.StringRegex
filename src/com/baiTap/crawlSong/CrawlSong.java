package com.baiTap.crawlSong;

import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSong {
    public static void main(String[] args) {
        try {
            //mở luồng và đưa nó vào BufferedReader
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));

            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();

            // xóa tất cả dòng mới
            content = content.replaceAll("\\n+", " " );

            //regex
            Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher = pattern.matcher(content);

            while (matcher.find()){
                System.out.println(matcher.group(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
