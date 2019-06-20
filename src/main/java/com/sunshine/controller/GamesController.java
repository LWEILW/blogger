package com.sunshine.controller;

import com.sunshine.entity.Games;
import com.sunshine.server.GamesService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "[APP-测试接口]-FrontExaminationReportController")
@RestController
@RequestMapping("/games")
public class GamesController {

    @Autowired
    private GamesService gamesService;

    @GetMapping("/gamesList")
    public List<Games> gamesList() {
        return gamesService.gamesList();
    }
}