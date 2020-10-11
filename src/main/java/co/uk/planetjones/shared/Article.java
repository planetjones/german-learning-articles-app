package co.uk.planetjones.shared;

import java.util.Objects;

public class Article {

    public String deTitle;
    public String enTitle;
    public String detailedUrl;

    public Article(String deTitle, String detailedUrl) {
        this.deTitle = deTitle;
        this.detailedUrl = detailedUrl;
    }

    public String getDeTitle() {
        return this.deTitle;
    }

    public String getEnTitle() {
        return this.enTitle;
    }

    public String getDetailedUrl() {
        return this.detailedUrl;
    }
    
    @Override
    public String toString() {
        return "{" +
            " deTitle='" + getDeTitle() + "'" +
            ", enTitle='" + getEnTitle() + "'" +
            ", detailedUrl='" + getDetailedUrl() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Article)) {
            return false;
        }
        Article article = (Article) o;
        return Objects.equals(deTitle, article.deTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(deTitle);
    }

    
}
