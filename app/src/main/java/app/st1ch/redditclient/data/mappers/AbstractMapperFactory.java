package app.st1ch.redditclient.data.mappers;

import app.st1ch.redditclient.data.entity.RedditPost;
import app.st1ch.redditclient.domain.Post;

/**
 * Created by st1ch on 14.09.2016.
 */
public interface AbstractMapperFactory {
    Mapper<RedditPost, Post> getPostMapper();
}
