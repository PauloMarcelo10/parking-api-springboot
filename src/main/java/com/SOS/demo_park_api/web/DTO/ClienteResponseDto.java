package com.SOS.demo_park_api.web.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ClienteResponseDto {
    private Long id;
    private String nome;
    private String cpf;
}
