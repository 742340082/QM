package com.news.mvp.zhihu.modle;

import com.google.gson.annotations.SerializedName;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

public class Zhihu extends DataSupport {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String date;
    @SerializedName("stories")
    private List<ZhihuStorie> storieList=new ArrayList<>();
    @SerializedName("top_stories")
    private List<ZhihuTopStorie> top_storieList=new ArrayList<>();

    public List<ZhihuStorie> getStorieList() {
        return storieList;
    }

    public void setStorieList(List<ZhihuStorie> storieList) {
        this.storieList = storieList;
    }

    public List<ZhihuTopStorie> getTop_storieList() {
        return top_storieList;
    }

    public void setTop_storieList(List<ZhihuTopStorie> top_storieList) {
        this.top_storieList = top_storieList;
    }

    private long cacheTime;

    public long getCacheTime() {
        return cacheTime;
    }

    public void setCacheTime(long cacheTime) {
        this.cacheTime = cacheTime;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String paramString) {
        this.date = paramString;
    }



}
