package database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Users")
public class Friends_list {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    // user id of the person receiving friend request

    // user id of person sending friend request

    // status either: pending, accepted, or rejected

    // created at: when request was sent

    // updated at: when the request is answered
}
