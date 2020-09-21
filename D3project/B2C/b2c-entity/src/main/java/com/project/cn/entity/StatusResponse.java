package com.project.cn.entity;

public class StatusResponse {

    private int status;

    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    public StatusResponse(StatusEnum statusEnum) {
        this.message=statusEnum.getMessage();
        this.status=statusEnum.getStatus();
    }
}
