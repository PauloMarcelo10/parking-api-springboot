package com.SOS.demo_park_api.web.DTO.mapper;


import com.SOS.demo_park_api.entity.ClienteVaga;
import com.SOS.demo_park_api.web.DTO.EstacionamentoCreateDto;
import com.SOS.demo_park_api.web.DTO.EstacionamentoResponseDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteVagaMapper {

    public static ClienteVaga toClienteVaga(EstacionamentoCreateDto dto) {
        return new ModelMapper().map(dto, ClienteVaga.class);
    }

    public static EstacionamentoResponseDto toDto(ClienteVaga clienteVaga) {
        return new ModelMapper().map(clienteVaga, EstacionamentoResponseDto.class);
    }
}
