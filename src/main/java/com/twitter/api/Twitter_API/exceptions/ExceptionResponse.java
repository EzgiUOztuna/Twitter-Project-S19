package com.twitter.api.Twitter_API.exceptions;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public class ExceptionResponse {
    private String message;
    private int status;
    private LocalDateTime dateTime;

    public ExceptionResponse(String message, int status, LocalDateTime dateTime) {
        this.message = message;
        this.status = status;
        this.dateTime = dateTime;
    }
}
