package br.ba.swaglabs.pages;

import static br.ba.swaglabs.core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import br.ba.swaglabs.core.BasePage;

public class ItemMochilaPage extends BasePage{
	
	public void clicarBotaoVoltar(String id) {
		getDriver().findElement(By.id(id)).click();
	}

}
