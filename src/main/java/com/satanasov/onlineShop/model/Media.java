package com.satanasov.onlineShop.model;

public class Media {
    private Long id;
    private String mediaURL;
    private String description;

    public Long getId() {
        return id;
    }

    public String getMediaURL() {
        return mediaURL;
    }

    public void setMediaURL(String mediaURL) {
        this.mediaURL = mediaURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
