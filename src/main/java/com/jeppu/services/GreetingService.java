package com.jeppu.services;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Service;

@Service
public interface GreetingService {
    String sayGreeting();
}
