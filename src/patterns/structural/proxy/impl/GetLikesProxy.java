package patterns.structural.proxy.impl;

import patterns.structural.proxy.interfaces.PostLikesCalculator;

public class GetLikesProxy implements PostLikesCalculator {
    Cache<String, Integer> getLikesCache = new Cache<>();

    PostLikesDatabase postLikesDatabase = new PostLikesDatabase();

    @Override
    public int getLikes(String postId) {
        if (getLikesCache.getValue(postId) == null) {
            int likes = postLikesDatabase.getLikes(postId);
            getLikesCache.addValue(postId, likes);
        }
        return getLikesCache.getValue(postId);
    }
}
