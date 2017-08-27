package ua.test.searchapi;

import com.google.gson.Gson;
import ua.test.searchapi.beans.CustomSearch;
import ua.test.searchapi.beans.SearchResultItem;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Entry point to application.
 */
public class GoogleCustomSearchApplication {

    /**
     * Main method for application.
     *
     * @param args - command line arguments
     *
     * @throws IOException -
     */
    public static void main(String[] args) throws IOException {
        String googleUserApiKey = "";
        String userCustomSearchKey = "";

        String googleApiUrlStr = "https://www.googleapis.com/customsearch/v1?key=" + googleUserApiKey + "&cx=" + userCustomSearchKey + "&q=";

        String searchKeyword = "lectures";
        String charset = "UTF-8";

        URL googleApiUrl = new URL(googleApiUrlStr + URLEncoder.encode(searchKeyword, charset));

        Reader reader = new InputStreamReader(googleApiUrl.openStream(), charset);

        CustomSearch customSearchResult = new Gson().fromJson(reader, CustomSearch.class);

        System.out.println(customSearchResult.getKind());
        System.out.println();

        for (SearchResultItem searchResultItem : customSearchResult.getItems()) {
            System.out.println("Title: " + searchResultItem.getTitle());
            System.out.println("Link: " + searchResultItem.getLink());
            System.out.println("DisplayLink: " + searchResultItem.getDisplayLink());

            System.out.println();
        }
    }
}
