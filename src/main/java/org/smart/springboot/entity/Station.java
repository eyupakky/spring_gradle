package org.smart.springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "station")
public class Station {
    @Id
    @SequenceGenerator(name = "seq_station", allocationSize = 1)
    @GeneratedValue(generator = "seq_station", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String station_code;
    @Column(nullable = false)
    private String station_name;

    private String station_x;
    private String station_y;

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    @ManyToOne
    @JoinColumn(name = "route_id")
    @Lazy
    private Route route;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

}
