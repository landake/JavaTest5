package com.hand.exam1.mapper;

import com.hand.exam1.model.Film;

public interface FilmMapper {
    public Boolean insert(Film film);
    public Film selectById(int id);
    public int selectId();
    public void deleteFilm(int deleteFilm);

}