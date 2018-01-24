package com.travelanylevel.maps.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Marker {

    private @Id @GeneratedValue Long id;
    private String name;
    private String address;
    private Double lat;
    private Double lng;
    private String type;

    public Marker() {}

    public Marker(String name, String address, Double lat, Double lng, String type) {
        this.name = name;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Marker marker = (Marker) o;

        if (id != null ? !id.equals(marker.id) : marker.id != null) return false;
        if (name != null ? !name.equals(marker.name) : marker.name != null) return false;
        if (address != null ? !address.equals(marker.address) : marker.address != null) return false;
        if (lat != null ? !lat.equals(marker.lat) : marker.lat != null) return false;
        if (lng != null ? !lng.equals(marker.lng) : marker.lng != null) return false;
        return type != null ? type.equals(marker.type) : marker.type == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lng != null ? lng.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
