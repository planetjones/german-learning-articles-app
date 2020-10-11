package co.uk.planetjones.zwanzigminuten;

import java.util.Arrays;
import java.util.List;

import co.uk.planetjones.shared.Article;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/20mins") 
public class ZwanzigMinuten {

    @Get(produces = MediaType.APPLICATION_JSON) 
    public List<Article> index() {
        Article article = new Article("", "");
        return Arrays.asList(article);
    }
}