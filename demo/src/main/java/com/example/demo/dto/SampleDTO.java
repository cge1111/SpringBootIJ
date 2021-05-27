package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
public class SampleDTO {
    private Long sno;
    private String frist;
    private String last;
    private LocalDateTime regTime;

}
