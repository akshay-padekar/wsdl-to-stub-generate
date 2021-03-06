package org.xm.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2018-07-19T19:26:59.493+05:30
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "http://services.xm.org", name = "XMSSendTxnServicePortType")
@XmlSeeAlso({org.xm.services.xsd.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface XMSSendTxnServicePortType {

    @WebMethod(action = "urn:getXMBankDetails")
    @Action(input = "urn:getXMBankDetails", output = "//services.xm.org/XMSSendTxnServicePortType/getXMBankDetailsResponse", fault = {@FaultAction(className = GetXMBankDetailsFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/getXMBankDetails/Fault/getXMBankDetailsFault")})
    @WebResult(name = "getXMBankDetailsResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.GetXMBankDetailsResponse getXMBankDetails(
        @WebParam(partName = "parameters", name = "getXMBankDetails", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.GetXMBankDetails parameters
    ) throws GetXMBankDetailsFault;

    @WebMethod(action = "confirmAllOutstandingReceiveTxn")
    @Action(input = "confirmAllOutstandingReceiveTxn", output = "//services.xm.org/XMSSendTxnServicePortType/confirmAllOutstandingReceiveTxnResponse", fault = {@FaultAction(className = ConfirmAllOutstandingReceiveTxnFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/confirmAllOutstandingReceiveTxn/Fault/confirmAllOutstandingReceiveTxnFault")})
    @WebResult(name = "confirmAllOutstandingReceiveTxnResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.ConfirmAllOutstandingReceiveTxnResponse confirmAllOutstandingReceiveTxn(
        @WebParam(partName = "parameters", name = "confirmAllOutstandingReceiveTxn", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.ConfirmAllOutstandingReceiveTxn parameters
    ) throws ConfirmAllOutstandingReceiveTxnFault;

    @WebMethod(action = "urn:getLoyaltyDetails")
    @Action(input = "urn:getLoyaltyDetails", output = "//services.xm.org/XMSSendTxnServicePortType/getLoyaltyDetailsResponse", fault = {@FaultAction(className = GetLoyaltyDetailsFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/getLoyaltyDetails/Fault/getLoyaltyDetailsFault")})
    @WebResult(name = "getLoyaltyDetailsResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.GetLoyaltyDetailsResponse getLoyaltyDetails(
        @WebParam(partName = "parameters", name = "getLoyaltyDetails", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.GetLoyaltyDetails parameters
    ) throws GetLoyaltyDetailsFault;

    @WebMethod(action = "urn:getXMSCancelTxnCharges")
    @Action(input = "urn:getXMSCancelTxnCharges", output = "//services.xm.org/XMSSendTxnServicePortType/getXMSCancelTxnChargesResponse", fault = {@FaultAction(className = GetXMSCancelTxnChargesFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/getXMSCancelTxnCharges/Fault/getXMSCancelTxnChargesFault")})
    @WebResult(name = "getXMSCancelTxnChargesResponse", targetNamespace = "http://services.xm.org/xsd", partName = "part1")
    public org.xm.services.xsd.GetXMSCancelTxnChargesResponse getXMSCancelTxnCharges(
        @WebParam(partName = "part1", name = "getXMSCancelTxnCharges", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.GetXMSCancelTxnCharges part1
    ) throws GetXMSCancelTxnChargesFault;

    @WebMethod(action = "urn:searchCustomer")
    @Action(input = "urn:searchCustomer", output = "//services.xm.org/XMSSendTxnServicePortType/searchCustomerResponse", fault = {@FaultAction(className = SearchCustomerFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/searchCustomer/Fault/searchCustomerFault")})
    @WebResult(name = "searchCustomerResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.SearchCustomerResponse searchCustomer(
        @WebParam(partName = "parameters", name = "searchCustomer", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.SearchCustomer parameters
    ) throws SearchCustomerFault;

    @WebMethod(action = "urn:searchBeneficiary")
    @Action(input = "urn:searchBeneficiary", output = "//services.xm.org/XMSSendTxnServicePortType/searchBeneficiaryResponse", fault = {@FaultAction(className = SearchBeneficiaryFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/searchBeneficiary/Fault/searchBeneficiaryFault")})
    @WebResult(name = "searchBeneficiaryResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.SearchBeneficiaryResponse searchBeneficiary(
        @WebParam(partName = "parameters", name = "searchBeneficiary", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.SearchBeneficiary parameters
    ) throws SearchBeneficiaryFault;

    @WebMethod(action = "updateAllOutstandingtxnlist")
    @Action(input = "updateAllOutstandingtxnlist", output = "//services.xm.org/XMSSendTxnServicePortType/updateAllOutstandingtxnlistResponse", fault = {@FaultAction(className = UpdateAllOutstandingtxnlistFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/updateAllOutstandingtxnlist/Fault/updateAllOutstandingtxnlistFault")})
    @WebResult(name = "updateAllOutstandingtxnlistResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.UpdateAllOutstandingtxnlistResponse updateAllOutstandingtxnlist(
        @WebParam(partName = "parameters", name = "updateAllOutstandingtxnlist", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.UpdateAllOutstandingtxnlist parameters
    ) throws UpdateAllOutstandingtxnlistFault;

    @WebMethod(action = "urn:getXMBankBranchDetails")
    @Action(input = "urn:getXMBankBranchDetails", output = "//services.xm.org/XMSSendTxnServicePortType/getXMBankBranchDetailsResponse", fault = {@FaultAction(className = GetXMBankBranchDetailsFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/getXMBankBranchDetails/Fault/getXMBankDetailsFault")})
    @WebResult(name = "getXMBankBranchDetailsResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.GetXMBankBranchDetailsResponse getXMBankBranchDetails(
        @WebParam(partName = "parameters", name = "getXMBankBranchDetails", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.GetXMBankBranchDetails parameters
    ) throws GetXMBankBranchDetailsFault;

    @WebMethod(action = "getAllOutstandingtxnlist")
    @Action(input = "getAllOutstandingtxnlist", output = "//services.xm.org/XMSSendTxnServicePortType/getAllOutstandingtxnlistResponse", fault = {@FaultAction(className = GetAllOutstandingtxnlistFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/getAllOutstandingtxnlist/Fault/getAllOutstandingtxnlistFault")})
    @WebResult(name = "getAllOutstandingtxnlistResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.GetAllOutstandingtxnlistResponse getAllOutstandingtxnlist(
        @WebParam(partName = "parameters", name = "getAllOutstandingtxnlist", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.GetAllOutstandingtxnlist parameters
    ) throws GetAllOutstandingtxnlistFault;

    @WebMethod(action = "urn:getXMRateCalculateDetails")
    @Action(input = "urn:getXMRateCalculateDetails", output = "//services.xm.org/XMSSendTxnServicePortType/getXMRateCalculateDetailsResponse", fault = {@FaultAction(className = GetXMRateCalculateDetailsFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/getXMRateCalculateDetails/Fault/getXMRateCalculateDetailsFault")})
    @WebResult(name = "getXMRateCalculateDetailsResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.GetXMRateCalculateDetailsResponse getXMRateCalculateDetails(
        @WebParam(partName = "parameters", name = "getXMRateCalculateDetails", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.GetXMRateCalculateDetails parameters
    ) throws GetXMRateCalculateDetailsFault;

    @WebMethod(action = "urn:editXMTransaction")
    @Action(input = "urn:editXMTransaction", output = "//services.xm.org/XMSSendTxnServicePortType/editXMTransactionResponse", fault = {@FaultAction(className = EditXMTransactionFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/editXMTransaction/Fault/editXMTransactionFault")})
    @WebResult(name = "editXMTransactionResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.EditXMTransactionResponse editXMTransaction(
        @WebParam(partName = "parameters", name = "editXMTransaction", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.EditXMTransaction parameters
    ) throws EditXMTransactionFault;

    @WebMethod(action = "updateXMTxnStatus")
    @Action(input = "updateXMTxnStatus", output = "//services.xm.org/XMSSendTxnServicePortType/updateXMTxnStatusResponse", fault = {@FaultAction(className = UpdateXMTxnStatusFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/updateXMTxnStatus/Fault/updateXMTxnStatusFault")})
    @WebResult(name = "updateXMTxnStatusResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.UpdateXMTxnStatusResponse updateXMTxnStatus(
        @WebParam(partName = "parameters", name = "updateXMTxnStatus", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.UpdateXMTxnStatus parameters
    ) throws UpdateXMTxnStatusFault;

    @WebMethod(action = "urn:confirmXMSCancelTxn")
    @Action(input = "urn:confirmXMSCancelTxn", output = "//services.xm.org/XMSSendTxnServicePortType/confirmXMSCancelTxnResponse", fault = {@FaultAction(className = ConfirmXMSCancelTxnFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/confirmXMSCancelTxn/Fault/confirmXMSCancelTxnFault")})
    @WebResult(name = "confirmXMSCancelTxnResponse", targetNamespace = "http://services.xm.org/xsd", partName = "part1")
    public org.xm.services.xsd.ConfirmXMSCancelTxnResponse confirmXMSCancelTxn(
        @WebParam(partName = "part1", name = "confirmXMSCancelTxn", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.ConfirmXMSCancelTxn part1
    ) throws ConfirmXMSCancelTxnFault;

    @WebMethod(action = "urn:beneficiaryRegistrationCreateOrUpdate")
    @Action(input = "urn:beneficiaryRegistrationCreateOrUpdate", output = "//services.xm.org/XMSSendTxnServicePortType/beneficiaryRegistrationCreateOrUpdateResponse", fault = {@FaultAction(className = BeneficiaryRegistrationCreateOrUpdateFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/beneficiaryRegistrationCreateOrUpdate/Fault/beneficiaryRegistrationCreateOrUpdateFault")})
    @WebResult(name = "beneficiaryRegistrationCreateOrUpdateResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.BeneficiaryRegistrationCreateOrUpdateResponse beneficiaryRegistrationCreateOrUpdate(
        @WebParam(partName = "parameters", name = "beneficiaryRegistrationCreateOrUpdate", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.BeneficiaryRegistrationCreateOrUpdate parameters
    ) throws BeneficiaryRegistrationCreateOrUpdateFault;

    @WebMethod(action = "getXMXpinEnquiry")
    @Action(input = "getXMXpinEnquiry", output = "//services.xm.org/XMSSendTxnServicePortType/getXMXpinEnquiryResponse", fault = {@FaultAction(className = GetXMXpinEnquiryFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/getXMXpinEnquiry/Fault/getXMXpinEnquiryFault")})
    @WebResult(name = "getXMXpinEnquiryResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.GetXMXpinEnquiryResponse getXMXpinEnquiry(
        @WebParam(partName = "parameters", name = "getXMXpinEnquiry", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.GetXMXpinEnquiry parameters
    ) throws GetXMXpinEnquiryFault;

    @WebMethod(action = "urn:confirmXMTransaction")
    @Action(input = "urn:confirmXMTransaction", output = "//services.xm.org/XMSSendTxnServicePortType/confirmXMTransactionResponse", fault = {@FaultAction(className = ConfirmXMTransactionFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/confirmTransaction/Fault/confirmXMTransactionFault")})
    @WebResult(name = "confirmXMTransactionResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.ConfirmXMTransactionResponse confirmXMTransaction(
        @WebParam(partName = "parameters", name = "confirmXMTransaction", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.ConfirmXMTransaction parameters
    ) throws ConfirmXMTransactionFault;

    @WebMethod(action = "publishRateDetails")
    @Action(input = "publishRateDetails", output = "//services.xm.org/XMSSendTxnServicePortType/publishRateDetailsResponse", fault = {@FaultAction(className = PublishRateDetailsFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/publishRateDetails/Fault/publishRateDetailsFault")})
    @WebResult(name = "publishRateDetailsResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.PublishRateDetailsResponse publishRateDetails(
        @WebParam(partName = "parameters", name = "publishRateDetails", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.PublishRateDetails parameters
    ) throws PublishRateDetailsFault;

    @WebMethod(action = "urn:getXMTxnAmendment")
    @Action(input = "urn:getXMTxnAmendment", output = "//services.xm.org/XMSSendTxnServicePortType/getXMTxnAmendmentResponse", fault = {@FaultAction(className = GetXMTxnAmendmentFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/getXMTxnAmendment/Fault/getXMTxnAmendmentFault")})
    @WebResult(name = "getXMTxnAmendmentResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.GetXMTxnAmendmentResponse getXMTxnAmendment(
        @WebParam(partName = "parameters", name = "getXMTxnAmendment", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.GetXMTxnAmendment parameters
    ) throws GetXMTxnAmendmentFault;

    @WebMethod(action = "urn:confirmXMReceiveTxn")
    @Action(input = "urn:confirmXMReceiveTxn", output = "//services.xm.org/XMSendTxnServicePortType/confirmXMReceiveTxnResponse", fault = {@FaultAction(className = ConfirmXMReceiveTxnFault.class, value = "//services.xm.org/XMSendTxnServicePortType/confirmXMReceiveTxn/Fault/confirmXMReceiveTxnFault")})
    @WebResult(name = "confirmXMReceiveTxnResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.ConfirmXMReceiveTxnResponse confirmXMReceiveTxn(
        @WebParam(partName = "parameters", name = "confirmXMReceiveTxn", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.ConfirmXMReceiveTxn parameters
    ) throws ConfirmXMReceiveTxnFault;

    @WebMethod(action = "urn:confirmXMTxnAmendment")
    @Action(input = "urn:confirmXMTxnAmendment", output = "//services.xm.org/XMSSendTxnServicePortType/confirmXMTxnAmendmentResponse", fault = {@FaultAction(className = ConfirmXMTxnAmendmentFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/confirmXMTxnAmendment/Fault/confirmXMTxnAmendmentFault")})
    @WebResult(name = "confirmXMTxnAmendmentResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.ConfirmXMTxnAmendmentResponse confirmXMTxnAmendment(
        @WebParam(partName = "parameters", name = "confirmXMTxnAmendment", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.ConfirmXMTxnAmendment parameters
    ) throws ConfirmXMTxnAmendmentFault;

    @WebMethod(action = "urn:getXMXpinStatus")
    @Action(input = "urn:getXMXpinStatus", output = "//services.xm.org/XMSSendTxnServicePortType/getXMXpinStatusResponse", fault = {@FaultAction(className = GetXMXpinStatusFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/getXMXpinStatus/Fault/getXMXpinStatusFault")})
    @WebResult(name = "getXMXpinStatusResponse", targetNamespace = "http://services.xm.org/xsd", partName = "part1")
    public org.xm.services.xsd.GetXMXpinStatusResponse getXMXpinStatus(
        @WebParam(partName = "part1", name = "getXMXpinStatus", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.GetXMXpinStatus part1
    ) throws GetXMXpinStatusFault;

    @WebMethod(action = "urn:getCustomerDetails")
    @Action(input = "urn:getCustomerDetails", output = "//services.xm.org/XMSSendTxnServicePortType/getCustomerDetailsResponse", fault = {@FaultAction(className = GetCustomerDetailsFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/getCustomerDetails/Fault/getCustomerDetailsFault")})
    @WebResult(name = "getCustomerDetailsResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.GetCustomerDetailsResponse getCustomerDetails(
        @WebParam(partName = "parameters", name = "getCustomerDetails", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.GetCustomerDetails parameters
    ) throws GetCustomerDetailsFault;

    @WebMethod(action = "urn:createXMTransaction")
    @Action(input = "urn:createXMTransaction", output = "//services.xm.org/XMSSendTxnServicePortType/createXMTransactionResponse", fault = {@FaultAction(className = CreateXMTransactionFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/createXMTransaction/Fault/createXMTransactionFault")})
    @WebResult(name = "createXMTransactionResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.CreateXMTransactionResponse createXMTransaction(
        @WebParam(partName = "parameters", name = "createXMTransaction", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.CreateXMTransaction parameters
    ) throws CreateXMTransactionFault;

    @WebMethod(action = "getXMAgentDetails")
    @Action(input = "getXMAgentDetails", output = "//services.xm.org/XMSSendTxnServicePortType/getXMAgentDetailsResponse", fault = {@FaultAction(className = GetXMAgentDetailsFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/getXMAgentDetails/Fault/getXMAgentDetailsFault")})
    @WebResult(name = "getXMAgentDetailsResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.GetXMAgentDetailsResponse getXMAgentDetails(
        @WebParam(partName = "parameters", name = "getXMAgentDetails", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.GetXMAgentDetails parameters
    ) throws GetXMAgentDetailsFault;

    @WebMethod(action = "urn:customerRegistrationCreateOrUpdate")
    @Action(input = "urn:customerRegistrationCreateOrUpdate", output = "//services.xm.org/XMSSendTxnServicePortType/customerRegistrationCreateOrUpdateResponse", fault = {@FaultAction(className = CustomerRegistrationCreateOrUpdateFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/customerRegistrationCreateOrUpdate/Fault/customerRegistrationCreateOrUpdateFault")})
    @WebResult(name = "customerRegistrationCreateOrUpdateResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.CustomerRegistrationCreateOrUpdateResponse customerRegistrationCreateOrUpdate(
        @WebParam(partName = "parameters", name = "customerRegistrationCreateOrUpdate", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.CustomerRegistrationCreateOrUpdate parameters
    ) throws CustomerRegistrationCreateOrUpdateFault;

    @WebMethod(action = "urn:getXMReceiveTxn")
    @Action(input = "urn:getXMReceiveTxn", output = "//services.xm.org/XMSSendTxnServicePortType/getXMReceiveTxnResponse", fault = {@FaultAction(className = GetXMReceiveTxnFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/getXMReceiveTxn/Fault/getXMReceiveTxnFault")})
    @WebResult(name = "getXMReceiveTxnResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.GetXMReceiveTxnResponse getXMReceiveTxn(
        @WebParam(partName = "parameters", name = "getXMReceiveTxn", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.GetXMReceiveTxn parameters
    ) throws GetXMReceiveTxnFault;

    @WebMethod(action = "getXMCountryDetails")
    @Action(input = "getXMCountryDetails", output = "//services.xm.org/XMSSendTxnServicePortType/getXMCountryDetailsResponse", fault = {@FaultAction(className = GetXMCountryDetailsFault.class, value = "//services.xm.org/XMSSendTxnServicePortType/getXMCountryDetails/Fault/getXMCountryDetailsFault")})
    @WebResult(name = "getXMCountryDetailsResponse", targetNamespace = "http://services.xm.org/xsd", partName = "parameters")
    public org.xm.services.xsd.GetXMCountryDetailsResponse getXMCountryDetails(
        @WebParam(partName = "parameters", name = "getXMCountryDetails", targetNamespace = "http://services.xm.org/xsd")
        org.xm.services.xsd.GetXMCountryDetails parameters
    ) throws GetXMCountryDetailsFault;
}
