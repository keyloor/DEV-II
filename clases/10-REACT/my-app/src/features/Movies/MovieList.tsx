import type { Movie } from "../../models/movie.model";
import { MovieCard } from "./MovieCard";

export default function MovieList() {
    const movies: Movie[] = [
        {
            id: "1",
            title: "The Batman",
            description: "First Batman Movie."
        },

        {
            id: "2",
            title: "Movie",
            description: "New movie."
        }
        
    ];


    return(
        <div>
            {movies.map(movie =>(
                <MovieCard key = {movie.id} {...movie}/>
            ))}
        </div>
    );
}