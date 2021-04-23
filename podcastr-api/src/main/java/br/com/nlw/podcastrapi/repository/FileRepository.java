package br.com.nlw.podcastrapi.repository;

import br.com.nlw.podcastrapi.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {

    File findByUrl(String url);
}
