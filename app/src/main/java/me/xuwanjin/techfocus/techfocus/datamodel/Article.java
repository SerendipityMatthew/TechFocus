package me.xuwanjin.techfocus.techfocus.datamodel;

import java.util.ArrayList;

/**
 * Created by xuwanjin on 3/18/17.
 */

public class Article {
    private Author author;
    private String articleUrl;
    private ArrayList<ArticleTag> articleTagArrayList;
    private ArrayList<Article> referenceArticleList;

    public Article(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public Article(Author author, String articleUrl) {
        this.author = author;
        this.articleUrl = articleUrl;
    }

    public Author getAuthor() {
        return author;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public ArrayList<ArticleTag> getArticleTagArrayList() {
        return articleTagArrayList;
    }

    public ArrayList<Article> getReferenceArticleList() {
        return referenceArticleList;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public void setArticleTagArrayList(ArrayList<ArticleTag> articleTagArrayList) {
        this.articleTagArrayList = articleTagArrayList;
    }

    public void setReferenceArticleList(ArrayList<Article> referenceArticleList) {
        this.referenceArticleList = referenceArticleList;
    }

    @Override
    public String toString() {
        return "Article{" +
                "author=" + author +
                ", articleUrl='" + articleUrl + '\'' +
                ", articleTagArrayList=" + articleTagArrayList +
                ", referenceArticleList=" + referenceArticleList +
                '}';
    }
}
