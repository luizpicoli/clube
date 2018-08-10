package MyUI;
import java.io.Serializable;

public class Jogador implements Serializable {
    String nome;
    String cpf;
    float salario;
    
    public Jogador (String nome, String cpf, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
}
