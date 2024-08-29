package com.stream.app.ServiceImplementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.stream.app.Entities.videosConfig;
import com.stream.app.Repositories.VideosConfigRepository;
import com.stream.app.Services.VideosConfigService;

@Service
public class VideosConfigServiceImpl implements VideosConfigService {

    @Autowired
    private VideosConfigRepository videosConfigRepository;

    @Override
    public ResponseEntity<List<videosConfig> >getAllVideos() {
        return (ResponseEntity<List<videosConfig>>) videosConfigRepository.findAll();
    }

    @Override
public ResponseEntity<videosConfig> getVideoById(String id) {
    videosConfig video = videosConfigRepository.findById(id).orElse(null);
    if (video != null) {
        return new ResponseEntity<>(video, HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}


    @Override
    public videosConfig saveVideo(videosConfig video) {
        return videosConfigRepository.save(video);
    }

    @Override
    public void deleteVideo(String id) {
        videosConfigRepository.deleteById(id);
    }
}
