package com.hand.exam1.service.impl;

import com.hand.exam1.mapper.FilmMapper;
import com.hand.exam1.model.Film;
import com.hand.exam1.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value="filmService")
public class FilmServiceImpl implements FilmService {
    @Autowired
    @Qualifier(value = "filmMapper")
    private FilmMapper filmMapper;

    @Override
    public Boolean insert(Film film) {
        try{
            filmMapper.insert(film);
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Film selectById(int id) {
        Film customer = null;
        try{
            customer = filmMapper.selectById(id);
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return customer;
    }

    @Override
    public int selectId() {
        int maxId = 0;
        try {
            maxId = filmMapper.selectId();
        }catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return maxId;
    }
    @Override
    public void deleteFilm(int deleteFilm) {
        try {
            filmMapper.deleteFilm(deleteFilm);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public FilmMapper getFilmMapper() {
        return filmMapper;
    }

    public void setFilmMapper(FilmMapper filmMapper) {
        this.filmMapper = filmMapper;
    }
}
