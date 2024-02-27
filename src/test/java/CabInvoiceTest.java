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
        Assert.assertEquals(25,actual);
    }

    @Test
    public void multipleRides(){
        CabInvoice cabInvoice = new CabInvoice();
        Assert.assertEquals(125,(int)cabInvoice.multiplerides(2,5,5));
    }
    @Test
    public void enhancedInvoice()
    {
        CabInvoice cabInvoice = new CabInvoice();
        Assert.assertEquals(25,(int)cabInvoice.enhancedInvoice(2,5,50));

    }

    @Test
    public void invoiceService(){
        CabInvoice cabInvoice = new CabInvoice();
        Assert.assertEquals(75,(int)cabInvoice.invoiceService(2,5,5));
    }
    @Test
    public void premium()
    {
        CabInvoice cabInvoice = new CabInvoice();
        Assert.assertEquals(40,(int)cabInvoice.premiumRides("premium",2,5));

    }

}
