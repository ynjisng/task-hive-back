import jakarta.persistence.Id;

public class Lembrete {
    @Id
    private long id;

    //Construtor vazio
    public Lembrete(){

    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public adicionarLembrete(){

    }
}
