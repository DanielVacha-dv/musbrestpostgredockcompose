package cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.entity;

import cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.model.AppName;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor(force = true)
@Table(name = "ebod", schema = "fis_ext")
public class EBod {

    @Id
    @NonNull
    @Enumerated(EnumType.STRING)
    @Column(name = "appname", nullable = false)
    private AppName appName;

    @Nullable
    @Column(name = "ipcamera_right_new")
    private String ipCameraRight;
}
