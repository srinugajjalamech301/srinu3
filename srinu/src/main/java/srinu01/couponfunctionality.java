package srinu01;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class couponfunctionality {

	WebDriver driver;

	@Test
	public void coupon() throws InterruptedException {

		addcouponindent p = new addcouponindent();
		p.bottling();
		driver = p.ctel();

		couponindentaccepting p1 = new couponindentaccepting(driver);
		driver = p1.couponindentaccepting01();

		coupondocsupload p2 = new coupondocsupload(driver);
		p2.dcupload();
		p2.ctelpoupload();
		p2.finaldispatch();
		p2.received();

	}

}
