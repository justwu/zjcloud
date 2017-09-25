package com.zj.service.api;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.zj.entity.Col_rs;
import com.zj.exception.DefinedException;
import com.zj.pojo.otarequest.WxOrderForm;
import com.zj.pojo.otarequest.WxRequestForm;

public interface OtaService {

    ArrayNode wxQuerySections(WxRequestForm queryform) throws DefinedException;

    ObjectNode wxQueryRoomtypes(WxRequestForm requestForm) throws DefinedException;

    Col_rs wxCreateOrder(WxOrderForm orderForm) throws DefinedException;

    void testError() throws DefinedException;


}
