package my.sumdu.blog.entities;

import lombok.*;

import java.sql.ResultSet;
import java.sql.SQLException;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//BlogPost
public class Post {
    String postId;
    String postText;
    String postName;
    String postDateTime;
    String postUserId;
    String version;

    public  static Post parse(ResultSet result) throws SQLException {
        return new Post(
                result.getString("post_id"),
                result.getString("post_text"),
                result.getString("post_name"),
                result.getString("post_date_time"),
                result.getString("post_user_id"),
                result.getString("version")
        );
    }
}
