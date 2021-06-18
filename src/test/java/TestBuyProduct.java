import actions.RetriveInfo;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.*;
import ui.VariablesUI;

public class TestBuyProduct extends base{
    @Test
    public void buyProduct(){
        String confirmacion="";

        try {
            ClickOnNameProduct.as(webDriver);
            AddProductToCard.as(webDriver);
            EnterEmailToCreateAccount.as(webDriver);
            EnterDatesToCreateAccount.as(webDriver);
            ConfirmAddress.as(webDriver);
            AcceptTerms.as(webDriver);
            ChoosePayBank.as(webDriver);
            ConfirmOrder.as(webDriver);

            confirmacion = RetriveInfo.textoDeConfirmacion(webDriver, VariablesUI.textConfirmation);
            System.out.println("Message Confirmation::"+confirmacion);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(confirmacion, "ORDER CONFIRMATION");

    }
}
