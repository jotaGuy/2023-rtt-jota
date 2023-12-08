package database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="group_chat")
public class Group_chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    // user id of message sender

    // message being sent
    @Column(name = "message")
    private String message;

    //create at date or ts
}
