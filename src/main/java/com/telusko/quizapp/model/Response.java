package com.telusko.quizapp.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

//Get score
@Data
@RequiredArgsConstructor
public class Response {
    private Integer id;
    private String response;
}
