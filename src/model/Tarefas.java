package model;

import java.time.LocalDateTime;

public class Tarefas {
    private int id;
    private String titulo;
    private String descrição;
    private boolean completa;
    private LocalDateTime dataAgora;

    //Construtor padrão;
    public Tarefas(){
        this.dataAgora = LocalDateTime.now();
        this.completa = false;
    }

    //Construtor com título;
    public Tarefas(String titulo){
        this();
        this.titulo = titulo;
    }

    //Construtor com descrição;
    public Tarefas(String titulo, String desc, int ID){
        this(titulo);
        this.descrição = desc;
        this.id = ID;
    }

    //Construtor completo
    public Tarefas(String titulo, String desc,int ID, boolean completa){
        this(titulo, desc, ID);
        this.completa = completa;
    }  
    
    //Getters e setters

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public boolean isCompleta() {
		return completa;
	}

	public void setCompleta(boolean completa) {
		this.completa = completa;
	}

	public LocalDateTime getDataAgora() {
		return dataAgora;
	}

	public void setDataAgora(LocalDateTime dataAgora) {
		this.dataAgora = dataAgora;
	}
	
	public String toString() {
	    return "Tarefa{id=" + id + ", titulo='" + titulo + "', descricao='" + descrição + "', completa=" + completa + ", data=" + dataAgora + "}";
	}
	
}