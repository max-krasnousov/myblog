DROP SEQUENCE  comment_id_seq;
DROP SEQUENCE  post_id_seq;
DROP SEQUENCE  b_user_id_seq;

CREATE SEQUENCE b_user_id_seq;
CREATE SEQUENCE post_id_seq;
CREATE SEQUENCE comment_id_seq;

DROP TABLE blog_comments;
DROP TABLE blog_posts;
DROP TABLE blog_users;

Create table  blog_users(
    user_id  INTEGER NOT NULL,
    email varchar2(30) UNIQUE,
    first_name varchar2(30) NOT NULL,
    last_name varchar2(30) NOT NULL,
    password varchar2(30) NOT NULL,
    birthday varchar2(50),
    reset_token varchar2(100),
    primary key(user_id)
);

Create table  blog_posts(
    post_id  INTEGER NOT NULL ,
    post_text varchar2(4000) NOT NULL,
    post_name varchar2(100) NOT NULL,
    post_date_time varchar2(50) NOT NULL,
    post_user_id  INTEGER NOT NULL ,
    version INTEGER NOT NULL,
    primary key(post_id)
);

Create table  blog_comments(
    comment_id  INTEGER NOT NULL ,
    comment_text varchar2(4000) NOT NULL,
    comment_date_time varchar2(50) NOT NULL,
    comment_user_id  INTEGER NOT NULL ,
    comment_post_id  INTEGER NOT NULL ,
    comment_parent_id  INTEGER,
    version INTEGER NOT NULL,
    primary key(comment_id)
);

--create some test data if needed
INSERT INTO blog_users VALUES(b_user_id_seq.nextval, 'maxLogin1@gmail.com', 'Max', 'Smith', '1234abcD@', '2000/05/13', null);
INSERT INTO blog_users VALUES(b_user_id_seq.nextval, 'maxLogin2@gmail.com', 'Bill', 'Will', '1234abcD@', '2001/07/02', null);
INSERT INTO blog_users VALUES(b_user_id_seq.nextval, 'david.lee@gmail.com', 'David', 'Lee', '1234abcD@', '2001/07/02', null);
INSERT INTO blog_posts VALUES(post_id_seq.nextval, 'AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD', 'AAAA1', '2023/05/29 13:24:44', 1, 0);
INSERT INTO blog_posts VALUES(post_id_seq.nextval, 'AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD', 'AAAA1', '2023/05/29 14:34:45', 1, 0);
INSERT INTO blog_posts VALUES(post_id_seq.nextval, 'AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD', 'BBBB1', '2023/05/29 19:24:44', 1, 0);
INSERT INTO blog_posts VALUES(post_id_seq.nextval, 'AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD AABBCCDD', 'BBBB1', '2023/05/29 11:34:45', 1, 0);
INSERT INTO blog_comments VALUES(comment_id_seq.nextval, 'AAAABBBBCCCC AAAABBBBCCCC', '2023/05/29 17:34:45', 1, 1, null, 0);
INSERT INTO blog_comments VALUES(comment_id_seq.nextval, 'AAAABBBBCCCC AAAABBBBCCCC 2', '2023/05/29 19:21:41', 1, 1, 1, 0);
commit;