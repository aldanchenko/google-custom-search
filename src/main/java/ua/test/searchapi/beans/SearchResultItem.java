package ua.test.searchapi.beans;

/**
 * Item of search results from Google.
 */
public class SearchResultItem {

    private String title;
    private String link;
    private String displayLink;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDisplayLink() {
        return displayLink;
    }

    public void setDisplayLink(String displayLink) {
        this.displayLink = displayLink;
    }
}
