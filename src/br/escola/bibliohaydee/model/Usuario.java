package br.escola.bibliohaydee.model;

public class Usuario {

    private String nome;
    private String matricula;
    private String tipo = null;
    private Integer limiteEmprestimos;
    private Integer emprestimosAtivos = 0;


    public String matricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equalsIgnoreCase("ALUNO") || tipo.equalsIgnoreCase("PROFESSOR")){
            //RESOLVER EM CASA
        this.tipo = tipo;
        }
    }

    public Integer getLimiteEmprestimos() {
        return limiteEmprestimos;
    }

    public void setLimiteEmprestimos(Integer limiteEmprestimos) {
        this.limiteEmprestimos = limiteEmprestimos;
    }

    public Integer getEmprestimosAtivos() {
        return emprestimosAtivos;
    }

    public void setEmprestimosAtivos(Integer emprestimosAtivos) {
        this.emprestimosAtivos = emprestimosAtivos;
    }




}
