package com.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "movieDetails")
public class MovieDetail {

    @Id
    private String id;
    private String title;
    private String director;
    private String plot;
    private String poster;
    private String type;
    private String rated;
    private String[] countries;
    private String[] genres;
    private String[] writers;
    private String[] actors;
    private Integer metacritic;
    private Integer year;
    private Integer runtime;
    private Date released;
    private IMDB imdb;
    private Awards awards;
    private Tomato tomato;

    public void assignValuesFrom(MovieDetail movieDetail) {
        if(movieDetail.getTitle() != null)
            this.title = movieDetail.getTitle();
        if(movieDetail.getDirector() != null)
            this.director = movieDetail.getDirector();
        if(movieDetail.getPlot() != null)
            this.plot = movieDetail.getPlot();
        if(movieDetail.getPoster() != null)
            this.poster = movieDetail.getPoster();
        if(movieDetail.getType() != null)
            this.type = movieDetail.getType();
        if(movieDetail.getRated() != null)
            this.rated = movieDetail.getRated();
        if(movieDetail.getCountries() != null)
            this.countries = movieDetail.getCountries();
        if(movieDetail.getDirector() != null)
            this.genres = movieDetail.getGenres();
        if(movieDetail.getWriters() != null)
            this.writers = movieDetail.getWriters();
        if(movieDetail.getActors() != null)
            this.actors = movieDetail.getActors();
        if(movieDetail.getMetacritic() != null)
            this.metacritic = movieDetail.getMetacritic();
        if(movieDetail.getYear() != null)
            this.year = movieDetail.getYear();
        if(movieDetail.getRuntime() != null)
            this.runtime = movieDetail.getRuntime();
        if(movieDetail.getReleased() != null)
            this.released = movieDetail.getReleased();
        if(movieDetail.getImdb() != null)
            this.imdb = movieDetail.getImdb();
        if(movieDetail.getAwards() != null)
            this.awards = movieDetail.getAwards();
        if(movieDetail.getTomato() != null)
            this.tomato = movieDetail.getTomato();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String[] getCountries() {
        return countries;
    }

    public void setCountries(String[] countries) {
        this.countries = countries;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public String[] getWriters() {
        return writers;
    }

    public void setWriters(String[] writers) {
        this.writers = writers;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public Integer getMetacritic() {
        return metacritic;
    }

    public void setMetacritic(Integer metacritic) {
        this.metacritic = metacritic;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public Date getReleased() {
        return released;
    }

    public void setReleased(Date released) {
        this.released = released;
    }

    public IMDB getImdb() {
        return imdb;
    }

    public void setImdb(IMDB imdb) {
        this.imdb = imdb;
    }

    public Tomato getTomato() {
        return tomato;
    }

    public void setTomato(Tomato tomato) {
        this.tomato = tomato;
    }

    public Awards getAwards() {
        return awards;
    }

    public void setAwards(Awards awards) {
        this.awards = awards;
    }

}
