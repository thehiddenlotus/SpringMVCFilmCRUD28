package com.skilldistillery.film.dao;

import java.util.List;

import com.skilldistillery.film.entities.Actor;
import com.skilldistillery.film.entities.Film;

public interface FilmDAO {

	Film findFilmById(int filmId);

	String findLanguage(int filmId);

	List<Film> findFilmsByKeyword(String keyword);

	List<Actor> findActorsByFilmId(int filmID);
	
	boolean createFilm(Film film);
	
	boolean updateFilm(Film film);
	
	boolean deleteFilm(int id);
	
}
