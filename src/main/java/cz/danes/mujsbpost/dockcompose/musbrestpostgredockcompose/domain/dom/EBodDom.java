package cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.dom;

import cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.model.AppName;
import lombok.Builder;
import lombok.Data;
import org.springframework.lang.NonNull;


@Data
@Builder
public class EBodDom {
    @NonNull
    private AppName appName;
    @NonNull
    private String ipCameraRight;
}
