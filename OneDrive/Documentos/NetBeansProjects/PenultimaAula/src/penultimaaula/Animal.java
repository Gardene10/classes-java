
package penultimaaula;

public abstract class Animal {
    //Atributos de animail
    protected float peso;
    protected int idade;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    protected int membros;
    
    // metodos de animal
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    
}
