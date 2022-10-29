
package appequipe;

public class Funcionario {
    private int ctps;
    private String nome;
    private int numhtrab; // numero de horas trabalhadas
    private double valorhora; //valor por hora trabalhada

//    public Funcionario() {
//    }
    
    public Funcionario(int ctps, String nome, int numhtrab, double valorhora) {
        this.ctps = ctps;
        this.nome = nome;
        this.numhtrab = numhtrab;
        setValorhora(valorhora);
    }
    
    public int getCtps() {
        return ctps;
    }

    public void setCtps(int ctps) {
        this.ctps = ctps;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorhora() {
        
        return valorhora;
    }

    final public void setValorhora(double valorhora) {
        if (valorhora>=0)
           this.valorhora = valorhora;
    }
    public double calcSalario()
    {
        return this.valorhora * this.numhtrab;
    }  

    public int getNumhtrab() {
        return numhtrab;
    }

    public void setNumhtrab(int numhtrab) {
            this.numhtrab = numhtrab;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
