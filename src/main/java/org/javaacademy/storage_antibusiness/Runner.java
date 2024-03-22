package org.javaacademy.storage_antibusiness;

import org.javaacademy.storage_antibusiness.items.Bike;
import org.javaacademy.storage_antibusiness.items.Vodka;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать складской бизнес используя spring context.
 * 1. Создать работников: Мишка и Зеля (один класс). Они умеют принимать товар, ломать его.
 * 2. Создать абстрактный товар, который хранит в себе состояние - сломан или нет.
 * 3. Создать 2 имплементации товара: водка и велосипед.
 * 4. Создать склад - хранит в себе перечень товаров в виде мапы. Имеет двух работников.
 * 5. Создать двух импортеров: производитель Абсолют(водочный) и производитель Аист(велосипеды).
 * Умеют поставлять новые товары на склад.
 * 6. Создать двух покупателей: Петрович и Решар. Они приходят и берут нужные им товары со склада.
 * Схема запуска приложения:
 * - Поднимается контекст (создаются все бины)
 * - Поставщики привозят товар на склад (три водки и три велосипеда)
 * - Работники портят каждый второй товар
 * - Петрович берет только сломаную водку. Решар только рабочие велосипеды.
 * - Взятые товары со склада пропадают.
 */
public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.javaacademy.storage_antibusiness");
        Storage beanStorage = context.getBean(Storage.class);
        Importer beanAbsolutImporter = context.getBean("absolutImporter", Importer.class);
        Importer beanAistImporter = context.getBean("aistImporter", Importer.class);
        Buyer beanPetrovichBuyer = context.getBean("petrovichBuyer", Buyer.class);
        Buyer beanResharBuyer = context.getBean("resharBuyer", Buyer.class);

        beanAbsolutImporter.importItems(new ArrayList<>(List.of(new Vodka(), new Vodka(), new Vodka())));
        beanAistImporter.importItems(new ArrayList<>(List.of(new Bike(), new Bike(), new Bike())));

        beanPetrovichBuyer.buyBrokenVodka();
        beanResharBuyer.buyNotBrokenBike();

        context.close();
    }
}
