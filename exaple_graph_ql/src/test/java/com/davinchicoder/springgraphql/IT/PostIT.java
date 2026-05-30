package com.davinchicoder.springgraphql.IT;

import com.davinchicoder.springgraphql.entity.Videogame;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.graphql.test.tester.GraphQlTester;
import org.springframework.test.annotation.DirtiesContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class PostIT {

    @Autowired
    private GraphQlTester graphQlTester;

    @Test
    void shouldGetAllPosts() {
        String query = """
                query {
                    getAllPosts {
                        id
                        title
                        content
                        author
                    }
                }
                """;

        graphQlTester.document(query)
                .execute()
                .path("data.getAllPosts")
                .entityList(Videogame.class)
                .hasSize(3);
    }

    @Test
    void shouldCreatePost() {
        String mutation = """
                mutation {
                    savePost(postDto: {
                        title: "Test Post",
                        content: "Test Content",
                        author: "Test Author",
                    }) {
                        id
                        title
                        content
                        author
                    }
                }
                """;

        graphQlTester.document(mutation)
                .execute()
                .path("data.savePost")
                .entity(Videogame.class)
                .satisfies(post -> {
                    assertNotNull(post.getId());
                    assertEquals("Test Post", post.getTitle());
                    // assertEquals("Test Content", post.getContent());
                    // assertEquals("Test Author", post.getAuthor());
                });
    }
}