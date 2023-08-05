package cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.repository;

import cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.entity.EBod;
import cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.model.AppName;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.Optional;

public interface EBodRepository extends JpaRepository<EBod, AppName> {
    Optional<EBod> findByIpCameraRight(@NonNull String ipCamera);

    default @NonNull EBod findByIpCameraRightOrElseThrow(@NonNull String ipCameraRight) {
        return findByIpCameraRight(ipCameraRight).orElseThrow(EntityNotFoundException::new);
    }
}
