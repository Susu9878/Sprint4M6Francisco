import { useEffect, useState } from "react";
import VideogameCardFactory from "../components/card/VideogameCardFactory";
import "../styles/example.css";

export default function Example() {
  /*
    ==================================================
    SUBJECT (ESTADO OBSERVADO)
    ==================================================

    React observará cambios en "genre".

    Cuando "genre" cambie:
    - React notificará componentes
    - useEffect reaccionará automáticamente
    - GraphQL cambiará el query

    Esto representa el patrón Observer.
    */
  const [genre, setGenre] = useState("");

  /*
    ==================================================
    VIDEOGAMES ARCHIVE
    ==================================================

    Guarda la información obtenida desde GraphQL.
    */
  const [games, setGames] = useState([]);

  /*
    ==================================================
    ESTADO DE ERRORES
    ==================================================
    */
  const [error, setError] = useState(null);

  /*
    ==================================================
    QUERIES DINÁMICOS
    ==================================================

    Cada género solicita información distinta.

    Esto simula cómo Netflix solicita
    diferentes datos dependiendo de la vista.
    */
  const queries = {
    PUZZLES: `
            query {
                getGamesByGenre(genre:"PUZZLES") {
                    id
                    title
                    genre
                    releaseYear
                    studio
                    price
                    description
                    ageRating
                    status
                }
            }
        `,

    RPG: `
            query {
                getGamesByGenre(genre:"RPG") {
                    id
                    title
                    genre
                    releaseYear
                    studio
                    price
                    description
                    ageRating
                    status
                }
            }
        `,

    VISUAL_NOVELS: `
            query {
                getGamesByGenre(genre:"VISUAL_NOVELS") {
                    id
                    title
                    genre
                    releaseYear
                    studio
                    price
                    description
                    ageRating
                    status
                }
            }
        `,

    FIGHTER: `
            query {
                getGamesByGenre(genre:"FIGHTER") {
                    id
                    title
                    genre
                    releaseYear
                    studio
                    price
                    description
                    ageRating
                    status
                }
            }
        `,

    ROGUELIKE: `
            query {
                getGamesByGenre(genre:"ROGUELIKE") {
                    id
                    title
                    genre
                    releaseYear
                    studio
                    price
                    description
                    ageRating
                    status
                }
            }
        `,
  };

  /*
    ==================================================
    OBSERVER
    ==================================================

    useEffect está OBSERVANDO "genre".

    El arreglo [genre] funciona como:
    - lista de dependencias
    - suscripción
    - observer

    Cuando genre cambia:
    - React detecta el cambio
    - ejecuta automáticamente getMovies()

    Esto es comportamiento Observer.
    */
  useEffect(() => {
    QuerySubject.subscribe(GamesObserver);
    QuerySubject.subscribe(StatsObserver);

    return () => {
      QuerySubject.unsubscribe(GamesObserver);
      QuerySubject.unsubscribe(StatsObserver);
    };
  }, []);

  /*
    ==================================================
    FETCH GRAPHQL
    ==================================================
    */
  const getGames = async () => {
    try {
      /*
            ==========================================
            QUERY DINÁMICO
            ==========================================

            Dependiendo del género seleccionado,
            se obtiene un query diferente.
            */
      const query = queries[genre];

      const res = await fetch("http://localhost:8080/graphql", {
        method: "POST",

        headers: {
          "Content-Type": "application/json",
        },

        body: JSON.stringify({ query }),
      });

      const data = await res.json();

      console.log(data);

      /*
            ==========================================
            MANEJO DE ERRORES
            ==========================================
            */
      if (data.errors) {
        setError(data.errors[0]?.message);

        setGames([]);

        return;
      }

      /*
            ==========================================
            ACTUALIZACIÓN REACTIVA
            ==========================================

            React actualizará automáticamente la UI
            cuando movies cambie.
            */
      setGames(data?.data?.getGamesByGenre ?? []);

      setError(null);
    } catch (err) {
      console.log(err);

      setError("Error de conexión");

      setGames([]);
    }
  };

  const changeGenre = (newGenre) => {
    setGenre(newGenre);

    QuerySubject.notify(newGenre);
  };

  return (
    <div>
      <h1>Archive</h1>

      <p>
        Genre:
        <strong> {genre}</strong>
      </p>

      {/* ======================================
                BOTONES
            ======================================

            Cuando se hace click:
            - cambia genre
            - React detecta cambio
            - useEffect reacciona
            - GraphQL cambia query
            - UI cambia automáticamente

            Flujo completo Observer.
            ====================================== */}
      <div className="genres">
        <button onClick={() => changeGenre("PUZZLES")} className="puzzleButton">
          Puzzles
        </button>

        <button onClick={() => changeGenre("RPG")} className="rpgButton">
          RPG
        </button>

        <button
          onClick={() => changeGenre("VISUAL_NOVELS")}
          className="vnButton"
        >
          Visual Novels
        </button>

        <button
          onClick={() => changeGenre("FIGHTER")}
          className="fighterButton"
        >
          Fighter
        </button>

        <button
          onClick={() => changeGenre("ROGUELIKE")}
          className="roguelikeButton"
        >
          Roguelike
        </button>
      </div>

      <br />

      {error && <p style={{ color: "red" }}>{error}</p>}

      {/* ======================================
                RENDERIZADO REACTIVO
            ======================================

            Cuando movies cambia:
            React vuelve a renderizar automáticamente.
            */}
      <div className="games-container">
        {games.map((game) => (
          <VideogameCardFactory key={game.id} game={game} />
        ))}
      </div>
    </div>
  );
}
