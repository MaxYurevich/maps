package com.travelanylevel.maps;

import com.travelanylevel.maps.domain.Marker;
import com.travelanylevel.maps.repository.MarkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final MarkerRepository repository;

    @Autowired
    public DataLoader(MarkerRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Marker("Love.Fish", "580 Darling Street, Rozelle, NSW", -33.861034, 151.171936, "restaurant"));
        this.repository.save(new Marker("Young Henrys", "76 Wilford Street, Newtown, NSW", -33.898113, 151.174469, "bar"));
        this.repository.save(new Marker("Hunter Gatherer", "Greenwood Plaza, 36 Blue St, North Sydney NSW ", -33.840282, 151.207474, "bar"));
        this.repository.save(new Marker("The Potting Shed", "7A, 2 Huntley Street, Alexandria, NSW", -33.910751, 151.194168, "bar"));
        this.repository.save(new Marker("Nomad", "16 Foster Street, Surry Hills, NSW", -33.879917, 151.210449, "bar"));
        this.repository.save(new Marker("Three Blue Ducks", "43 Macpherson Street, Bronte, NSW", -33.906357, 151.263763, "restaurant"));
        this.repository.save(new Marker("Single Origin Roasters", "60-64 Reservoir Street, Surry Hills, NSW", -33.881123, 151.209656, "restaurant"));
        this.repository.save(new Marker("Red Lantern", "60 Riley Street, Darlinghurst, NSW", -33.874737, 151.215530, "restaurant"));
    }
}
