package cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.mapper;

import cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.dto.EBodDto;
import cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.entity.EBod;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public abstract class EBodMapper {

//        EBod convertEBodDomToEBod(EBodDto eBodDto);
//        @Mapping(target = "appName", source = "EBod.appName")
//        @Mapping(target = "ipCameraRight", source = "EBod.ipCameraRight")
        @Mapping(target = "ipCameraRight", source = "ipCameraRight")
        public abstract  EBodDto convertEBodToEBodDom(EBod Ebod);
}
