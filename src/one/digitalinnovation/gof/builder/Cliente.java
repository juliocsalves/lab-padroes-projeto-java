package one.digitalinnovation.gof.builder;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    private Cliente(Builder builder) {
        this.nome = builder.nome;
        this.cpf = builder.cpf;
        this.email = builder.email;
        this.telefone = builder.telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public static class Builder {
        private String nome;
        private String cpf;
        private String email;
        private String telefone;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Cliente build() {
            return new Cliente(this);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
