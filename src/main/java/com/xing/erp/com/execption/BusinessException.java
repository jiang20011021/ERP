package com.xing.erp.com.execption;

import com.xing.erp.com.util.ResponseStatus;

public class BusinessException extends RuntimeException{
    public BusinessException(ResponseStatus status204) {
    }
}
