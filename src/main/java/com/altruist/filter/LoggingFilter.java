package com.altruist.filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import lombok.extern.slf4j.Slf4j;



//@Component
//@Slf4j
//public class LoggingFilter extends OncePerRequestFilter {
//
//	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingFilter.class);
//
//
//	private String getStringValue(byte[] contentAsByteArray, String characterEncoding) {
//		try {
//			return new String(contentAsByteArray, 0, contentAsByteArray.length, characterEncoding);
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//		return "";
//	}
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//            throws ServletException, IOException {
//        // TODO Auto-generated method stub
//        ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(request);
//		ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);
//
//		long startTime = System.currentTimeMillis();
//		filterChain.doFilter(requestWrapper, responseWrapper);
//		long timeTaken = System.currentTimeMillis() - startTime;
//
//		String requestBody = getStringValue(requestWrapper.getContentAsByteArray(),
//				request.getCharacterEncoding());
//		String responseBody = getStringValue(responseWrapper.getContentAsByteArray(),
//				response.getCharacterEncoding());
//
//		log.info(
//				"FINISHED PROCESSING : METHOD={}; REQUESTURI={}; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
//				request.getMethod(), request.getRequestURI(), requestBody, response.getStatus(), responseBody,
//				timeTaken+"ms");
//		responseWrapper.copyBodyToResponse();
//    }
//
//}
