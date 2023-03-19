package com.blogger.blogs.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@SequenceGenerator(name="id_seq", allocationSize=1)
@Data
public class BlockedList {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id_seq")
    private Long id;

    private Long userId;

    private Long blockedUserId;
}
