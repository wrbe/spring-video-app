package com.example.videoapp.repository;

import com.example.videoapp.model.VideoCassette;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoCassetteRepository extends CrudRepository<VideoCassette, Long> {
}
