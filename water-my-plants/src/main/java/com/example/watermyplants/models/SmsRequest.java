package com.example.watermyplants.models;

//import com.fasterxml.jackson.annotation.JsonProperty;
//import org.springframework.beans.factory.annotation.Value;
//
//import javax.validation.constraints.NotBlank;
//
//public class SmsRequest {
//
//
//    @NotBlank
//    private String phoneNumber;
//
//    @NotBlank
//    private final String message;
//
//    public SmsRequest(@JsonProperty("phoneNumber") String phoneNumber,
//                      @JsonProperty("message") String message) {
//
//        this.phoneNumber = phoneNumber;
//        this.message = message;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    @Override
//    public String toString() {
//        return "SmsRequest{" +
//                "phoneNumber='" + phoneNumber + '\'' +
//                ", message='" + message + '\'' +
//                '}';
//    }
//}