package cl.com.javdev.domain;

import javax.persistence.*;
import lombok.Data;
import javax.validation.constraints.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="persona")
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    @Email
    private String email;
    private String telefono;
    @NotNull
    private Double saldo;
}
