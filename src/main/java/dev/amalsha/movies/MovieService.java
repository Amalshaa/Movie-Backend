package dev.amalsha.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository  movieRepository;

    public List<Movie> allMovies(){
        List<Movie> movies = movieRepository.findAll();
        System.out.println(movies); // Debugging line
        return movies;
    }


    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
