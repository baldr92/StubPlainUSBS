package usbs.service;

import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//@Service
public class HandlerMsg {


//    //рабочий код
//    public String handle(String msg){
//        Pattern patternUID = Pattern.compile("Ref CustomerID=\".*\" EndDate");
//        Matcher matcher = patternUID.matcher(msg);
//        String rndIDxml = matcher.replaceAll(":Ref CustomerID=\""+ UUID.randomUUID() +"\" EndDate");
//        return rndIDxml;
//    }

//    public String extractor(String msg){
//        Pattern patternUID = Pattern.compile("Ref CustomerID=\"(/+?)\" EndDate");
//        Matcher matcher = patternUID.matcher(msg);
//        //matcher.find();
//        String uid = matcher.group(1);
//        return uid;
//
//    }

    public String getUID(String msg){
        Pattern patternUID = Pattern.compile("CustomerID=\"(.+?)\" EndDate", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE);
        //System.out.println(msg);
        Matcher matcher = patternUID.matcher(msg);
        if(matcher.find()){
            String uid = matcher.group(1);
            String newXml = "<env:Body>\n" +
                    "<HermesMessage xmlns:ns5=\"http://www.vtb24.ru/Hermes/DeletePersonCrossRef/v1.0\" xmlns=\"http://www.vtb24.ru/Hermes/DeletePersonCrossRef/v1.0\">\n" +
                    "<ns5:Response ResultCode=\"0\">\n" +
                    "<ns5:Refs>\n" +
                    "<ns5:Ref CustomerID=\""+ uid +"\" EndDate=\"19.02.2019 13:31:45\"/>\n" +
                    "</ns5:Refs>\n" +
                    "</ns5:Response>\n" +
                    "</HermesMessage>\n" +
                    "</env:Body>\n" +
                    "</env:Envelope>";
            return newXml;
        } else {
            System.out.println("govno");
            return "huita";
        }

    }

//    public String setRsMsg(String message){
//        String oldRsXml = "<env:Body>\n" +
//                "<HermesMessage xmlns:ns5=\"http://www.vtb24.ru/Hermes/DeletePersonCrossRef/v1.0\" xmlns=\"http://www.vtb24.ru/Hermes/DeletePersonCrossRef/v1.0\">\n" +
//                "<ns5:Response ResultCode=\"0\">\n" +
//                "<ns5:Refs>\n" +
//                "<ns5:Ref CustomerID=\""+ getUID(message) +"\" EndDate=\"19.02.2019 13:31:45\"/>\n" +
//                "</ns5:Refs>\n" +
//                "</ns5:Response>\n" +
//                "</HermesMessage>\n" +
//                "</env:Body>\n" +
//                "</env:Envelope>";
//        return oldRsXml;
//    }




}
