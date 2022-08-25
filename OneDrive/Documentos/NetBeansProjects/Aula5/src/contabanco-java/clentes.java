
package aula5;

public class clentes {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        
        p1.setNumConta(111);
        p1.setDono("Ycaro");
       
        p1.abrirConta("CC");
        p1.sacar(50);
       
        
        ContaBanco p2 = new ContaBanco();
        
        p2.setNumConta(222);
        p2.setDono("Ysis");
        p2.abrirConta("CP");
        
        p1.depositar(200);
        p2.depositar(100);
        p2.sacar(50);
        
        ContaBanco p3 = new ContaBanco();
        p3.setNumConta(333);
        p3.setDono("Jhon");
        p3.abrirConta("CP");
        p3.depositar(50);
        p3.sacar(50);
       
    
         p1.estadoAtual();
         p2.estadoAtual();
         p3.estadoAtual();
        
         
    }
    
}
