package cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.mapper;

import cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.dom.EBodDom;
import cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.entity.EBod;
import org.mapstruct.Mapper;
@Mapper(
        componentModel = "spring"
)
public interface EBodMapper {

        EBod convertEBodDomToEBod(EBodDom eBodDom);
        EBodDom convertEBodToEBodDom(EBod Ebod);
}
