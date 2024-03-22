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

    @Bean
    public Importer absolutImporter() {
        return new Importer("Absolut", storage());
    }

    @Bean
    public Importer aistImporter() {
        return new Importer("Aist", storage());
    }

    @Bean
    public Buyer petrovichBuyer() {
        return new Buyer("Petrovich", storage());
    }

    @Bean
    public Buyer resharBuyer() {
        return new Buyer("Reshar", storage());
    }
}
