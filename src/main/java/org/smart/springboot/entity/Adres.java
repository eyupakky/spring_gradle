package org.smart.springboot.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.context.annotation.Lazy;

import java.io.Serializable;

@Entity
@Table(name = "kisi_adres")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class Adres implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_kisi_adres", allocationSize = 1)
    @GeneratedValue(generator = "seq_kisi_adres", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 500, name = "adres")
    private String adres;

    @Enumerated
    private AdresTip adresTip;

    @Column(name = "aktif")
    private Boolean aktif;

    @ManyToOne
    @JoinColumn(name = "kisi_adres_id")
    private Kisi kisi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public AdresTip getAdresTip() {
        return adresTip;
    }

    public void setAdresTip(AdresTip adresTip) {
        this.adresTip = adresTip;
    }

    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }

    public Kisi getKisi() {
        return kisi;
    }

    public void setKisi(Kisi kisi) {
        this.kisi = kisi;
    }

    public enum AdresTip {
        EV_ADRESI,
        IS_ADRESI,
        DIGER
    }
}
