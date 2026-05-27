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

                                                        .price()

                                                        .description("")
                                                        .updatedAt(LocalDateTime.now())
                                                        .build(),

                                        Videogame.builder()
                                                        .id(2L)
                                                        .title("Mad Max")
                                                        .genre("ACTION")

                                                        // ACTION FIELDS
                                                        .weapon("Shotgun")
                                                        .explosions(120)

                                                        .imageUrl("https://example.com/madmax.jpg")

                                                        .createdAt(LocalDateTime.now())
                                                        .updatedAt(LocalDateTime.now())
                                                        .build(),

                                        /*
                                         * =================================================
                                         * RPG
                                         * =================================================
                                         */

                                        Videogame.builder()
                                                        .id(3L)
                                                        .title("The Mask")
                                                        .genre("COMEDY")

                                                        // COMEDY FIELDS
                                                        .typeOfComedy("Slapstick")
                                                        .memeCount(80)

                                                        .imageUrl("https://example.com/mask.jpg")

                                                        .createdAt(LocalDateTime.now())
                                                        .updatedAt(LocalDateTime.now())
                                                        .build(),

                                        Videogame.builder()
                                                        .id(4L)
                                                        .title("Superbad")
                                                        .genre("COMEDY")

                                                        // COMEDY FIELDS
                                                        .typeOfComedy("Teen Comedy")
                                                        .memeCount(95)

                                                        .imageUrl("https://example.com/superbad.jpg")

                                                        .createdAt(LocalDateTime.now())
                                                        .updatedAt(LocalDateTime.now())
                                                        .build(),

                                        /*
                                         * =================================================
                                         * VISUAL NOVELS
                                         * =================================================
                                         */

                                        Videogame.builder()
                                                        .id(1L)
                                                        .title("Z.A.T.O: I love the world and everything in it")
                                                        .genre("Mystery")

                                                        .releaseYear(2025)
                                                        .studio("Ferry // Nopanamaman")

                                                        .price(0)
                                                        .description("USSR, 1986. A girl goes missing in the closed city of Vorkuta-5, yet not a soul seems to be concerned. Uncover the mystery behind her disappearance and transmit your signal to the universe.")
                                                        .ageRating("T")

                                                        .createdAt(LocalDateTime.now())
                                                        .updatedAt(LocalDateTime.now())
                                                        .build(),

                                        Videogame.builder()
                                                        .id(2L)
                                                        .title("Umineko When They Cry")
                                                        .genre("Murder Mystery")

                                                        .releaseYear(2007)
                                                        .studio("07th Expansion")

                                                        .price(270)
                                                        .description("Welcome to the world of \"Umineko When They Cry\" (When Seagulls Cry) Welcome to the Rokkenjima of October 4, 1986. You have been given a chance to catch a glimpse of the family conference held annually by the Ushiromiya family. The remaining life in the old family head who has built up a vast fortune is very slim. To his children, the greatest point of contention at this family conference is the distribution of his inheritance.Everyone desires all that money, no one relents, and no one believes. Who will gain the old head's vast inheritance? Where is the 10 tons of gold that the old head is said to have hidden? Can the unnerving riddle of the epitaph which is said to point to the location of that gold be solved? In the midst of this, a suspicious letter is sent from one claiming to be a witch. The presence of a 19th person on this island, which should only have 18, begins to hang in the air. Brutal murders repeat, and unsolvable riddles are left at the scene. How many will die? How many will live? Or will everyone die? Is the culprit one of the 18, or not? Is the culprit a \"human\", or a \"witch\"? Please, enjoy this isolated island, western mansion,mystery-suspense gadget of the good old days to the fullest.")
                                                        .ageRating("M")

                                                        .createdAt(LocalDateTime.now())
                                                        .updatedAt(LocalDateTime.now())
                                                        .build(),

                                        Videogame.builder()
                                                        .id(3L)
                                                        .title("Butterfly Soup")
                                                        .genre("Slice of life")

                                                        .releaseYear(2017)
                                                        .studio("Brianna Lei")

                                                        .price(0)
                                                        .description("A visual novel about gay asian girls playing baseball and falling in love. ")
                                                        .ageRating("T")

                                                        .createdAt(LocalDateTime.now())
                                                        .updatedAt(LocalDateTime.now())
                                                        .build(),

                                        Videogame.builder()
                                                        .id(4L)
                                                        .title("We know the devil")
                                                        .genre("Drama")

                                                        .releaseYear(2016)
                                                        .studio("Worst Girls Games")

                                                        .price(100)
                                                        .description("WE KNOW THE DEVIL is a visual novel about teens reluctantly fighting the devil at summer camp. Follow meangirl Neptune, tomboy Jupiter, and shy shy Venus as they get to know each other--but one always gets left out.")
                                                        .ageRating("T")

                                                        .createdAt(LocalDateTime.now())
                                                        .updatedAt(LocalDateTime.now())
                                                        .build(),


                                        Videogame.builder()
                                                        .id(5L)
                                                        .title("Heaven will be mine")
                                                        .genre("Indie")

                                                        .releaseYear(2018)
                                                        .studio("Worst Girls Games")

                                                        .price(100)
                                                        .description("HEAVEN WILL BE MINE is a visual novel about making terrible life decisions in the midst of a hot-blooded battle between giant robots. Select one of three terribly behaved girls to fight and/or make out with each other in their struggle for the fate of space.")
                                                        .ageRating("T")

                                                        .createdAt(LocalDateTime.now())
                                                        .updatedAt(LocalDateTime.now())
                                                        .build(),

                                        Videogame.builder()
                                                        .id(6L)
                                                        .title("Slay the princess")
                                                        .genre("Psychological Horror")

                                                        .releaseYear(2023)
                                                        .studio("Black Tabby Games")

                                                        .price(208)
                                                        .description("You're here to slay the princess. Don't believe her lies.")
                                                        .ageRating("M")

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
                                                        .build())


                                                                                                /*
                                         * =================================================
                                         * ROGUELIKE
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
                                                        .build();

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
                post.setCreatedAt(LocalDateTime.now());

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
