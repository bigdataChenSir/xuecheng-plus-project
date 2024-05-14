package com.xuecheng.media.api;

public class test {
    public static void main(String[] args) {
        String fileMd5="a16da7a132559daf9e1193166b3e7f52";
        String fileExt=".avi";
        String c=  fileMd5.substring(0,1) + "/" + fileMd5.substring(1,2) + "/" + fileMd5 + "/" +fileMd5 +fileExt;

        System.out.println(c);
    }
}
