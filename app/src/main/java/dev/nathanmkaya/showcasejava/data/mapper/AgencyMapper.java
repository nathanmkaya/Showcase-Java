package dev.nathanmkaya.showcasejava.data.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import dev.nathanmkaya.showcasejava.data.model.Agency;
import dev.nathanmkaya.showcasejava.data.remote.response.AgenciesItem;

@Mapper
public interface AgencyMapper {

    AgencyMapper Instance = Mappers.getMapper(AgencyMapper.class);

    Agency responseToModel(AgenciesItem agenciesItem);

    @InheritInverseConfiguration
    AgenciesItem modelToResponse(Agency agency);

}
