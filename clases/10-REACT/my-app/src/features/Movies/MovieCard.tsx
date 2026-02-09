import type { Movie } from "../../models/movie.model";

export function MovieCard(props: Movie) {
    return(
        <a href={`/movies/${props.id}`} className="movie-card">
            <p>Titulo: {props.title}</p>
            <p>Description: {props.description}</p>
        </a>
    );
}
