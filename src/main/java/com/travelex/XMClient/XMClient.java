package com.travelex.XMClient;

import javax.net.ssl.TrustManager;
import javax.xml.ws.BindingProvider;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.xm.services.XMSSendTxnService;
import org.xm.services.XMSSendTxnServicePortType;
import org.xm.services.xsd.GetCustomerDetails;
import org.xm.services.xsd.GetCustomerDetailsResponse;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

import junit.framework.Assert;

/**
 * 
 *
 */
public class XMClient {
	public static void main(String[] args) {
		try {

			XMSSendTxnService xmService = new XMSSendTxnService();
			XMSSendTxnServicePortType xmServicePort = xmService.getXMSSendTxnServiceSOAP11Port();
	        xmServicePort = xmService.getXMSSendTxnServiceSOAP12Port();
	        BindingProvider bindingProvider = (BindingProvider) xmServicePort;
	        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://ws.xpressmoney.biz/XMWS/services/XMSSendTxnService");
	        Client xmClient = ClientProxy.getClient(xmServicePort);
	        
	        HTTPConduit httpConduit = (HTTPConduit) xmClient.getConduit();
	        TLSClientParameters tlcClientParam = new TLSClientParameters();
	        tlcClientParam.setSecureSocketProtocol("TLSv1.2");
	        tlcClientParam.setSecureSocketProtocol("SSLv3");
	        httpConduit.setTlsClientParameters(tlcClientParam);
//	        tlcClientParam.setDisableCNCheck(true);
	        httpConduit.setTlsClientParameters(tlcClientParam);
//	        
	        TrustManager[] simpleTrustManager = new TrustManager[] {new X509TrustManager() {

	            public X509Certificate[] getAcceptedIssuers() {
	                return null;
	            }

	            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
	            }

	            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
	            }
	        } };

	        tlcClientParam.setTrustManagers(simpleTrustManager);
			
//			XMSSendTxnService xmService = new XMSSendTxnService();
//			XMSSendTxnServicePortType xmServicePort = xmService.getXMSSendTxnServiceSOAP11Port();
//
//			Client cxfClient = ClientProxy.getClient(xmServicePort);
//			cxfClient.getOutInterceptors().add(new LoggingOutInterceptor());
//			cxfClient.getInInterceptors().add(new LoggingInInterceptor());
//
//			TLSClientParameters tlcClientParam = new TLSClientParameters();
//			tlcClientParam.setSecureSocketProtocol("TLSv1.2");
//			tlcClientParam.setSecureSocketProtocol("SSLv3");
//
//			HTTPConduit httpC = (HTTPConduit) ClientProxy.getClient(xmServicePort).getConduit();
//			httpC.setTlsClientParameters(tlcClientParam);
			
/*			SearchCustomer searchCustomerRequest = new SearchCustomer();
	        searchCustomerRequest.setAuthenticationAgentCode("UAEEXAEAU001");
	        searchCustomerRequest.setUserID("10001cashier");
	        searchCustomerRequest.setPassword("test123");
	        searchCustomerRequest.setPin("mam123");
	        searchCustomerRequest.setAgentCode("UAEEXAEAU001");
	        searchCustomerRequest.setXmCustomerNo("7840444241143418");
	        searchCustomerRequest.setXmCustomerLoyaltyNo("");
	        searchCustomerRequest.setCustomerID("");
	        searchCustomerRequest.setCustomerPrimaryContactCountryCode("");
	        searchCustomerRequest.setCustomerPrimaryContactNo("");
	        searchCustomerRequest.setCustomerEmail("");
	        searchCustomerRequest.setXmReserved1("");
	        searchCustomerRequest.setXmReserved2("");
	        searchCustomerRequest.setXmReserved3("");
	        searchCustomerRequest.setXmReserved4("");
	        searchCustomerRequest.setXmReserved5("");
	        
	        SearchCustomerResponse  searchCustomerResponse = xmServicePort.searchCustomer(searchCustomerRequest);
	        System.out.println(searchCustomerResponse.getReturnCode());
 			*/
			
			GetCustomerDetails customerDetails = new GetCustomerDetails();
			customerDetails.setAuthenticationAgentCode("UAEEXAEAU001");
			customerDetails.setUserID("10001cashier");
			customerDetails.setPassword("test123");
			customerDetails.setPin("mam123");
			customerDetails.setAgentCode("UAEEXAEAU001");
			customerDetails.setXmCustomerNo("7840470859166418");
			customerDetails.setXmCustomerLoyaltyNo("");
			customerDetails.setXmReserved1("");
			customerDetails.setXmReserved2("");
			customerDetails.setXmReserved3("");
			customerDetails.setXmReserved4("");
			customerDetails.setXmReserved5("");
			GetCustomerDetailsResponse customerDetailsResponse = xmServicePort.getCustomerDetails(customerDetails);
			
			System.out.println("First Name "+customerDetailsResponse.getCustomer().getCustomerDetails().getCustomerFirstName());
			System.out.println("Return Code "+customerDetailsResponse.getCustomer().getCustomerDetails().getReturnCode());
			System.out.println(customerDetailsResponse.getCustomer().getCustomerIDDetailsList().getCustomerIDDetails().size());
			Assert.assertEquals(2,customerDetailsResponse.getCustomer().getCustomerIDDetailsList().getCustomerIDDetails().size());

//			/*
//			BeneficiaryRegistrationCreateOrUpdate beneficiaryRegistrationCreateOrUpdate = new BeneficiaryRegistrationCreateOrUpdate();
//			beneficiaryRegistrationCreateOrUpdate.setAuthenticationAgentCode("UAEEXAEAU001");
//			beneficiaryRegistrationCreateOrUpdate.setUserID("10001cashier");
//			beneficiaryRegistrationCreateOrUpdate.setPassword("test123");
//			beneficiaryRegistrationCreateOrUpdate.setPin("mam123");
//			beneficiaryRegistrationCreateOrUpdate.setXmCustomerNo("7840453164123418");
//			beneficiaryRegistrationCreateOrUpdate.setAgentCode("UAEEXAEAU001");
//			beneficiaryRegistrationCreateOrUpdate.setRegisterOrUpdateFlag("N");
//			beneficiaryRegistrationCreateOrUpdate.setBeneficiaryFirstName("shivansh");
//			beneficiaryRegistrationCreateOrUpdate.setBeneficiaryLastName("Pai");
//			beneficiaryRegistrationCreateOrUpdate.setBeneficiaryAddress1("asdasbxdsf");
//			beneficiaryRegistrationCreateOrUpdate.setBeneficiaryAddress2("asdasbxdsf");			
//			beneficiaryRegistrationCreateOrUpdate.setBeneAddressCountryCode("UK");
//			beneficiaryRegistrationCreateOrUpdate.setBeneficiaryAddressCity("London");
//			beneficiaryRegistrationCreateOrUpdate.setBeneficiaryMobileCountryCode("44");
//			beneficiaryRegistrationCreateOrUpdate.setBeneficiaryMobile("9819240584");
//			beneficiaryRegistrationCreateOrUpdate.setBeneficiaryEmail("asdb@gmail.com");
//			beneficiaryRegistrationCreateOrUpdate.setBeneficiaryNationalityCode("UK");
//			beneficiaryRegistrationCreateOrUpdate.setBeneficiaryEmailNotify("1");
//			beneficiaryRegistrationCreateOrUpdate.setBeneficiarySmsNotify("2");
//			beneficiaryRegistrationCreateOrUpdate.setServiceType("PS");
//			
//			BeneficiaryIDDetails idDetails = new BeneficiaryIDDetails();
//			idDetails.setBeneficiaryIDType(3);
//			idDetails.setBeneficiaryID("123654");
//			idDetails.setBeneficiaryIdIssuedAt("malad");
//			idDetails.setBeneficiaryIdIssuedBy("yede");
//			idDetails.setBeneficiaryIdIssueDate("01-01-2000");
//			idDetails.setBeneficiaryIdExpiryDate("01-01-2099");
//			
//			
//			beneficiaryRegistrationCreateOrUpdate.getBeneficiaryIDDetails().add(idDetails);
//			
//				
//			AccountDetails  acc1 = new AccountDetails();
//			acc1.setAccountSerialNo("1");
//			acc1.setBankName("AB Bank Limited");
//			acc1.setBankAgentCode("ARABKBDDH005");
//			acc1.setBankCode("9");
//			acc1.setAccountName("Al Zhir");
//			acc1.setAccountName("987654321321");
//			acc1.setBankBranchName("BOROIKANDI");
//			acc1.setBankBranchCode("020910525");
//			acc1.setAccountStatus("1");
//			beneficiaryRegistrationCreateOrUpdate.getAccountDetails().add(acc1);
//			
//			
//			xmServicePort.	beneficiaryRegistrationCreateOrUpdate(beneficiaryRegistrationCreateOrUpdate);
//			
	       /* SearchCustomer searchCustomerRequest = new SearchCustomer();
	        searchCustomerRequest.setAuthenticationAgentCode("UAEEXAEAU001");
	        searchCustomerRequest.setUserID("10001cashier");
	        searchCustomerRequest.setPassword("test123");
	        searchCustomerRequest.setPin("mam123");
	        searchCustomerRequest.setAgentCode("UAEEXAEAU001");
	        searchCustomerRequest.setXmCustomerNo("7840444241143418");
	        searchCustomerRequest.setXmCustomerLoyaltyNo("");
	        searchCustomerRequest.setCustomerID("");
	        searchCustomerRequest.setCustomerPrimaryContactCountryCode("");
	        searchCustomerRequest.setCustomerPrimaryContactNo("");
	        searchCustomerRequest.setCustomerEmail("");
	        searchCustomerRequest.setXmReserved1("");
	        searchCustomerRequest.setXmReserved2("");
	        searchCustomerRequest.setXmReserved3("");
	        searchCustomerRequest.setXmReserved4("");
	        searchCustomerRequest.setXmReserved5("");
	        
	        xmServicePort.searchCustomer(searchCustomerRequest);*/

			 
			/*GetXMCountryDetails countryDetails = new GetXMCountryDetails();
			GetXMCountryDetailsResponse countryDetailsResponse = new GetXMCountryDetailsResponse();
			countryDetails.setAuthenticationAgentCode("UAEEXAEAU001");
			countryDetails.setUserID("10001cashier");
			countryDetails.setPassword("test123");
			countryDetails.setPin("mam123");
			countryDetails.setCountryCode("IN");
			countryDetailsResponse = xmServicePort.getXMCountryDetails(countryDetails);

			System.out.println(countryDetailsResponse.getPayinCcyList());

			List<PayinCcyLimit> listPayCCLimit = countryDetailsResponse.getPayinCcyList().getPayinCcyLimit();

			for (PayinCcyLimit payinCcyLimit : listPayCCLimit) {
				System.out.println(payinCcyLimit.getPayinCcy());
				System.out.println(payinCcyLimit.getPayinAmountLimit());

			}*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
