package me.xuwanjin.techfocus.techfocus.datamodel;

import java.net.URL;
import java.util.ArrayList;

/**
 * Created by xuwanjin on 3/18/17.
 */

public class Author {
    private String name;
    private String blogUrl;
    private String bookName;
    private URL aboutAuthorUrl;
    private URL weiboUrl;
    private URL zhihuUrl;
    private URL googlePlusUrl;
    private URL rssFeedUrl;
    private ArrayList<Author> authorFriendsList;
    private Company belongToCompany;


    public Author(String name, String blogUrl) {
        this.name = name;
        this.blogUrl = blogUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlogUrl() {
        return blogUrl;
    }

    public void setBlogUrl(String blogUrl) {
        this.blogUrl = blogUrl;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public URL getAboutAuthorUrl() {
        return aboutAuthorUrl;
    }

    public void setAboutAuthorUrl(URL aboutAuthorUrl) {
        this.aboutAuthorUrl = aboutAuthorUrl;
    }

    public URL getWeiboUrl() {
        return weiboUrl;
    }

    public void setWeiboUrl(URL weiboUrl) {
        this.weiboUrl = weiboUrl;
    }

    public URL getZhihuUrl() {
        return zhihuUrl;
    }

    public void setZhihuUrl(URL zhihuUrl) {
        this.zhihuUrl = zhihuUrl;
    }

    public URL getGooglePlusUrl() {
        return googlePlusUrl;
    }

    public void setGooglePlusUrl(URL googlePlusUrl) {
        this.googlePlusUrl = googlePlusUrl;
    }

    public URL getRssFeedUrl() {
        return rssFeedUrl;
    }

    public void setRssFeedUrl(URL rssFeedUrl) {
        this.rssFeedUrl = rssFeedUrl;
    }

    public ArrayList<Author> getAuthorFriendsList() {
        return authorFriendsList;
    }

    public void setAuthorFriendsList(ArrayList<Author> authorFriendsList) {
        this.authorFriendsList = authorFriendsList;
    }

    public Company getBelongToCompany() {
        return belongToCompany;
    }

    public void setBelongToCompany(Company belongToCompany) {
        this.belongToCompany = belongToCompany;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", blogUrl='" + blogUrl + '\'' +
                ", bookName='" + bookName + '\'' +
                ", aboutAuthorUrl=" + aboutAuthorUrl +
                ", weiboUrl=" + weiboUrl +
                ", zhihuUrl=" + zhihuUrl +
                ", googlePlusUrl=" + googlePlusUrl +
                ", rssFeedUrl=" + rssFeedUrl +
                ", authorFriendsList=" + authorFriendsList +
                ", belongToCompany=" + belongToCompany +
                '}';
    }
}
