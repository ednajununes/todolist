import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Tarefas {
  private static Scanner scanner = new Scanner(System.in);
  int id = 0;
  String titulo;
  String descricaoTarefa;
  Boolean statusTarefa;
  Date dataInicioTarefa;
  Date prazoTarefa;
  int prioridadeTarefa;

  public Tarefas(int id, String titulo, String descricaoTarefa, Boolean statusTarefa, Date dataInicioTarefa,
      Date prazoTarefa,
      int prioridadeTarefa) {
    this.id = id++;
    this.titulo = titulo;
    this.descricaoTarefa = descricaoTarefa;
    this.statusTarefa = statusTarefa;
    this.dataInicioTarefa = dataInicioTarefa;
    this.prazoTarefa = prazoTarefa;
    this.prioridadeTarefa = prioridadeTarefa;
  }

  public int getId() {
    return id;
  }

  public int setId() {
    return id;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescricaoTarefa() {
    return this.descricaoTarefa;
  }

  public void setDescricaoTarefa(String descricaoTarefa) {
    this.descricaoTarefa = descricaoTarefa;
  }

  public Boolean getStatusTarefa() {
    return this.statusTarefa;
  }

  public void setStatusTarefa(Boolean statusTarefa) {
    this.statusTarefa = statusTarefa;
  }

  public Date getDataInicioTarefa() {
    return this.dataInicioTarefa;
  }

  public void setDataInicioTarefa(Date dataInicioTarefa) {
    this.dataInicioTarefa = dataInicioTarefa;
  }

  public Date getPrazoTarefa() {
    return this.prazoTarefa;
  }

  public void setPrazoTarefa(Date prazoTarefa) {
    this.prazoTarefa = prazoTarefa;
  }

  public String getPrioridadeTarefa() {
    switch (this.prioridadeTarefa) {
      case 1:
        return "Alta";
      case 2:
        return "Média";
      case 3:
        return "Baixa";
      default:
        return "Desconhecida";
    }

  }

  public void setPrioridadeTarefa(int prioridadeTarefa) {
    this.prioridadeTarefa = prioridadeTarefa;
  }
}