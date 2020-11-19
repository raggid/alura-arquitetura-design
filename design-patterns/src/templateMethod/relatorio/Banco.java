package templateMethod.relatorio;

import java.util.Collections;
import java.util.List;

public class Banco {

    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private List<Conta> contas;

    public Banco(String nome, String endereco, String telefone, String email, List<Conta> contas) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public List<Conta> getContas() {
        return Collections.unmodifiableList(contas);
    }
}
