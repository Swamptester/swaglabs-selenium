package br.ba.swaglabs.pages;

import br.ba.swaglabs.core.BasePage;
import br.ba.swaglabs.core.DriverFactory;

public class LoginPage extends BasePage{
	
	public void irParaTeladeLogin(String url) {
		DriverFactory.getDriver().get(url);
	}
	
	 public void preencherCampoUsername(String id, String username) {
		preencherCampoById(id, username);
	} 
	 
	 public void preencherCampoSenha(String id, String senha) {
			preencherCampoById(id, senha);
		} 
	 
	 public void clicarBotaoLogin(String id) {
		 	clicarItemPorId(id);
	 }
	 
	 public String obterMensagemErro(String xpath) {
		 texto = obterTextoByXpath(xpath);
		 return texto;
	 }
	 
}