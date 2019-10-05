package empresa;

/**
 *  A fim de representar empregados em uma firma, crie uma classe Java chamada Empregado 
 *  que inclui os atributos:  nome, cargo, salario e os métodos, muda_setor, bate_ponto. 
 *  Em seguida usa está classe para criar 2 empregados e exiba seus nomes.
 * @author drew
 */
public class empregado {
    private String nome;
    private String cargo;
    private Double salario;
            
    public empregado() {
    }

    public empregado(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
            
    empregado(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    

    @Override
    public String toString() {
    		String res = "";
		res += "NOME: " +this.getNome()+" CARGO: "+this.cargo+ " SALARIO: "+this.salario;
		return res;
    }
    
}
