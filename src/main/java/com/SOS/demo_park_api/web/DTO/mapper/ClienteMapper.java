package com.SOS.demo_park_api.web.DTO.mapper;


import com.SOS.demo_park_api.entity.Cliente;
import com.SOS.demo_park_api.web.DTO.ClienteCreateDto;
import com.SOS.demo_park_api.web.DTO.ClienteResponseDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteMapper {
    public static Cliente toCliente(ClienteCreateDto dto) {
        return new ModelMapper().map(dto, Cliente.class);
    }

    public static ClienteResponseDto toDto(Cliente cliente) {
        return new ModelMapper().map(cliente, ClienteResponseDto.class);
    }
}
