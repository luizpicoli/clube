package MyUI;
import java.util.ArrayList;
import java.util.Random;
import java.io.Serializable;

public class Banco implements Serializable {
    ArrayList<Jogador> Jogadores_Clube = new ArrayList();
    ArrayList<Jogador> Jogadores_Mercado = new ArrayList ();
    ArrayList<Jogador> Banco_Jogadores = new ArrayList();
    
    int DinheiroClube;
    
    
    public Banco () {
        // Bando de dados dos jogadores:
        Jogador jog = new Jogador ("Romário", "10265040044", 45600f);
        Banco_Jogadores.add(jog);
        jog = new Jogador ("Lucas Luiz", "10265045090", 24000f);
        Banco_Jogadores.add(jog);
        jog = new Jogador ("Alexandre Ruiz", "10505049020", 35000f);
        Banco_Jogadores.add(jog);
        jog = new Jogador ("Tyrion Lanister", "10261040045", 75600f);
        Banco_Jogadores.add(jog);
        jog = new Jogador ("Sido Cabra", "10270020004", 60000f);
        Banco_Jogadores.add(jog);
        jog = new Jogador ("Vadão Messias", "10300049044", 20300f);
        Banco_Jogadores.add(jog);
        jog = new Jogador ("Chuck Norris", "10400049000", 110200f);
        Banco_Jogadores.add(jog);
        jog = new Jogador ("Ronaldo Fenômeno", "20300050090", 90560f);
        Banco_Jogadores.add(jog);
        jog = new Jogador ("Messi", "141056049044", 250600f);
        Banco_Jogadores.add(jog);
        jog = new Jogador ("David Luiz", "10350049020", 45200f);
        Banco_Jogadores.add(jog);
        jog = new Jogador ("Cristiano Ronaldo", "70850049020", 260400f);
        Banco_Jogadores.add(jog);
        jog = new Jogador ("Neymar", "20800055010", 4000f);
        Banco_Jogadores.add(jog);
        jog = new Jogador ("Angelo", "208004435010", 2f);
        Jogadores_Clube.add(jog);
        jog = new Jogador ("Edécio", "20800055010", 4000f);
        Jogadores_Clube.add(jog);
        jog = new Jogador ("Gladimir", " Idade: 95", -25f);
        Jogadores_Clube.add(jog);
        
        Random valor = new Random ();
        DinheiroClube = 100000 + valor.nextInt(99900000);
    }
}
