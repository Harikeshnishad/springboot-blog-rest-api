package com.springboot.blog.payload;

import com.springboot.blog.entity.Comment;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class PostDto {
    private long id;

    // title should not be empty or null
    // title should have at least 2 characters
    @NotEmpty
    @Size(min = 2,message = "Post title should have at least 2 characters")
    private String title;

    // Post description should not be null or empty
    // Post description should have at least 10 characters
    @NotEmpty
    @Size(min = 10,message = "Post description should have at least 10 characters")
    private String description;

    // post content should not be empty or null
    @NotEmpty
    private String content;
    private Set<CommentDto>comments;
}
