package com.estevaocoelho.contactme;

/**
 * Created by estevaocoelho on 15/02/18.
 */

public class SocialMedia {
    private SocialMediaType mediaType;
    private String nameToShow;
    private String url;

    public SocialMedia(SocialMediaType socialMediaType, String nameToShow, String url) {
        mediaType = socialMediaType;
        this.nameToShow = nameToShow;
        this.url = url;
    }

    public SocialMediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(SocialMediaType mediaType) {
        this.mediaType = mediaType;
    }

    public String getNameToShow() {
        return nameToShow;
    }

    public void setNameToShow(String nameToShow) {
        this.nameToShow = nameToShow;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
