package br.com.nlw.podcastrapi.controllers;

import br.com.nlw.podcastrapi.dto.FileDTO;
import br.com.nlw.podcastrapi.models.File;
import br.com.nlw.podcastrapi.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/file")
public class FileController {

    @Autowired
    private FileRepository fileRepository;

    @GetMapping("/recover")
    public ResponseEntity<List<File>> recoverAllFiles(){
        List<File> file = fileRepository.findAll();
        return ResponseEntity.ok().body(file);
    }

    @PostMapping("/register")
    public ResponseEntity<File> registerFile(@RequestBody FileDTO fileDto){
        File file = fileDto.toFile();
        fileRepository.save(file);
        return ResponseEntity.ok().body(file);
    }

    public File findFileName(String url){
        File findedFile = fileRepository.findByUrl(url);
        return findedFile;
    }
}
