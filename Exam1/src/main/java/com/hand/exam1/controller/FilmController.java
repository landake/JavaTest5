package com.hand.exam1.controller;

import com.hand.exam1.model.Film;
import com.hand.exam1.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FilmController {

    @Autowired
    @Qualifier(value = "filmService")
    private FilmService filmService;

    @RequestMapping(value = "/insert")
    public String submit(int film_id , String title  , String description , int languageId, Model model){
        Film film  = new Film();
        film.setFilmId(film_id);
        film.setTitle(title);
        film.setDescription(description);
        film.setLanguageId(languageId);

        filmService.insert(film);
        return "info";

    }



    public FilmService getFilmServiceService() {
        return filmService;
    }

    public void setFilmServiceService(FilmService filmService) {
        this.filmService = filmService;
    }
}
