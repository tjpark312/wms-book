package com.sh.book.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {
    private int bookId;
    private String title;
    private String author;
    private String description;
    private Double price;
    private String category;
    private LocalDateTime createdAt;
}
