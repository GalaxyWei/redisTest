/**  
 * Project Name:redisTest  
 * File Name:Charge.java  
 * Package Name:holiday.redisTest  
 * Date:2015年10月12日上午11:02:12  
 * Copyright (c) 2015, sxw1989@126.com All Rights Reserved.  
 *  
*/  
  
package holiday.redisTest;  

import holiday.redisTest.util.SpringContext;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;

import com.google.gson.Gson;
import com.tf56.queue.client.IQueueClient;

/**  
 * ClassName:Charge <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Date:     2015年10月12日 上午11:02:12 <br/>  
 * @author   xuwei.shen  
 * @version  1.0
 * @since    JDK 1.7 
 */
public class Charge {

	public static void main(String[] args) {
        
        try {
        	Map<String, Object> clientMap = new HashMap<String, Object>();
				
			clientMap.put("debittype", "其他应付款-待查收入款-退票");
			clientMap.put("credittype", "会员账户存款:对私会员账户存款-8800000659307");
			clientMap.put("amount", "100.0000");
			clientMap.put("businessrecordnumber", "1115100720345602570");
			clientMap.put("bankaccountnumber", "1202025219900013609");
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			clientMap.put("transactiondate", dateFormat.format(dateFormat.parse("2015-10-10 17:30:32")));
        	IQueueClient queueClient = (IQueueClient)SpringContext.getBean("queueClient");
        	
        	
        	//内部户变动
//			System.out.println(queueClient.putToQueue("accountdetailother", Base64.encodeBase64String(new Gson().toJson(clientMap).getBytes("utf-8"))));
        	
		} catch (Exception e) {
			e.printStackTrace();  
		}
	}
}
  
