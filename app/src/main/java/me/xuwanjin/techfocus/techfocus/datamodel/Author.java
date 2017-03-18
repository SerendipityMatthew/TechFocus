package me.xuwanjin.techfocus.techfocus.datamodel;

/**
 * Created by xuwanjin on 3/18/17.
 */

public class Author {
    private String name;
    private String blogUrl;
    private String bookName;
    private String aboutAuthorUrl;


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

    public String getAboutAuthorUrl() {
        return aboutAuthorUrl;
    }

    public void setAboutAuthorUrl(String aboutAuthorUrl) {
        this.aboutAuthorUrl = aboutAuthorUrl;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", blogUrl='" + blogUrl + '\'' +
                ", bookName='" + bookName + '\'' +
                ", aboutAuthorUrl='" + aboutAuthorUrl + '\'' +
                '}';
    }

}
