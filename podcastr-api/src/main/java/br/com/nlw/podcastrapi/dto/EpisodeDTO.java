package br.com.nlw.podcastrapi.dto;

import br.com.nlw.podcastrapi.controllers.FileController;
import br.com.nlw.podcastrapi.models.Episode;
import br.com.nlw.podcastrapi.models.File;

public class EpisodeDTO {

    private String sub_id;
    private String title;
    private String members;
    private String published_at;
    private String thumbnail;
    private String description;

    private File file;

    public String getSub_id() {
        return sub_id;
    }

    public void setSub_id(String sub_id) {
        this.sub_id = sub_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public String getPublished_at() {
        return published_at;
    }

    public void setPublished_at(String published_at) {
        this.published_at = published_at;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Episode toEpisode() {

        Episode episode = new Episode();
        File file = new File();

        episode.setSub_id(this.sub_id);
        episode.setTitle(this.title);
        episode.setMembers(this.members);
        episode.setThumbnail(this.thumbnail);
        episode.setPublished_at(this.published_at);
        episode.setDescription(this.description);

        file.setUrl(this.file.getUrl());
        file.setType(this.file.getType());
        file.setDuration(this.file.getDuration());

        episode.setFile(file);

        return episode;
    }
}
