package org.example.bangbuje.tables;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class object {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long place_id;
    public String place_name;
}
