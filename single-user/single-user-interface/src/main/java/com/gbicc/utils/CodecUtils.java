package com.gbicc.utils;


import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

public class CodecUtils {

    public static void main(String[] args) {
        System.out.println(md5Hex("123", "123"));
        System.out.println(md5Hex("123", "123"));
        System.out.println(md5Hex("123", "123"));
        System.out.println(md5Hex("123", "123"));
    }


    public static String md5Hex(String data,String salt) {
        if (StringUtils.isBlank(salt)) {
            salt = /*data.hashCode() +*/ "";
        }
        return DigestUtils.md5Hex(salt + DigestUtils.md5Hex(data));
    }

    public static String shaHex(String data, String salt) {
        if (StringUtils.isBlank(salt)) {
            salt = data.hashCode() + "";
        }
        return DigestUtils.sha512Hex(salt + DigestUtils.sha512Hex(data));
    }

    public static String generateSalt(){
        return StringUtils.replace(UUID.randomUUID().toString(), "-", "");
    }
}
