package org.smart.springboot.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "kisi")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
@SqlResultSetMapping(name="deleteResult", columns = { @ColumnResult(name = "count")})
@org.hibernate.annotations.NamedQuery(name = "Kisi_findById",
        query = "from Kisi where id = :id")
public class Kisi implements Serializable {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public List<Adres> getAdresleri() {
        return adresleri;
    }

    public void setAdresleri(List<Adres> adresleri) {
        this.adresleri = adresleri;
    }

    @Id
    @SequenceGenerator(name = "seq_kisi", allocationSize = 1)
    @GeneratedValue(generator = "seq_kisi", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 100, name = "adi")
    private String adi;

    @Column(length = 100, name = "soyadi")
    private String soyadi;

    @OneToMany
    @JoinColumn(name = "kisi_adres_id")
    private List<Adres> adresleri;
}
