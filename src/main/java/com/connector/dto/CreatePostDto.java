package com.connector.dto;

import com.connector.domain.Post;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class CreatePostDto {
    private String text;

    public Post toEntity(Long userId) {
        return new Post().builder()
                .userId(userId)
                .content(text)
                .likes(new ArrayList<>())
                .comments(new ArrayList<>())
                .build();
    }
}
