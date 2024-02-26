import com.sagar.cabapp.CabInvoice;
import org.junit.Assert;
import org.junit.Test;


public class CabInvoiceTest {

    @Test
    public void totalValue(){
        CabInvoice cabInvoice = new CabInvoice();
        double distnace =2;
        int time =5;
        int actual = (int) cabInvoice.totalFare(distnace,time);
        Assert.assertEquals(20,actual);
    }
}
