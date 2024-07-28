package org.smart.springboot.dto;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = {"id"})
public class KisiDto {

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

    public List<String> getAdresler() {
        return adresler;
    }

    public void setAdresler(List<String> adresler) {
        this.adresler = adresler;
    }

    private Long id;

    @NotNull
    private String adi;

    private String soyadi;

    private List<String> adresler;
}
