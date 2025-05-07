package com.aptech.Secure.Tasker.models;

import com.aptech.Secure.Tasker.enums.PermissionName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Builder
@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     //Role name (eg ADMIN, USER)
    @Column(unique = true, nullable = false)
    private String name;

    private String description;

    //Permission assigned to this role
    @ElementCollection(targetClass = PermissionName.class, fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @CollectionTable(
            name = "role_permissions",
            joinColumns = @JoinColumn(name = "role_id")
    )
    @Column(name = "permission")
    @Builder.Default
    private Set<PermissionName> permissions = new HashSet<>();
}
