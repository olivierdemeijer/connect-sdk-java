package com.globalcollect.gateway.sdk.java.payments;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.payment.CancelApprovalPaymentResponse;

public class CancelApprovalPaymentExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		CancelApprovalPaymentResponse response = client.merchant("merchantId").payments().cancelapproval("paymentId");
	}
}
