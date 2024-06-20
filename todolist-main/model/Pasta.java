import java.util.ArrayList;
import java.util.List;

public class Pasta {
    private int id = 0;
    private String nome;
    private List<Tarefas> tarefas;

    public Pasta(int id) {
        this.id = id++;
    }

    public int getIdPasta() {
        return id;
    }

    public int setIdPasta() {
        return id;
    }

    public Pasta(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Tarefas> getTarefas() {
        return tarefas;
    }

    public void adicionarTarefa(Tarefas tarefa) {
        this.tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefas tarefa) {
        this.tarefas.remove(tarefa);
    }
}