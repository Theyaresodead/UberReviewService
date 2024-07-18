package com.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="bookingReview")
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel {


    @Column(nullable = false)
    private String content;

    private  Double rating;

    @Override
    public String toString() {
        return "Review:" + this.content +" "+this.rating +" "+this.createdAt;
    }


}
