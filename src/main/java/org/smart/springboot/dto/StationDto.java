package org.smart.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StationDto {
    private String station_name;
    private String station_code;
    private String station_x;
    private String station_y;
    private Long id;
    private Long routeId;

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }


    public String getStation_code() {
        return station_code;
    }

    public void setStation_code(String station_code) {
        this.station_code = station_code;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getStation_x() {
        return station_x;
    }

    public void setStation_x(String station_x) {
        this.station_x = station_x;
    }

    public String getStation_y() {
        return station_y;
    }

    public void setStation_y(String station_y) {
        this.station_y = station_y;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
