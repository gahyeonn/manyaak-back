package com.manyaak.manyaakback.global.exception;

import lombok.Getter;

@Getter
public enum ExceptionCode {
    MEMBER_NOT_EXISTS(404, "해당 멤버가 존재하지 않습니다");

    private int status;
    private String message;

    ExceptionCode(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
