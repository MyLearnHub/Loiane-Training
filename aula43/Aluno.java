import java.util.Arrays;
import java.util.Objects;

public class Aluno {
    private String curso;
    private double[] notas;

    public Aluno() {
    }

    public Aluno(String nome, String endereco, String telefone, String cpf, String telefoneCelular, String curso, double[] notas) {
        // super(nome, endereco, telefone, cpf, telefoneCelular);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer() {
        // super.setCpf("345345345354");
        // this.setCpf("34534534");
    }

    public String obterEtiquetaEndereco() {
        String s = "Endereço do Aluno: ";
        // s += this.getEndereco();

        return s;
    }

    // @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }

    /* public String toString(){
        String s = curso + "\n";
        for (double nota : notas) {
            s += nota + " ";
        }
        return s;
    } */

    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;

        if (curso.equalsIgnoreCase(aluno.getCurso())){
            return true;
        }

        return false;
    }
}
