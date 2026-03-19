package com.SOS.demo_park_api.web.DTO.mapper;


import com.SOS.demo_park_api.entity.Vaga;
import com.SOS.demo_park_api.web.DTO.VagaCreateDto;
import com.SOS.demo_park_api.web.DTO.VagaResponseDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VagaMapper {

    public static Vaga toVaga(VagaCreateDto dto) {
        return new ModelMapper().map(dto, Vaga.class);
    }

    public static VagaResponseDto toDto(Vaga vaga) {
        return new ModelMapper().map(vaga, VagaResponseDto.class);
    }


}
