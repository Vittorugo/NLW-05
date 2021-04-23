package br.com.nlw.podcastrapi.repository;

import br.com.nlw.podcastrapi.models.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodeRepository extends JpaRepository<Episode, Long> {
}
