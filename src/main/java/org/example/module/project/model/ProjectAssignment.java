package org.example.module.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.common.BaseEntity;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "projectAssignment")
@Embeddable
public class ProjectAssignment extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projectAssignId;
    private String assignmentRatio;
    private String assignmentRole;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "userId")
    private User user;

}
