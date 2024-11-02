package transaction;

public class Photo {
    private Long id;
    private Long thumbId;
    private String title;
    private String url;
    private String thumbnailUrl;


    public Photo(Long id, Long thumbId, String title, String url, String thumbnailUrl) {
        this.id = id;
        this.thumbId = thumbId;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getThumbId() {
        return thumbId;
    }

    public void setThumbId(Long thumbId) {
        this.thumbId = thumbId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
