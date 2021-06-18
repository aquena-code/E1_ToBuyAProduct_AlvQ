import org.testng.Assert;
import org.testng.annotations.Test;
import task.ClickOnAddCart;

public class TestBuyProduct extends base{
    @Test
    public void buyProduct(){


        try {
            ClickOnAddCart.as(webDriver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Assert.assertEquals(opcionSeleccionada, "Option 2");

    }
}
