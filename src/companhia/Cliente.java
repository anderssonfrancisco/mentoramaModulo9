package companhia;


public class Cliente implements Autenticador{
    private String nome;
    private boolean status;
    private String senha;
    private Integer compras;



    public Cliente(String nome, boolean status, String senha, Integer compras) {
        this.nome = nome;
        this.status = status;
        this.senha = senha;
        this.compras = compras;
    }

    public String getNome() {
        System.out.println(this.nome);
        return nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", status=" + status +
                ", senha='" + senha + '\'' +
                ", compras =" + compras + '\'' +
                '}';
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Integer getCompras() {
        return this.compras;
    }


    @Override
    public boolean autentica(String senha) {
        if (this.senha != senha) {
            System.out.println("Não autenticado");
            return false;
        } else {
            System.out.println("Autenticado!");
            return true;

        }
    }
}
