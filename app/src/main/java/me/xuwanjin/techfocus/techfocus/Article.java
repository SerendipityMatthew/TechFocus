package me.xuwanjin.techfocus.techfocus;

import android.graphics.drawable.Drawable;
import android.media.Image;

import java.net.URL;
import java.util.List;

public class Article {
    private String articleUrl = null;
    private String imageUrl = null;
    private Drawable articleImage = null;
    private Drawable articleMainImage = null;
    private String articleAuthor = null;
    private String articleName = null;
    private List<String> articleTags = null;
    private List<URL> articleReference = null;
    private String articleSummary = null;

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Drawable getArticleImage() {
        return articleImage;
    }

    public void setArticleImage(Drawable articleImage) {
        this.articleImage = articleImage;
    }

    public Drawable getArticleMainImage() {
        return articleMainImage;
    }

    public void setArticleMainImage(Drawable articleMainImage) {
        this.articleMainImage = articleMainImage;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public List<String> getArticleTags() {
        return articleTags;
    }

    public void setArticleTags(List<String> articleTags) {
        this.articleTags = articleTags;
    }

    public List<URL> getArticleReference() {
        return articleReference;
    }

    public void setArticleReference(List<URL> articleReference) {
        this.articleReference = articleReference;
    }

    public String getArticleSummary() {
        return articleSummary;
    }

    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleUrl='" + articleUrl + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", articleImage=" + articleImage +
                ", articleMainImage=" + articleMainImage +
                ", articleAuthor='" + articleAuthor + '\'' +
                ", articleName='" + articleName + '\'' +
                ", articleTags=" + articleTags +
                ", articleReference=" + articleReference +
                ", articleSummary='" + articleSummary + '\'' +
                '}';
    }
}
