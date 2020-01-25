package com.example.usersystem.App.services.impl;

import com.example.usersystem.App.entities.Towns;
import com.example.usersystem.App.repositories.TownsRepository;
import com.example.usersystem.App.services.TownsService;
import com.example.usersystem.App.util.TownUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TownsServiceImpl implements TownsService {

    private final TownsRepository townsRepository;
    private final TownUtil townUtil;

    @Autowired
    public TownsServiceImpl(TownsRepository townsRepository, TownUtil townUtil) {
        this.townsRepository = townsRepository;
        this.townUtil = townUtil;
    }

    @Override
    public void addTown() {
        Towns town = this.townUtil.insertTownsProps();
        this.townsRepository.saveAndFlush(town);
    }
}
