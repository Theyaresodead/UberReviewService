package com.example.uberreviewservice.services;

import com.example.uberreviewservice.models.Booking;
import com.example.uberreviewservice.models.Review;
import com.example.uberreviewservice.repository.BookingRepository;
import com.example.uberreviewservice.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class ReviewServices implements CommandLineRunner{
    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
     private BookingRepository bookingRepository;

    public ReviewServices(ReviewRepository reviewRepository,BookingRepository bookingRepository){
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("***************");
        Review r= Review.builder()
                .content("Amazing Ride quality")
                .rating(5.0)
                .build();
        Booking booking = Booking.builder()
                         .startTime(new Date())
                         .review(r)
                         .endTime(new Date())
                         .build();

       reviewRepository.save(r); // This code executes sql query
        bookingRepository.save(booking);

       List<Review> reviews = reviewRepository.findAll();
       for(Review review : reviews){
           System.out.println(review.getContent());
        }

    }
}
