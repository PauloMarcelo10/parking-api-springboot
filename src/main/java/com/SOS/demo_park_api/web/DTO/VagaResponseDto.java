package com.SOS.demo_park_api.web.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class VagaResponseDto {

    private Long id;
    private String codigo;
    private String status;
}
