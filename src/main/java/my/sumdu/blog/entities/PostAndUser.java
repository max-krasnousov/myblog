package my.sumdu.blog.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
//BlogPostSet
public class PostAndUser {
    private Post post;
    private User postUser;
}
