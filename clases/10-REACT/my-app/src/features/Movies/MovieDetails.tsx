import { useParams, useNavigate } from "react-router-dom";
import { useEffect, useState } from "react";
import { getMovieById } from "../../services/movies.service";
import type { Movie } from "../../models/movie.model";

/**
 * Componente que muestra el detalle completo de una película seleccionada.
 * Utiliza hooks para obtener el ID de la URL y navegar de regreso.
 */
export default function MovieDetails() {
  const { id } = useParams<{ id: string }>(); // Extraemos el ID de los parámetros de la URL
  const navigate = useNavigate();             // Hook para navegación programática
  const [movie, setMovie] = useState<Movie | null>(null); // Estado para la película encontrada
  const [loading, setLoading] = useState(true);           // Estado de carga

  useEffect(() => {
    if (!id) return;

    let isMounted = true;

    // Obtenemos los detalles de la película mediante su ID
    getMovieById(id)
      .then((data) => {
        if (isMounted) setMovie(data);
      })
      .catch((error) => {
        console.error("Error fetching movie:", error);
      })
      .finally(() => {
        if (isMounted) setLoading(false);
      });

    return () => {
      isMounted = false;
    };
  }, [id]);

  // Pantalla de carga (Skeleton simple con animación pulse)
  if (loading) {
    return (
      <div className="max-w-4xl mx-auto py-10 animate-pulse">
        <div className="flex flex-col md:flex-row gap-10">
          <div className="w-full md:w-1/3 bg-slate-800 aspect-[2/3] rounded-2xl"></div>
          <div className="flex-grow space-y-6">
            <div className="h-10 w-3/4 bg-slate-800 rounded"></div>
            <div className="h-6 w-1/4 bg-slate-800 rounded"></div>
            <div className="space-y-3">
              <div className="h-4 w-full bg-slate-800 rounded"></div>
              <div className="h-4 w-full bg-slate-800 rounded"></div>
              <div className="h-4 w-2/3 bg-slate-800 rounded"></div>
            </div>
          </div>
        </div>
      </div>
    );
  }

  // Si no se encuentra la película con el ID proporcionado
  if (!movie) {
    return (
      <div className="max-w-4xl mx-auto py-10 text-center">
        <h1 className="text-3xl font-bold mb-4">Película no encontrada</h1>
        <button
          onClick={() => navigate("/movies")}
          className="bg-blue-600 hover:bg-blue-700 text-white px-6 py-2 rounded-lg transition-colors"
        >
          Volver a la lista
        </button>
      </div>
    );
  }

  return (
    <div className="max-w-4xl mx-auto py-10 px-4">
      {/* Botón de volver a la vista principal */}
      <button
        onClick={() => navigate("/movies")}
        className="mb-8 text-slate-400 hover:text-white flex items-center gap-2 transition-colors"
      >
        <span>← Volver a la lista</span>
      </button>

      <div className="flex flex-col md:flex-row gap-10">
        {/* Columna Izquierda: Imagen del Poster */}
        <div className="w-full md:w-1/3">
          <img
            src={movie.posterUrl}
            alt={movie.title}
            className="w-full rounded-2xl shadow-2xl border border-slate-800"
          />
        </div>

        {/* Columna Derecha: Título, Año y Sinopsis */}
        <div className="flex-grow space-y-6">
          <div className="space-y-2">
            <h1 className="text-4xl md:text-5xl font-extrabold text-white tracking-tight">
              {movie.title}
            </h1>
            <p className="text-xl text-blue-400 font-medium">{movie.year}</p>
          </div>

          <div className="space-y-4">
            <h2 className="text-xl font-semibold text-slate-200">Sinopsis</h2>
            <p className="text-lg text-slate-400 leading-relaxed">
              {movie.description}
            </p>
          </div>

          {/* Área de depuración para desarrolladores */}
          <div className="pt-8 border-t border-slate-800">
            <p className="text-slate-500 mb-2 font-mono text-xs uppercase tracking-widest">
              Debug Info
            </p>
            <div className="bg-black/30 p-4 rounded-lg border border-slate-700/50 backdrop-blur-sm">
              <code className="text-blue-400/80 text-sm">
                ID: {movie.id} | Path: /movies/{id}
              </code>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}
