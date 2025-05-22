package com.emoney2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Map;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto<T> {
    private T data;
    private String statusCode;
    private String statusMessage;
    private String sectionName;
    private int page;
    private int pageSize;
    private String sectionDescription;
    private String sectionPosition;
    private Object error;
    private String failedProductsFileUrl;
    private String failedProductsCount;
    private String orderNumber;

    public ResponseDto(T data, String statusCode, String statusMessage,String sectionName,String sectionDescription, String sectionPosition, int page,int pageSize) {
        this.data = data;
        this.sectionName = sectionName;
        this.sectionDescription = sectionDescription;
        this.sectionPosition = sectionPosition;
        this.page = page;
        this.pageSize = pageSize;
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;

    }

    public ResponseDto(String statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    public ResponseDto(T data, String failedProductsFileUrl, String failedProductsCount){
        this.data = data;
        this.failedProductsFileUrl = failedProductsFileUrl;
        this.failedProductsCount = failedProductsCount;
    }

    public ResponseDto(T data, String orderNumber){
        this.data = data;
        this.orderNumber = orderNumber;
    }

    public ResponseDto(Map<String, Object> responseData) {
        this.data = (T) responseData;
    }
}