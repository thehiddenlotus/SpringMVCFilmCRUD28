package com.skilldistillery.film.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.skilldistillery.film.entities.Actor;
import com.skilldistillery.film.entities.Film;

@Component
public class FilmDAOJdbcImpl implements FilmDAO {

	@Override
	Film findFilmById(int filmId) {

	}

	@Override
	String findLanguage(int filmId);

	@Override
	List<Film> findFilmsByKeyword(String keyword);

	@Override
	List<Actor> findActorsByFilmId(int filmID);

}
