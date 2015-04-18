package net.equj65.javaee7.example.repository;

import net.equj65.javaee7.example.domain.User;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * ユーザ情報を提供するRepositoryです。
 * @author ryozo
 */
@ApplicationScoped
public class UserRepository {
    // TODO DBに変える。
    private final ConcurrentMap<String, User> userMap = new ConcurrentHashMap<String, User>() {{
        put("id1", new User("id1", "user1", 20, "user1@example.com", "address1"));
        put("id2", new User("id2", "user2", 20, "user2@example.com", "address2"));
        put("id3", new User("id3", "user3", 20, "user3@example.com", "address3"));
        put("id4", new User("id4", "user4", 20, "user4@example.com", "address4"));
        put("id5", new User("id5", "user5", 20, "user5@example.com", "address5"));
        put("id6", new User("id6", "user6", 20, "user6@example.com", "address6"));
    }};

    public List<User> findAll() {
        return new ArrayList<>(userMap.values());
    }

}
