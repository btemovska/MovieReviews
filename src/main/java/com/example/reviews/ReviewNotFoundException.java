package com.example.reviews;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND, reason="Bad Request, Review Not Found!")
public class ReviewNotFoundException extends Exception {


}
