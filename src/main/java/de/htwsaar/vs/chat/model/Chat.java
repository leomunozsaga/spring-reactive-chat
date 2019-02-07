package de.htwsaar.vs.chat.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Chat Model (MongoDB Document)
 *
 * @author Niklas Reinhard
 */
@Data
@NoArgsConstructor
@Document
public class Chat {

    @Id
    private String id;
    private Boolean isGroup;
    private String name;
    private List<Member> members;

    @Data
    @NoArgsConstructor
    @Document
    public static class Member {
        @DBRef
        private User user;
        private Boolean isAdmin = false;
    }
}