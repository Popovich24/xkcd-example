package com.zhuinden.xkcdexample;

import com.bluelinelabs.logansquare.annotation.JsonField;

/**
 * Created by Zhuinden on 2017.04.11..
 */

public class XkcdMapper {
    public XkcdComic from(XkcdResponse xkcdResponse) {
        XkcdComic xkcdComic = new XkcdComic();
        xkcdComic.setMonth(xkcdResponse.getMonth());
        xkcdComic.setNum(xkcdResponse.getNum());
        xkcdComic.setLink(xkcdResponse.getLink());
        xkcdComic.setYear(xkcdResponse.getYear());
        xkcdComic.setNews(xkcdResponse.getNews());
        xkcdComic.setSafeTitle(xkcdResponse.getSafeTitle());
        xkcdComic.setTranscript(xkcdResponse.getTranscript());
        xkcdComic.setAlt(xkcdResponse.getAlt());
        xkcdComic.setImg(xkcdResponse.getImg());
        xkcdComic.setTitle(xkcdResponse.getTitle());
        xkcdComic.setDay(xkcdResponse.getDay());
        return xkcdComic;
    }
}
