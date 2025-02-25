package br.com.fiap.ms_produto.controller.handlers.dto;




import java.time.Instant;


public class CustomErrorDTO {

    private Instant timesstamp;
    private Integer status;
    private String error;
    private String path;

    public CustomErrorDTO() {
    }

    public CustomErrorDTO(Instant timesstamp, Integer status, String error, String path) {
        this.timesstamp = timesstamp;
        this.status = status;
        this.error = error;
        this.path = path;
    }

    public Instant getTimesstamp() {
        return timesstamp;
    }

    public Integer getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getPath() {
        return path;
    }
}
