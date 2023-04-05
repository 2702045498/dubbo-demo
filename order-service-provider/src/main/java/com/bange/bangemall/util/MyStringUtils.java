package com.bange.bangemall.util;

import com.bange.autoconfigure.bangefile.HutoolFileConfiguration;
import com.bange.entity.BangeFile;

import java.util.UUID;

public class MyStringUtils {

    public static String getUUID(){

        return UUID.randomUUID().toString();
    }
}
