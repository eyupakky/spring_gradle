package org.smart.springboot.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.smart.springboot.service.KisiService;
import lombok.RequiredArgsConstructor;
import org.smart.springboot.dto.KisiDto;
import org.smart.springboot.entity.Adres;
import org.smart.springboot.entity.Kisi;
import org.smart.springboot.repo.AdresRepository;
import org.smart.springboot.repo.KisiRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class KisiServiceImpl implements KisiService {

    private final KisiRepository kisiRepository;
    private final AdresRepository adresRepository;
    private final EntityManager session;

    public KisiServiceImpl(KisiRepository kisiRepository, AdresRepository adresRepository, EntityManager session) {
        this.kisiRepository = kisiRepository;
        this.adresRepository = adresRepository;
        this.session = session;
    }

    @Override
    @Transactional
    public KisiDto save(KisiDto kisiDto) {
        Assert.notNull(kisiDto.getAdi(), "Adi alani zorunludur!");

        Kisi kisi = new Kisi();
        kisi.setAdi(kisiDto.getAdi());
        kisi.setSoyadi(kisiDto.getSoyadi());
        final  Kisi kisiDb = kisiRepository.save(kisi);

        List<Adres> liste = new ArrayList<>();
        kisiDto.getAdresler().forEach(item -> {
            Adres adres = new Adres();
            adres.setAdres(item);
            adres.setAdresTip(Adres.AdresTip.DIGER);
            adres.setAktif(true);
            adres.setKisi(kisiDb);
            liste.add(adres);
        });
        adresRepository.saveAll(liste);
        kisiDto.setId(kisiDb.getId());
        return kisiDto;
    }

    @Override
    public KisiDto getKisi(Long id) {
        TypedQuery<Kisi> query = session.createNamedQuery("Kisi_findById", Kisi.class);
        query.setParameter("id", id);
        KisiDto kisiDtos = new KisiDto();
        Kisi kisi = query.getSingleResult();
        kisiDtos.setAdi(kisi.getAdi());
        kisiDtos.setSoyadi(kisi.getSoyadi());
        kisiDtos.setId(kisi.getId());
        return kisiDtos;

    }

    @Override
    public List<KisiDto> getAll() {
        List<Kisi> kisiler = kisiRepository.findAll();
        List<KisiDto> kisiDtos = new ArrayList<>();

        kisiler.forEach(it -> {
            KisiDto kisiDto =new KisiDto();
            kisiDto.setId(it.getId());
            kisiDto.setAdi(it.getAdi());
            kisiDto.setSoyadi(it.getSoyadi());
            kisiDto.setAdresler(
                    it.getAdresleri() != null ?
                    it.getAdresleri().stream().map(Adres::getAdres).collect(Collectors.toList())
                            : null);
            kisiDtos.add(kisiDto);
        });
        return kisiDtos;
    }

    @Override
    public Page<KisiDto> getAll(Pageable pageable) {
        return null;
    }
}
