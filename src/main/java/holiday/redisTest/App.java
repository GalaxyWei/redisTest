package holiday.redisTest;

import holiday.redisTest.util.SpringContext;

import com.tf56.queue.client.IQueueClient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        String json = "{\"fileId\":\"6561\",\"fileName\":\"13_银联_151016093000\",\"backType\":\"queue\",\"node\":\"unionpayparseback\"}";
        String json = "ddddddddddddddddddd";
        try {
        	
        	IQueueClient queueClient = (IQueueClient)SpringContext.getBean("queueClient");
        	
        	//对账
        	System.out.println(queueClient.putToQueue("onewayaccounting", json));
		} catch (Exception e) {
			e.printStackTrace();  
		}
    }
}
