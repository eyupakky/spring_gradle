package com.smart.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String hataMesaji(String param) {
        throw new IllegalStateException("Metod mesaj verdi param :" + param);
    }
}
