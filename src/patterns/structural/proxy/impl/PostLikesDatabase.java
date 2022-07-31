package patterns.structural.proxy.impl;

import patterns.structural.proxy.interfaces.PostLikesCalculator;

import java.util.ArrayList;
import java.util.List;

public class PostLikesDatabase implements PostLikesCalculator {
    List<PostLikes> postLikesList = new ArrayList<PostLikes>() {{
        add(new PostLikes("1", 123));
        add(new PostLikes("2", 123));
        add(new PostLikes("3", 123));
        add(new PostLikes("4", 123));
    }};

    @Override
    public int getLikes(String postId) {
        return postLikesList.stream().filter(post -> post.postId.equals(postId))
                .findFirst().orElse(new PostLikes("", 0)).likes;
    }

    private static class PostLikes {
        String postId;
        int likes;

        public PostLikes(String postId, int likes) {
            this.postId = postId;
            this.likes = likes;
        }
    }
}
