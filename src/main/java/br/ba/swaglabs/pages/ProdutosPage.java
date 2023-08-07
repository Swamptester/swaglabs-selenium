package br.ba.swaglabs.pages;
import br.ba.swaglabs.core.BasePage;
//import br.ba.swaglabs.core.DriverFactory;

	public class ProdutosPage extends BasePage{
		
		public void acessarProdutoMochila(String id) {
			clicarItemPorId(id);
		}
		
		public void adicionarProdutoCarrinho(String id) {
			clicarItemPorId(id);
		}
		
		public String obterTextoBotao(String id){
			String textobotao = obterTextoById(id);
			return textobotao;
		}
		
		public String obterContadorCarrinho(String xpath){
			String valor = obterTextoByXpath(xpath);
			return valor;
		}
		
		public void removerProdutoCarrinho(String id) {
			clicarItemPorId(id);
		}
		
		public void selecionarFiltro(String classe, String valor) {
			selecionarItemSelect(classe, valor);
		}
}
