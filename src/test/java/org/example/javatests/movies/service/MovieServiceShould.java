package org.example.javatests.movies.service;

import org.example.javatests.movies.data.MovieRepository;
import org.example.javatests.movies.model.Genre;
import org.example.javatests.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceShould {

    private MovieService movieService;
    @Before
    public void setUp() throws Exception {
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);
        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 153, Genre.ACTION),
                        new Movie(2, "Memento", 160, Genre.ACTION),
                        new Movie(3, "Syper 8", 153, Genre.COMEDY),
                        new Movie(4, "HomeAlone", 153, Genre.COMEDY)
                )
        );

        movieService = new MovieService(movieRepository);
    }
    @Test
    public void return_movies_by_genre() {

        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);
        List<Integer> movieIds = getMovieIds(movies);
        assertThat(movieIds, CoreMatchers.is(Arrays.asList(3, 4)));

    }

    @Test
    public void return_movies_by_length(){
        Collection<Movie> movies = movieService.findMoviesByLength(155);
        List<Integer> movieIds = getMovieIds(movies);
        assertThat(movieIds, CoreMatchers.is(Arrays.asList(1, 3, 4)));
    }

    private List<Integer> getMovieIds(Collection<Movie> movies) {
        return movies.stream().map(Movie::getId).collect(Collectors.toList());
    }
}