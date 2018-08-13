package com.hand.exam1.service;

import com.hand.exam1.model.Film;

public interface FilmService {
    public Boolean insert(Film film);
    public Film selectById(int id);
    public int selectId();
    public void deleteFilm(int deleteFilm);


}
