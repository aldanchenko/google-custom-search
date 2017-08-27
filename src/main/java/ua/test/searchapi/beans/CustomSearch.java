package ua.test.searchapi.beans;

import java.util.List;

/**
 * Root JSON object from Google search results.
 */
public class CustomSearch {

    private String kind;
    private List<SearchResultItem> items;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public List<SearchResultItem> getItems() {
        return items;
    }

    public void setItems(List<SearchResultItem> items) {
        this.items = items;
    }
}
