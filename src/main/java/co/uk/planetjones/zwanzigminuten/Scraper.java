package co.uk.planetjones.zwanzigminuten;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import co.uk.planetjones.shared.Article;

public class Scraper {

    private static Logger logger =  Logger.getLogger(Scraper.class.getName());
    private static final String FQDN = "https://www.20min.ch";

    public static List<Article> fetchArticles() {

        List<Article> articles = new ArrayList<>();

        Document doc;
        
        try {
            doc = Jsoup.connect(FQDN).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Elements headers = doc.getElementsByTag("h1");

        for (Element header : headers) {
          Element link = header.parent().parent().parent();
          Article article = new Article(header.text(), FQDN + link.attr("href"));
          articles.add(article);
      
        }
        
        logger.log(Level.INFO, articles.toString());
    
        return articles;

    }


    
}
