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
    private long qualityRating;

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

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public ArrayList<ArticleTag> getArticleTagArrayList() {
        return articleTagArrayList;
    }

    public void setArticleTagArrayList(ArrayList<ArticleTag> articleTagArrayList) {
        this.articleTagArrayList = articleTagArrayList;
    }

    public ArrayList<Article> getReferenceArticleList() {
        return referenceArticleList;
    }

    public void setReferenceArticleList(ArrayList<Article> referenceArticleList) {
        this.referenceArticleList = referenceArticleList;
    }

    public long getQualityRating() {
        return qualityRating;
    }

    public void setQualityRating(long qualityRating) {
        this.qualityRating = qualityRating;
    }

    @Override
    public String toString() {
        return "Article{" +
                "author=" + author +
                ", articleUrl='" + articleUrl + '\'' +
                ", articleTagArrayList=" + articleTagArrayList +
                ", referenceArticleList=" + referenceArticleList +
                ", qualityRating=" + qualityRating +
                '}';
    }
}
