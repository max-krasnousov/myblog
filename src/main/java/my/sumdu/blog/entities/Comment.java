package my.sumdu.blog.entities;

import lombok.*;

import java.sql.ResultSet;
import java.sql.SQLException;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//BlogComment
public class Comment {
    String commentId;
    String commentText;
    String commentDateTime;
    String commentUserId;
    String commentPostId;
    String commentParentId;
    String version;

    public  static Comment parse(ResultSet result) throws SQLException {
        return new Comment(
                result.getString("comment_id"),
                result.getString("comment_text"),
                result.getString("comment_date_time"),
                result.getString("comment_user_id"),
                result.getString("comment_post_id"),
                result.getString("comment_parent_id"),
                result.getString("version")
        );
    }
}
