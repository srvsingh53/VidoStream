package com.stream.app.Services;

import com.stream.app.Entities.videosConfig;
import java.util.List;

import org.springframework.http.ResponseEntity;

public interface VideosConfigService {
    ResponseEntity<List<videosConfig>> getAllVideos();
    ResponseEntity<videosConfig> getVideoById(String id);
    videosConfig saveVideo(videosConfig video);
    void deleteVideo(String id);
}
