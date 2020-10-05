package com.designerclau.springbootmongodb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DbSeeder implements CommandLineRunner {

    private HotelRepository hotelRepository;

    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

         Hotel marriot = new Hotel(
               "Marriot",
               100,
               new Address("Paris","France"),
               Arrays.asList(
                       new Review("John",8, false),
                       new Review("Mary",9, true)
               )

         );

        Hotel ibis = new Hotel(
                "Ibis",
                90,
                new Address("Roma","Italy"),
                Arrays.asList(
                        new Review("Peter",5, false),
                        new Review("Catherine",9, true)
                )

         );

        Hotel marrow = new Hotel(
                "Morrow",
                90,
                new Address("Dublin","Ireland"),
                Arrays.asList(
                        new Review("Peter",5, false),
                        new Review("Catherine",9, true)
                )

        );

        //drop all Hotels
        this.hotelRepository.deleteAll();

        //add all Hotels
        //List<Hotel> hotels = Arrays.asList(marriot,ibis);
        this.hotelRepository.save(marriot);
        this.hotelRepository.save(ibis);
        this.hotelRepository.save(marrow);

    }
}
