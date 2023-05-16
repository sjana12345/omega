package omega.constants;

public enum UrlConstants {
	
	SELLER_DEV("https://dev-seller.ndh01.com"),
	SELLER_STAGE("https://staging-seller.ndh01.com"),
	SELLER_PROD("https://staging-seller.ndh01.com"),
	CUSTOMER_DEV("https://domain.hubse.in"),
	CUSTOMER_STAGE("https://domain.hubse.in"),
	CUSTOMER_PROD("https://domain.hubse.in"),
	CUSTOM_DOMAIN("https://domain.ext");
	
	public final String value;
	
	UrlConstants(String value) {
		this.value=value;
		toString();
	}
	
	public String toString() { 
	    return this.value; 
	}

}
