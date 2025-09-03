package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Tarefas {
    private Long id;
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
    public Tarefas(String titulo, String desc){
        this(titulo);
        this.descrição = desc;
    }

    //Construtor completo
    public Tarefas(Long id, String titulo, String desc, boolean completa){
        this(titulo, desc);
        this.id = id;
        this.completa = completa;
    }
}