package com.davinchicoder.springgraphql.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.davinchicoder.springgraphql.entity.Videogame;

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
                                        Videogame.builder()
                                                        .id(5L)
                                                        .title("Undertale")
                                                        .genre("RPG")

                                                        .releaseYear(2025)
                                                        .studio("tobyfox")

                                                        .price(9.99)

                                                        .description("UNDERTALE! The RPG game where you don't have to destroy anyone.")
                                                        .ageRating("T")
                                                        .build(),

                                        Videogame.builder()
                                                        .id(6L)
                                                        .title("In Stars and Time")
                                                        .genre("RPG")

                                                        .releaseYear(2023)
                                                        .studio("insertdisc5")

                                                        .price(19.99)

                                                        .description("Live with the ever-present burden of being trapped in a time loop only you can know about in this turn-based RPG. Create a better future for you and your friends. Find hope where there is none left. Pray to the stars and free yourself from time")
                                                        .ageRating("T")
                                                        .build(),

                                        Videogame.builder()
                                                        .id(7L)
                                                        .title("OFF")
                                                        .genre("RPG")

                                                        .releaseYear(2008)
                                                        .studio("Unproductive Fun Time")

                                                        .price(14.99)

                                                        .description("“I'm the Batter. I've been entrusted with a sacred mission.” -- One of the most influential RPGs of the last 20 years is finally coming to Steam. Take control of the Batter as he seeks to purify an uncanny and hopeless world haunted by specters, guided by a cryptic, grinning cat called The Judge.")
                                                        .ageRating("T")
                                                        .build(),       

                                        Videogame.builder()
                                                        .id(8L)
                                                        .title("Yume Nikki")
                                                        .genre("RPG")

                                                        .releaseYear(2004)
                                                        .studio("Kikiyama")

                                                        .price(0)

                                                        .description("This is a game in which you traverse the extremely dark world inside a dream.")
                                                        .ageRating("T")
                                                        .build(),                                                            
                        
                                                        
                                        /*
                                         * =================================================
                                         * VISUAL NOVELS
                                         * =================================================
                                         */

                                        Videogame.builder()
                                                        .id(9L)
                                                        .title("Z.A.T.O: I love the world and everything in it")
                                                        .genre("Mystery")

                                                        .releaseYear(2025)
                                                        .studio("Ferry // Nopanamaman")

                                                        .price(0)
                                                        .description("USSR, 1986. A girl goes missing in the closed city of Vorkuta-5, yet not a soul seems to be concerned. Uncover the mystery behind her disappearance and transmit your signal to the universe.")
                                                        .ageRating("T")
                                                        .build(),

                                        Videogame.builder()
                                                        .id(10L)
                                                        .title("Umineko When They Cry")
                                                        .genre("Murder Mystery")

                                                        .releaseYear(2007)
                                                        .studio("07th Expansion")

                                                        .price(32.98)
                                                        .description("Welcome to the world of \"Umineko When They Cry\" (When Seagulls Cry) Welcome to the Rokkenjima of October 4, 1986. You have been given a chance to catch a glimpse of the family conference held annually by the Ushiromiya family. The remaining life in the old family head who has built up a vast fortune is very slim. To his children, the greatest point of contention at this family conference is the distribution of his inheritance.Everyone desires all that money, no one relents, and no one believes. Who will gain the old head's vast inheritance? Where is the 10 tons of gold that the old head is said to have hidden? Can the unnerving riddle of the epitaph which is said to point to the location of that gold be solved? In the midst of this, a suspicious letter is sent from one claiming to be a witch. The presence of a 19th person on this island, which should only have 18, begins to hang in the air. Brutal murders repeat, and unsolvable riddles are left at the scene. How many will die? How many will live? Or will everyone die? Is the culprit one of the 18, or not? Is the culprit a \"human\", or a \"witch\"? Please, enjoy this isolated island, western mansion,mystery-suspense gadget of the good old days to the fullest.")
                                                        .ageRating("M")
                                                        .build(),

                                        Videogame.builder()
                                                        .id(11L)
                                                        .title("Butterfly Soup")
                                                        .genre("Slice of life")

                                                        .releaseYear(2017)
                                                        .studio("Brianna Lei")

                                                        .price(0)
                                                        .description("A visual novel about gay asian girls playing baseball and falling in love. ")
                                                        .ageRating("T")
                                                        .build(),

                                        Videogame.builder()
                                                        .id(12L)
                                                        .title("We know the devil")
                                                        .genre("Drama")

                                                        .releaseYear(2016)
                                                        .studio("Worst Girls Games")

                                                        .price(6.66)
                                                        .description("WE KNOW THE DEVIL is a visual novel about teens reluctantly fighting the devil at summer camp. Follow meangirl Neptune, tomboy Jupiter, and shy shy Venus as they get to know each other--but one always gets left out.")
                                                        .ageRating("T")
                                                        .build(),


                                        Videogame.builder()
                                                        .id(13L)
                                                        .title("Heaven will be mine")
                                                        .genre("Indie")

                                                        .releaseYear(2018)
                                                        .studio("Worst Girls Games")

                                                        .price(14.99)
                                                        .description("HEAVEN WILL BE MINE is a visual novel about making terrible life decisions in the midst of a hot-blooded battle between giant robots. Select one of three terribly behaved girls to fight and/or make out with each other in their struggle for the fate of space.")
                                                        .ageRating("T")
                                                        .build(),

                                        Videogame.builder()
                                                        .id(14L)
                                                        .title("Slay the princess")
                                                        .genre("Psychological Horror")

                                                        .releaseYear(2023)
                                                        .studio("Black Tabby Games")

                                                        .price(17.99)
                                                        .description("You're here to slay the princess. Don't believe her lies.")
                                                        .ageRating("M")
                                                        .build(),

                                        /*
                                                /*
                                         * =================================================
                                         * FIGHTER 
                                         * =================================================
                                         */

                                        Videogame.builder()
                                                        .id(15L)
                                                        .title("Street Fighter 6")
                                                        .genre("Fighting")

                                                        .releaseYear(2023)
                                                        .studio("CAPCOM Co., Ltd.")

                                                        .price(59.99)

                                                        .description("Here comes Capcom’s newest challenger! Street Fighter™ 6 launches worldwide on June 2nd, 2023 and represents the next evolution of the series. ")
                                                        .ageRating("T")
                                                        .build(),

                                        Videogame.builder()
                                                        .id(16L)
                                                        .title("Super Smash Bros. Ultimate")
                                                        .genre("Fighting")

                                                        .releaseYear(2018)
                                                        .studio("Bandai Namco Studios, Sora Ltd.")

                                                        .price(59.99)

                                                        .description("Gaming icons clash in the ultimate brawl you can play anytime, anywhere! Smash rivals off the stage as new characters Simon Belmont and King K. Rool join Inkling, Ridley, and every fighter in Super Smash Bros. history. Enjoy enhanced speed and combat at new stages based on the Castlevania series, Super Mario Odyssey, and more!")
                                                        .ageRating("E10+")
                                                        .build(),


                                                                                                /*
                                         * =================================================
                                         * ROGUELIKE
                                         * =================================================
                                         */

                                        Videogame.builder()
                                                        .id(17L)
                                                        .title("Hades")
                                                        .genre("Rougelike")

                                                        .releaseYear(2020)
                                                        .studio("Supergiant Games")

                                                        .price(24.99)

                                                        .description("Hades is a god-like rogue-like dungeon crawler that combines the best aspects of Supergiant's critically acclaimed titles, including the fast-paced action of Bastion, the rich atmosphere and depth of Transistor, and the character-driven storytelling of Pyre.")
                                                        .ageRating("T")
                                                        .build(),

                                        Videogame.builder()
                                                        .id(18L)
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




        public Optional<Videogame> getById(Long id) {
                return POSTS.stream().filter(post -> post.getId().equals(id)).findFirst();
        }

        public List<Videogame> getAll() {
                return POSTS.stream().toList();
        }

        private Long getNextId() {
                System.out.println("test");
                return POSTS.stream().mapToLong(Videogame::getId).max().orElse(0L) + 1L;
        }

}
