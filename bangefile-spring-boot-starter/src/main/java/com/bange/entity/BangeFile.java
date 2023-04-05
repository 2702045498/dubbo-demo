package com.bange.entity;

public class BangeFile {
    private Integer number;
    private String fileName;
    private String content;
    private  Integer  len;


    public BangeFile() {
        this.number = 10001;
        this.fileName = "/Users/admin/Desktop/bange.txt";
        this.content="bange new a file";
        this.len = this.content.length();
    }

    public BangeFile(Integer number, String fileName, String content, Integer len) {
        this.number = number;
        this.fileName = fileName;
        this.content = content;
        this.len = len;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getLen() {
        return len;
    }

    public void setLen(Integer len) {
        this.len = len;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BangeFile{");
        sb.append("number=").append(number);
        sb.append(", fileName='").append(fileName).append('\'');
        sb.append(", len=").append(len);
        sb.append('}');
        return sb.toString();
    }
}
