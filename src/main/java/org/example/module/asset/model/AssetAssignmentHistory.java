package org.example.module.asset_module.asset_assignment_history.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "AssetAssignmentHistory")
public class AssetAssignmentHistory {

    @EmbeddedId
    private AssetAssignmentHistoryId assetAssignmentHistoryId;

    @Column(name = "assignmentDate")
    private Date assignmentDate;
}
