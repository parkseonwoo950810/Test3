package org.example.Test.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsRetrieveRequestDto {
    private String title;
    private String author;

    @Builder
    public PostsRetrieveRequestDto(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
