package com.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.util.Date;


@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseModel {

    @Id // This annotation makes the id property as the primary key of our table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically increases the value
    protected Long id;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)  // Tells the spring about the format of date object to be stored
    @CreatedDate // This annotation tells the spring that only handle it only for object creation
    protected Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate // This annotation tells the spring that only handle it only for object updation
    @Column(nullable = false)
    protected Date updatedAt;
}
