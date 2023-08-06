package cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.controller;

import cz.danes.mujsbpost.dockcompose.musbrestpostgredockcompose.domain.service.EBodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class Controller {

    @Autowired
    EBodService eBodService;

    @RequestMapping("/insert/{stringID}")
    public String helloIinsert(@PathVariable String stringID) {
        LocalDateTime now = LocalDateTime.now();
        String s = "hello " + now;
        log.info("message" + s);
        eBodService.insertEBod(stringID);
        return s;
    }

    @RequestMapping("/list")
    public String helloList() {
        LocalDateTime now = LocalDateTime.now();
        String s = "hello " + now;
        log.info("message" + s);
        String s1 = eBodService.listEBod();
        String s2 = eBodService.listEBodDto();
        return s1 + " " + s2+" "+s;
    }
}
