package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Compte {
    private int id_compte;
    private String nom ;
    private Transaction transaction;
    private Devise devise;
}
