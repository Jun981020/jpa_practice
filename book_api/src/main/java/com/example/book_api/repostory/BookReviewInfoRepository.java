package com.example.book_api.repostory;

import com.example.book_api.domain.BookReviewInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReviewInfoRepository extends JpaRepository<BookReviewInfo,Long> {
}
