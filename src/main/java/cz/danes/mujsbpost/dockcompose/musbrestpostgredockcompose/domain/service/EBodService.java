package cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.service;

import cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.entity.EBod;
import cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.mapper.EBodMapper;
import cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.model.AppName;
import cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.repository.EBodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EBodService {

    @Autowired
    private EBodRepository ebodRepository;

    @Autowired
    EBodMapper eBodMapper;

    public void insertEBod(String stringID) {
        EBod e = new EBod();
        e.setAppName(AppName.VRATA_KV);
        e.setIpCameraRight(stringID);
        ebodRepository.save(e);
    }

    public String listEBod() {
        List<EBod> all = ebodRepository.findAll();
        return all.toString();
    }

}
