package org.example.Test.domain.posts;

import org.example.Test.web.dto.PostsRetrieveRequestDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long>{

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();

    /*임의추가*/
    @Query("SELECT p FROM Posts p where p.title like %:title% or p.author like %:author% ORDER BY p.id DESC")
    List<Posts> findByTitleLikeAndAuthorLike(PostsRetrieveRequestDto requestDto);

}
