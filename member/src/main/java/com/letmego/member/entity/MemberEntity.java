package com.letmego.member.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@ToString
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "email")},name = "MEMBER")
public class MemberEntity {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String memberId;

    private String firstName;
    private String lastName;

    @Column(nullable = false)
    private String email;

    private String password;
    private String authProvider;

    @Column(name = "user_role")
    private String role;
}
