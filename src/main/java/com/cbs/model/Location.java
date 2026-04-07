package com.cbs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "locations")
@Getter
@Setter
@NoArgsConstructor
public class Location extends AbstractSpatialEntity {
    private String name;
    private String type; // e.g., "ATM", "Pharmacy", "Park"
}
 Miranda
