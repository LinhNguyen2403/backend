package com.example.flexproject07.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name="friends")
@AllArgsConstructor
@NoArgsConstructor
public class Friend implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "friend_id")
    private Long friendId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id1")
    private User user1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id2")
    private User user2;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "action_user_id")
    private User actionUser;

    @Column(name = "created_at", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp updatedAt;

    public enum Status {
        PENDING,
        ACCEPTED,
        DECLINED,
        BLOCKED
    }

}
