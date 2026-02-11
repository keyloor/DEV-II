import { BrowserRouter, Route, Routes } from "react-router-dom";

import "./App.css";
import Header from "./shared/Header";
import { Footer } from "./shared/Footer";
import NotFound from "./shared/NotFound";
import { Home } from "./features/Home/Home";
import { Movies } from "./features/Movies/Movie";
import MovieDetails from "./features/Movies/MovieDetails";

function App() {
  return (
    <BrowserRouter>
      <div className="min-h-screen bg-slate-900 text-slate-100 flex flex-col">
        <Header />

        <main className="flex-grow container mx-auto px-4 py-8">
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/home" element={<Home />} />
            <Route path="/movies" element={<Movies />} />
            <Route path="/movies/:id" element={<MovieDetails />} />
            <Route path="*" element={<NotFound />} />
          </Routes>
        </main>

        <Footer />
      </div>
    </BrowserRouter>
  );
}

export default App;
