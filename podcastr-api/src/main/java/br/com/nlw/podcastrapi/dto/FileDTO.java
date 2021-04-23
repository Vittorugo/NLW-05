package br.com.nlw.podcastrapi.dto;

import br.com.nlw.podcastrapi.models.File;

public class FileDTO {

    private String url;
    private String type;
    private Long duration;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public File toFile() {
        File newFile = new File();
        newFile.setUrl(this.url);
        newFile.setType(this.type);
        newFile.setDuration(this.duration);

        return newFile;
    }
}
