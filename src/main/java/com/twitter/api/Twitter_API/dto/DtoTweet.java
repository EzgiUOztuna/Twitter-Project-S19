package com.twitter.api.Twitter_API.dto;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DtoTweet {

    private String content;
    private LocalDateTime createdAt;
}
