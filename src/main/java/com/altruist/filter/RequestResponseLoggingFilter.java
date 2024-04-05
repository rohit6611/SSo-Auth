package com.altruist.filter;

import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//public class RequestResponseLoggingFilter extends OncePerRequestFilter {
//
//    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        LocalDateTime now = LocalDateTime.now();
//
//        StringBuilder requestBodyBuilder = new StringBuilder();
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                requestBodyBuilder.append(line);
//            }
//        }
//        
//        // Log request
//        System.out.println(now.format(dateTimeFormatter) + " - REQUEST DATA:" + requestBodyBuilder.toString());
//        System.out.println(now.format(dateTimeFormatter) + " - Request URL: " + request.getRequestURL());
//        System.out.println(now.format(dateTimeFormatter) + " - HTTP Method: " + request.getMethod());
//        // Log other request details as needed
//
//        // Proceed with the request
//        filterChain.doFilter(request, response);
//
//        // Log response
//        System.out.println(now.format(dateTimeFormatter) + " - RESPONSE DATA:");
//        System.out.println(now.format(dateTimeFormatter) + " - HTTP Status: " + response.getStatus());
//        // Log other response details as needed
//    }
//}

