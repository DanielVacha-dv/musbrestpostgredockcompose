package cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AppName {
    VRATA_M1("31", "M1", "M1"),
    VRATA_M13("31", "M13", "M13"),
    VRATA_KV("33", "KV", "KV");

    private final @NonNull String factoryCode;
    private final @NonNull String hallCode;
    private final @NonNull String assemblyLine;
}
