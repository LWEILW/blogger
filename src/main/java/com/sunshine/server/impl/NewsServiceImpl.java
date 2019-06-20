package com.sunshine.server.impl;

import com.sunshine.dao.NewsMapperEx;
import com.sunshine.entity.News;
import com.sunshine.server.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("NewsService")
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapperEx newsMapperEx;


    @Override
    public List<News> newsList() {
        return newsMapperEx.newsList();
    }
}