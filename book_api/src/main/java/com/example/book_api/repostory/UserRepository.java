package com.example.book_api.repostory;

import com.example.book_api.domain.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface UserRepository extends JpaRepository<Users,Long> {

    Users findByEmail(String email);

    List<Users> findAllByName(String name);

    List<Users> findByEmailAndName(String email,String name);
    List<Users> findByEmailOrName(String email,String name);

    List<Users> findByCreatedAtAfter(LocalDateTime yesterday);
    List<Users> findByIdAfter(Long id);

    List<Users> findByCreatedAtGreaterThan(LocalDateTime yesterday);

    List<Users> findByCreatedAtGreaterThanEqual(LocalDateTime yesterday);

    List<Users> findByIdIsNotNull();

    List<Users> findByNameIn(List<String> name);

    List<Users> findByNameStartingWith(String name);

    List<Users> findByNameEndsWith(String name);

    List<Users> findByNameContains(String name);

    List<Users> findTop1ByName(String name);

    List<Users> findLast1ByName(String name);

    List<Users> findFirstByName(String name, Sort sort);

    Page<Users> findAllByName(String name, Pageable pageable);
}
