package com.bange;

import com.bange.entity.BangeFile;

public class BangeTest {
    public static void main(String[] args) {
        BangeFile bangeFile = new BangeFile();
        bangeFile.getFileName();
        System.out.println(bangeFile.toString());
    }
}
