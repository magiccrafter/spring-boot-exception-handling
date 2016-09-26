package com.example.rest.error;

/**
 * @author magiccrafter
 */
public class ApiErrorResponse {

    private int status;
    private int code;

    public ApiErrorResponse(int status, int code) {
        this.status = status;
        this.code = code;
    }

    public int getStatus() {
        return status;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "ApiErrorResponse{" +
                "status=" + status +
                ", code=" + code +
                '}';
    }
}
