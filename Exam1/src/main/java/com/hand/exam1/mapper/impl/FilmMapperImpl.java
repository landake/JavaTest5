package com.hand.exam1.mapper.impl;

import com.hand.exam1.mapper.BaseMapper;
import com.hand.exam1.mapper.FilmMapper;
import com.hand.exam1.model.Film;
import org.springframework.stereotype.Repository;

@Repository(value = "filmMapper")
public class FilmMapperImpl extends BaseMapper implements FilmMapper {
    @Override
    public Boolean insert(Film film) {
        try {
            this.getSqlSession().insert("film.insert" , film);
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Film selectById(int id) {
        Film film = null;
        try {
            film = this.getSqlSession().selectOne("film.selectById" , id);
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return film;
    }

    @Override
    public int selectId() {
        int maxId = 0;
        try {
            maxId = this.getSqlSession().selectOne("film.selectId");
        }catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return maxId;
    }

    @Override
    public void deleteFilm(int deleteFilm) {
        try {
            this.getSqlSession().selectOne("film.deleteFilm");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
