package com.resiliencia.padroes.service;


import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Component
public class DelayTracker {

    //Definir atraso no retorno
    private final Duration atraso = Duration.ofSeconds(10);


    public void applyDelay(){
        try {
            TimeUnit.MILLISECONDS.sleep(atraso.toMillis());
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

    }

}
