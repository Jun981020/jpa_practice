package com.example.book_api.repostory;

import com.example.book_api.domain.Gender;
import com.example.book_api.domain.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void crud(){
//        userRepository.findAll().forEach(System.out::println);
//        userRepository.findByEmailAndName("flwnsgud@nate.com","jun");
//        userRepository.findByEmailOrName("flwnsgud@nate.com","jun");
//        userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1L)).forEach(System.out::println);
//            userRepository.findByIdAfter(3L).forEach(System.out::println);
//        userRepository.findByCreatedAtGreaterThan(LocalDateTime.now().minusDays(1L)).forEach(System.out::println);
//        userRepository.findByCreatedAtGreaterThanEqual(LocalDateTime.now().minusDays(1L)).forEach(System.out::println);
//        System.out.println(userRepository.findByIdIsNotNull());
//        System.out.println(userRepository.findByNameIn(Lists.newArrayList("jun","sang")));

//        System.out.println(userRepository.findByNameStartingWith("j"));
//        System.out.println(userRepository.findByNameEndsWith("g"));
//        System.out.println(userRepository.findByNameContains("u"));
//        System.out.println(userRepository.findTop1ByName("jun"));
//        System.out.println(userRepository.findLast1ByName("jun"));
//        System.out.println(userRepository.findFirstByName("jun",Sort.by(Sort.Order.desc("email"))));
//        System.out.println(userRepository.findAllByName("jun", PageRequest.of(0,1,Sort.by(Sort.Order.asc("id")))).getContent());
    }

    @Test
    void insertAndUpdate(){
        Users users1 = new Users();
        users1.setName("janny");
        users1.setEmail("jaany@naver.com");
        userRepository.save(users1);
        Users users2 = userRepository.findById(6L).orElseThrow();
        users2.setName("jannnnnny");
        userRepository.save(users2);
        System.out.println(userRepository.findById(6L));
    }

    @Test
    void enumTest(){
        Users users = userRepository.findById(1L).orElseThrow();
        users.setGender(Gender.MALE);
        userRepository.save(users);

        System.out.println(userRepository.findById(1L).orElseThrow());
        System.out.println(userRepository.findRowRecodes().get("gender"));
    }
    @Test
    public void perPersistTest(){
        Users users = new Users();
        users.setEmail("test1");
        users.setName("tester");
        userRepository.save(users);
        System.out.println(userRepository.findByEmail("test1"));
    }

}