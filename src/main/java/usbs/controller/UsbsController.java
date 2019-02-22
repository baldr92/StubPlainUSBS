package usbs.controller;


import org.springframework.web.bind.annotation.*;
import usbs.service.HandlerMsg;
import usbs.service.MsgService;

@RestController
public class UsbsController {

    private MsgService msgService;
    HandlerMsg handlerMsg;

    public UsbsController( MsgService msgService) {
        this.msgService = msgService;
    }

    //the beginning of experimental part of code
    @RequestMapping(value = "/123", method = RequestMethod.POST, consumes = "application/xml", produces = "application/xml")
    @ResponseBody
    public String hi(@RequestBody String rqXml) throws Exception{
        //System.out.println(rqXml);
        handlerMsg = new HandlerMsg();
        String printUid = handlerMsg.getUID(rqXml);
        System.out.println(printUid);

        return printUid;
    }



    @RequestMapping(value = "/path",produces = "application/xml")
    @ResponseBody
    public String sayHello() {
        return msgService.respMsg();
    }
}