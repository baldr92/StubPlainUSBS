package usbs.service;


import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MsgService {
    public String respMsg(){
       String response =  "<env:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">\n" +
               "\t<env:Header>\n" +
               "\t\t<wsa:MessageID>urn:8E293D60343111E9BFF393F591CDA9A4</wsa:MessageID>\n" +
               "\t\t<wsa:ReplyTo>\n" +
               "\t\t\t<wsa:Address>http://www.w3.org/2005/08/addressing/anonymous</wsa:Address>\n" +
               "\t\t\t<wsa:ReferenceParameters>\n" +
               "\t\t\t\t<instra:tracking.compositeInstanceCreatedTime xmlns:instra=\"http://xmlns.oracle.com/sca/tracking/1.0\">2019-02-19T13:31:45.337+03:00</instra:tracking.compositeInstanceCreatedTime>\n" +
               "\t\t\t</wsa:ReferenceParameters>\n" +
               "\t\t</wsa:ReplyTo>\n" +
               "\t\t<wsa:FaultTo>\n" +
               "\t\t\t<wsa:Address>http://www.w3.org/2005/08/addressing/anonymous</wsa:Address>\n" +
               "\t\t\t<wsa:ReferenceParameters>\n" +
               "\t\t\t\t<instra:tracking.compositeInstanceCreatedTime xmlns:instra=\"http://xmlns.oracle.com/sca/tracking/1.0\">2019-02-19T13:31:45.337+03:00</instra:tracking.compositeInstanceCreatedTime>\n" +
               "\t\t\t</wsa:ReferenceParameters>\n" +
               "\t\t</wsa:FaultTo>\n" +
               "\t</env:Header>\n" +
               "\t<env:Body>\n" +
               "\t\t<HermesMessage xmlns:ns5=\"http://www.vtb24.ru/Hermes/DeletePersonCrossRef/v1.0\" xmlns=\"http://www.vtb24.ru/Hermes/DeletePersonCrossRef/v1.0\">\n" +
               "\t\t\t<ns5:Response ResultCode=\"0\">\n" +
               "\t\t\t\t<ns5:Refs>\n" +
               "\t\t\t\t\t<ns5:Ref CustomerID=\"" + UUID.randomUUID().toString()+ "\" EndDate=\"19.02.2019 13:31:45\"/>\n" +
               "\t\t\t\t</ns5:Refs>\n" +
               "\t\t\t</ns5:Response>\n" +
               "\t\t</HermesMessage>\n" +
               "\t</env:Body>\n" +
               "</env:Envelope>";
       return response;
    }
}
