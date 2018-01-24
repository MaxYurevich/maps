package com.travelanylevel.maps.web;

import com.travelanylevel.maps.domain.Marker;
import com.travelanylevel.maps.repository.MarkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MapController {

    private final MarkerRepository repository;

    @Autowired
    public MapController(MarkerRepository repository) {
        this.repository = repository;
    }

    @CrossOrigin
    @GetMapping("/getallmarkers")
    public List<Marker> getAllMarkers() {
        return this.repository.findAll();
    }
}
