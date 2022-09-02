package com.example.book_api.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Builder
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;
    @NonNull
    private String email;

    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column()
    private LocalDateTime updateAt;

//    @Transient
//    private String test; 영속성의 영향을 받지 않는다.

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @PrePersist
    public void prepPersist(){

        this.createdAt = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
    }


}
