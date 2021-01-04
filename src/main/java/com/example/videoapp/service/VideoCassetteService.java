package com.example.videoapp.service;

import com.example.videoapp.model.VideoCassette;
import com.example.videoapp.repository.VideoCassetteRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VideoCassetteService {

    private VideoCassetteRepository videoCassetteRepository;

    public Optional<VideoCassette> findById(Long id) {
        return videoCassetteRepository.findById(id);
    }

    public Iterable<VideoCassette> findAll() {
        return videoCassetteRepository.findAll();
    }

    public VideoCassette save(VideoCassette videoCassette) {
        return videoCassetteRepository.save(videoCassette);
    }

    public void deleteById(Long id) {
        videoCassetteRepository.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDb() {
        save(new VideoCassette(1L, "Titanic", LocalDate.of(1995, 1, 1)));
        save(new VideoCassette(2L, "Pulp Fiction", LocalDate.of(1990, 2, 2)));

    }

}
