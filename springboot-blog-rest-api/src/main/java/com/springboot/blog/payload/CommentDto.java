package com.springboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {
   private long id;

   // name should not be empty or null
   @NotEmpty(message = "name should not be empty or null")
   private String name;

   // email should not be empty or null
   // email field validation
   @NotEmpty(message = "email should not be empty or null")
   @Email
   private String email;

   // comment body should not be empty or null
   // comment body must be minimum 10 characters
   @NotEmpty
   @Size(min = 10,message = "Comment body must be minimum 10 characters")
   private String body;
}
