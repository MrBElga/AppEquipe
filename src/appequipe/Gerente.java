
package appequipe;

public class Gerente extends Funcionario {
    private double adicional;  //novo atributo
    
    public Gerente(int ctps, String nome, int numhtrab, double valorhora, double adicional)
    {
        super(ctps,nome,numhtrab,valorhora);
        this.adicional=adicional;
    }

    
    public double getAdicional()  // novo método 
    {
        return adicional;
    }
    @Override
    public double calcSalario()  // método reescrito (override)
    {
        return super.calcSalario()+adicional;
        //return super.getNumhtrab()*super.getValorhora()* (1+adicional/100);
    }
        
}
