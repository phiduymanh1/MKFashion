package com.example.shopquanaomk.Dto.ResponDto;

public class SizeDtoResponse {
    private Integer id;

    private String name;

    public SizeDtoResponse() {
    }

    public SizeDtoResponse(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
