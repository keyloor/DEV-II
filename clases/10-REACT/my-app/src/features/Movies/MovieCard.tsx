import type { Movie } from "../../models/movie.model";

/**
 * Componente de tarjeta individual para una película.
 * Al hacer clic, navega a la página de detalles mediante el `id`.
 */
export function MovieCard(props: Movie) {
  return (
    <a
      href={`/movies/${props.id}`}
      className="group relative bg-slate-800 rounded-xl overflow-hidden hover:ring-2 hover:ring-blue-500 transition-all block"
    >
      {/* Contenedor de la imagen con efecto de zoom al hacer hover */}
      <div className="aspect-[2/3] overflow-hidden">
        <img
          src={props.posterUrl}
          alt={props.title}
          className="w-full h-full object-cover group-hover:scale-110 transition-transform duration-500"
        />
      </div>
      {/* Información básica de la película súper puesta */}
      <div className="p-4 bg-gradient-to-t from-slate-900 to-transparent">
        <h3 className="font-bold text-lg truncate">{props.title}</h3>
        <p className="text-slate-400 text-sm">{props.year}</p>
      </div>
    </a>
  );
}
