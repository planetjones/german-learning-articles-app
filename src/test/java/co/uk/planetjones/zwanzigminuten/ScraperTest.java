package co.uk.planetjones.zwanzigminuten;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import co.uk.planetjones.shared.Article;


public class ScraperTest {


    @Test
    void testItWorks() {
        
        List<Article> articles = Scraper.fetchArticles();

        assertThat(articles.size()).isGreaterThan(20);
        
    }

}
