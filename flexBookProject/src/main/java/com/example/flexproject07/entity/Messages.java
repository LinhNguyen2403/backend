package com.example.flexproject07.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;
import java.security.Timestamp;
@Configuration
@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Messages implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int messageID;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;

    private String message;

    @Column(name="created_at",columnDefinition = "TIMESTAMP NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp createdAt;

    @Column(name="created_update",columnDefinition = "TIMESTAMP NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp createUpdate;

}
