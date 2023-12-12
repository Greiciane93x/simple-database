package br.simple.database.domain;

public class Details {

    public String idPessoa;
    public String nome;
    public String idade;

    private Details(Builder builder) {
        this.idPessoa = builder.idPessoa;
        this.nome = builder.nome;
        this.idade = builder.idade;
    }


    public String getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(String idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public static class Builder {
        private String idPessoa;
        private String nome;
        private String idade;


        public Builder idPessoa(String idPessoa){
            this.idPessoa = idPessoa;
            return this;
        }

        public Builder nome(String nome){
            this.nome = nome;
            return this;
        }

        public  Builder idade(String idade){
            this.idade = idade;
            return this;
        }

        public Details build(){
            return new Details(this);
        }
    }
}
