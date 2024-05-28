package us.heliohost.tymek805.yumeko.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "radicals")
@AllArgsConstructor
@NoArgsConstructor
public class Radical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String meaning;
    private String character;
    private Integer level;
    private String mnemonic;
}
