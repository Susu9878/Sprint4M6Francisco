import { useEffect, useState } from "react";
import "../styles/example.css"

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
                getPostsByGenre(genre:"PUZZLES") {
                    id
                    title
                    genre
                    releaseYear
                    studio
                    price
                    description
                    ageRating
                }
            }
        `,

        RPG: `
            query {
                getPostsByGenre(genre:"RPG") {
                    id
                    title
                    genre
                    releaseYear
                    studio
                    price
                    description
                    ageRating
                }
            }
        `,

        VISUAL_NOVELS: `
            query {
                getPostsByGenre(genre:"VISUAL_NOVELS") {
                    id
                    title
                    genre
                    releaseYear
                    studio
                    price
                    description
                    ageRating
                }
            }
        `,

        FIGHTER: `
            query {
                getPostsByGenre(genre:"FIGHTER") {
                    id
                    title
                    genre
                    releaseYear
                    studio
                    price
                    description
                    ageRating
                }
            }
        `,

        ROGUELIKE: `
            query {
                getPostsByGenre(genre:"ROGUELIKE") {
                    id
                    title
                    genre
                    releaseYear
                    studio
                    price
                    description
                    ageRating
                }
            }
        `
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

        getGames();

    }, [genre]);



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



            const res = await fetch(
                "http://localhost:8080/graphql",
                {
                    method: "POST",

                    headers: {
                        "Content-Type": "application/json"
                    },

                    body: JSON.stringify({ query })
                }
            );



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
            setGames(
                data?.data?.getPostsByGenre ?? []
            );



            setError(null);

        } catch (err) {

            console.log(err);

            setError("Error de conexión");

            setGames([]);
        }
    };


    return (

        <div>

            <h1>Archive</h1>

            <p>
                Genre:
                <strong>
                    {" "}
                    {genre}
                </strong>
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

                <button
                    onClick={() => setGenre("PUZZLES")}
                    className="puzzleButton"
                >
                    Puzzles
                </button>

                <button
                    onClick={() => setGenre("RPG")}
                    className="rpgButton"
                >
                    RPG
                </button>

                <button
                    onClick={() => setGenre("VISUAL NOVEL")}
                    className="vnButton"
                >
                    Visual Novels
                </button>

                <button
                    onClick={() => setGenre("FIGHTER")}
                    className="fighterButton"
                >
                    Fighter
                </button>

                <button
                    onClick={() => setGenre("ROGUELIKE")}
                    className="roguelikeButton"
                >
                    Roguelike
                </button>
            </div>



            <br />



            {error && (

                <p style={{ color: "red" }}>
                    {error}
                </p>

            )}



            {/* ======================================
                RENDERIZADO REACTIVO
            ======================================

            Cuando movies cambia:
            React vuelve a renderizar automáticamente.
            */}
            <div className="movies-container">

                {
                    games.map((games) => (

                        <div
                            className="movie-card"
                            key={games.id}
                        >

                            <h3>
                                {games.title}
                            </h3>

                            <p>
                                Release Year:
                                {" "}
                                {games.releaseYear}
                            </p>
                            <p>
                                Studio:
                                {" "}
                                {games.studio}
                            </p>
                            <p>
                                Price:
                                {" "}
                                {games.price}
                            </p>
                            <p>
                                Description:
                                {" "}
                                {games.description}
                            </p>
                            <p>
                                Age rating:
                                {" "}
                                {games.ageRating}
                            </p>

                        </div>
                    ))
                }

            </div>

        </div>
    );
}