package br.com.nlw.podcastrapi.controllers;

import br.com.nlw.podcastrapi.dto.EpisodeDTO;
import br.com.nlw.podcastrapi.models.Episode;
import br.com.nlw.podcastrapi.repository.EpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class EpisodeController {

    @Autowired
    private EpisodeRepository episodeRepository;

    @GetMapping
    public ResponseEntity<List<Episode>> recoverAllEpisodes() {
        List<Episode> listEpisodes = episodeRepository.findAll();
        return ResponseEntity.ok().body(listEpisodes);
    }

    @PostMapping(value = "/register/episode")
    public ResponseEntity<Episode> registerEpisode(@RequestBody EpisodeDTO episodeDto){
        Episode newEpisode = episodeDto.toEpisode();
        episodeRepository.save(newEpisode);
        return ResponseEntity.ok().body(newEpisode);
    }
}
