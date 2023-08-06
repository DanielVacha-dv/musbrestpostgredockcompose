package cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.dto;

import cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.model.AppName;
import lombok.Data;
import org.springframework.lang.NonNull;


@Data
public class EBodDto {
    public EBodDto() {
    }

    @NonNull
    private AppName appName;
    @NonNull
    private String ipCameraRight;
}
