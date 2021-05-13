package com.example.profilespecificandhierarchicalproperties.controller;

public class Course {
 
    private String name ;
    private int chapterCount;

    public int getChapterCount() {
        return chapterCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setChapterCount(int chapterCount) {
        this.chapterCount = chapterCount;
    }

    public Course (String name ,int chapterCount){
        this.name = name ;
        this.chapterCount = chapterCount;
    }
}
