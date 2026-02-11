/**
 * Componente funcional de la página principal (Home).
 * Muestra un mensaje de bienvenida y un enlace a la lista de películas.
 */
export function Home() {
  return (
    <section className="flex flex-col items-center justify-center py-20 text-center">

      <h1 className="text-5xl md:text-7xl font-extrabold mb-6 tracking-tight">
        BIENVENIDO A <span className="text-blue-500">CINE-MAX</span>
      </h1>

      {/* Enlace estético para navegar a la sección de películas */}
      <a
        href="/movies"
        className="bg-blue-600 hover:bg-blue-700 text-white px-8 py-3 rounded-full font-bold transition-transform hover:scale-105"
      >
        Explorar Películas
      </a>

    </section>
  );
}
