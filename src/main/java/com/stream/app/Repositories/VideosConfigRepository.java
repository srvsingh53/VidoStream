package com.stream.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.stream.app.Entities.videosConfig;

public interface VideosConfigRepository extends JpaRepository<videosConfig, String> {
}
