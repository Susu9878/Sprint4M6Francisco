package com.davinchicoder.springgraphql.repository;

import com.davinchicoder.springgraphql.entity.Videogame;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Repositorio en memoria que simula operaciones CRUD sobre Post sin usar base
 * de datos.
 */
@Repository
public class VideogameRepository {

        private final List<Videogame> POSTS = new ArrayList<>(

                        List.of(

                                        /*
                                         * =================================================
                                         * PUZZLES
                                         * =================================================
                                         */

                                        Videogame.builder()
                                                        .id(1L)
                                                        .title("Enigma do Medo")
                                                        .genre("Puzzle")

                                                        .releaseYear(2024)
                                                        .studio("Dumativa")

                                                        .price(29.99)

                                                        .description("Enigma of Fear is a game of investigation and mystery in Pixel Art/3D where your deduction is your guide. Play and enjoy this story in the way that you want to: analyze thoroughly every detail in an engaging narrative, ask partner agents for help, face enemies or try to go through them stealthily.")
                                                        .ageRating("T")
                                                        .build(),

                                        Videogame.builder()
                                                        .id(2L)
                                                        .title("Professor Layton and the Curious Village")
                                                        .genre("Puzzle")

                                                        .releaseYear(2007)
                                                        .studio("Level-5")

                                                        .price(9.99)

                                                        .description("The game centers on Professor Hershel Layton, and his self-styled apprentice, Luke Triton, investigating the fictional village of St. Mystere about an artifact known as the Golden Apple, an heirloom that the late Baron had left as a test to determine who would receive his fortune after his death. The residents of St. Mystere particularly enjoy brain teasers and will often ask the player to help solve them by using the system's touchscreen to submit answers in exchange for their cooperation in the search. ")
                                                        .ageRating("E")
                                                        .build(),

                                        /*
                                         * =================================================
                                         * RPG
                                         * =================================================
                                         */

                                        Videogame.builder()
                                                        .id(3L)
                                                        .title("Earthbound")
                                                        .genre("RPG")

                                                        .releaseYear(1994)
                                                        .studio("Ape Inc., HAL Laboratory")

                                                        .price(9.99)

                                                        .description("EarthBound, originally released in Japan as Mother 2: Gīgu no Gyakushū,[nb 2][1][2] is a 1994 role-playing video game developed by Ape Inc. (now Creatures Inc.) and HAL Laboratory and published by Nintendo for the Super Nintendo Entertainment System. The second entry in the Mother series, it follows a young boy named Ness and his party of Paula, Jeff and Poo, as they travel the world to collect melodies from eight Sanctuaries in order to defeat the universal cosmic destroyer Giygas. ")
                                                        .ageRating("T")
                                                        .build(),

                                        Videogame.builder()
                                                        .id(4L)
                                                        .title("Deltarune")
                                                        .genre("RPG")

                                                        .releaseYear(2025)
                                                        .studio("tobyfox")

                                                        .price(24.99)

                                                        .description("Fight (or spare) alongside new characters in UNDERTALE's parallel story, DELTARUNE...!")
                                                        .ageRating("T")
                                                        .build(),


                                        /*
                                         * =================================================
                                         * VISUAL NOVELS
                                         * =================================================
                                         */

                                        Videogame.builder()
                                                        .id(5L)
                                                        .title("The Conjuring")
                                                        .genre("HORROR")

                                                        // HORROR FIELDS
                                                        .monster("Demon")
                                                        .goreLevel(70)

                                                        .imageUrl("https://example.com/conjuring.jpg")

                                                        .createdAt(LocalDateTime.now())
                                                        .updatedAt(LocalDateTime.now())
                                                        .build(),

                                        Videogame.builder()
                                                        .id(6L)
                                                        .title("It")
                                                        .genre("HORROR")

                                                        // HORROR FIELDS
                                                        .monster("Clown")
                                                        .goreLevel(90)

                                                        .imageUrl("https://example.com/it.jpg")

                                                        .createdAt(LocalDateTime.now())
                                                        .updatedAt(LocalDateTime.now())
                                                        .build(),

                                        /*
                                         * =================================================
                                         * FIGHTER 
                                         * =================================================
                                         */

                                        Videogame.builder()
                                                        .id(5L)
                                                        .title("The Conjuring")
                                                        .genre("HORROR")

                                                        // HORROR FIELDS
                                                        .monster("Demon")
                                                        .goreLevel(70)

                                                        .imageUrl("https://example.com/conjuring.jpg")

                                                        .createdAt(LocalDateTime.now())
                                                        .updatedAt(LocalDateTime.now())
                                                        .build(),

                                        Videogame.builder()
                                                        .id(6L)
                                                        .title("It")
                                                        .genre("HORROR")

                                                        // HORROR FIELDS
                                                        .monster("Clown")
                                                        .goreLevel(90)

                                                        .imageUrl("https://example.com/it.jpg")

                                                        .createdAt(LocalDateTime.now())
                                                        .updatedAt(LocalDateTime.now())
                                                        .build(),


                                                                                                /*
                                         * =================================================
                                         * ROGUELIKE
                                         * =================================================
                                         */

                                        Videogame.builder()
                                                        .id(9L)
                                                        .title("Hades")
                                                        .genre("Rougelike")

                                                        .releaseYear(2020)
                                                        .studio("Supergiant Games")

                                                        .price(24.99)

                                                        .description("Hades is a god-like rogue-like dungeon crawler that combines the best aspects of Supergiant's critically acclaimed titles, including the fast-paced action of Bastion, the rich atmosphere and depth of Transistor, and the character-driven storytelling of Pyre.")
                                                        .ageRating("T")
                                                        .build(),

                                        Videogame.builder()
                                                        .id(10L)
                                                        .title("The Binding of Isaac")
                                                        .genre("Rougelike")

                                                        .releaseYear(2011)
                                                        .studio("Edmund McMillen")

                                                        .price(7.49)

                                                        .description("When Isaac’s mother starts hearing the voice of God demanding a sacrifice be made to prove her faith, Isaac escapes into the basement facing droves of deranged enemies, lost brothers and sisters, his fears, and eventually his mother.\r\n" + //
                                                                                                                                "The Binding of Isaac is a randomly generated action RPG shooter with heavy Rogue-like elements. Following Isaac on his journey players will find bizarre treasures that change Isaac’s form giving him super human abilities and enabling him to fight off droves of mysterious creatures, discover secrets and fight his way to safety.")
                                                        .ageRating("M")
                                                        .build()));

        public List<Videogame> getPostsByGenre(String genre) {

                return POSTS.stream()
                                .filter(post -> post.getGenre()
                                                .equalsIgnoreCase(genre))
                                .toList();
        }

        public List<Videogame> getRecentPosts(int count, int offset) {
                return POSTS.stream()
                                .filter(post -> post.getDeletedAt() == null)
                                .toList()
                                .subList(offset, Math.min(offset + count, POSTS.size()));
        }

        public Videogame save(Videogame post) {
                post.setId(this.getNextId());

                POSTS.add(post);
                return post;
        }

        public Optional<Videogame> delete(Long id) {
                Optional<Videogame> postToDelete = POSTS.stream()
                                .filter(post -> post.getId().equals(id))
                                .findFirst();

                postToDelete.ifPresent(post -> post.setDeletedAt(LocalDateTime.now()));

                return postToDelete;
        }

        public Optional<Videogame> getById(Long id) {
                return POSTS.stream().filter(post -> post.getId().equals(id)).findFirst();
        }

        public List<Videogame> getAll() {
                return POSTS.stream().filter(post -> post.getDeletedAt() == null).toList();
        }

        private Long getNextId() {
                System.out.println("test");
                return POSTS.stream().mapToLong(Videogame::getId).max().orElse(0L) + 1L;
        }

}
