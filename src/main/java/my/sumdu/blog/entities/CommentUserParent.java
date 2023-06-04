package my.sumdu.blog.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
//BlogCommentSet
public class CommentUserParent {
    private Comment comment;
    private User commentUser;
    private User parentUser;
}
