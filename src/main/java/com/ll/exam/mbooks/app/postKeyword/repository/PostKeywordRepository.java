package com.ll.exam.mbooks.app.postKeyword.repository;


import com.ll.exam.mbooks.app.postKeyword.entity.PostKeyword;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostKeywordRepository extends JpaRepository<PostKeyword, Long>, PostKeywordRepositoryCustom {
    Optional<PostKeyword> findByContent(String keywordContent);
}
