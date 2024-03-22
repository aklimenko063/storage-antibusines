package org.javaacademy.storage_antibusiness;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StorageConfig {
    @Bean
    public Worker mishaWorker() {
        return new Worker("Misha");
    }

    @Bean
    public Worker zelyaWorker() {
        return new Worker("Zelya");
    }

    @Bean
    public Storage storage() {
        return new Storage(mishaWorker(), zelyaWorker());
    }
}
