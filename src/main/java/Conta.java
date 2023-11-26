import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Classe utilizada para simular o uso e operações de uma conta bancaria.
 */
public class Conta {
	
	/**
	 * 
	 * @author gabriel
	 * @param int1 Saldo inicial na conta.
	 */
	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}	
	/**
	 * @author gabriel
	 * @param int1 Valor solicitado para saque na conta.
	 */
	@When("for solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	/**
	 * @author gabriel
	 * @param int1 Saldo da conta depois da operação de saque.
	 */
	@Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	    }
	
}
