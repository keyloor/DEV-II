export default function Header() {
  return (
    <header className="bg-slate-800 border-b border-slate-700 sticky top-0 z-50">
      <nav className="container mx-auto px-4 h-16 flex items-center justify-between">
        <a
          href="/"
          className="text-xl font-bold bg-gradient-to-r from-blue-400 to-indigo-400 bg-clip-text text-transparent"
        >
          CINE-MAX
        </a>
        <div className="flex gap-6">
          <a
            href="/"
            className="hover:text-blue-400 transition-colors font-medium"
          >
            Home
          </a>
          <a
            href="/movies"
            className="hover:text-blue-400 transition-colors font-medium"
          >
            Movies
          </a>
        </div>
      </nav>
    </header>
  );
}
