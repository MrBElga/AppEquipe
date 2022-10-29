
package appequipe;

public class AppEquipe {

    public static void main(String[] args) {
        int tl=0;
        Funcionario f1=new Funcionario(123, "Adamastror", 20, 15);
        Funcionario f2=new Funcionario(132, "Clemilda", 20, 12);
        Funcionario f3=new Funcionario(523, "Frederico", 40, 12);
    
        Gerente g=new Gerente(999,"José Garcia",20,15,30);
                
        Funcionario[] equipe = new Funcionario[10];
        equipe[tl++]=f1; equipe[tl++]=f2; equipe[tl++]=f3;
        equipe[tl++]=g;
        for (int i = 0; i < tl; i++) 
            listarFuncionario(equipe[i]);
        
        System.out.println(g);
    }

    private static void listarFuncionario(Funcionario f) {
        System.out.println(f.getNome()
                + " vai receber R$ " + f.calcSalario());
        if (f instanceof Gerente) {
            System.out.println(" com adicional de " + ((Gerente) f).getAdicional() + "%");
        }
    }
    
}
