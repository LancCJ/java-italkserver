import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 用来直接测试访问接口
 * Created by lanccj on 16/11/29.
 */
public class TestApi {

    private static Logger logger = LogManager.getLogger("TestApi");

    //服务器IP地址
    static String HostUrl="http://192.168.0.100:8089/api/";
    //各个服务的请求路径
    static String UserLoginUrl=TestApi.HostUrl+"user/login.json";



    public static void main(String[] args) {
        userLogin();
    }

    /**
     * 测试用户登录API
     * * */
    private static void userLogin(){
        logger.info("测试API登录。。。。。");
        Map map=new HashMap<String,String>();
        map.put("userName","lanccj");
        map.put("userPwd","123456");
        String params=JSON.toJSONString(map);
        logger.info("传入的参数:"+params);
        logger.info("测试API登录返回消息:"+post(UserLoginUrl, params));
    }



    //============
    public static String post(String posturl,String params) {
        StringBuffer sb = new StringBuffer("");

        try{
            //创建连接
            URL url = new URL(posturl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);

            //connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
            connection.setRequestProperty("Content-Type","application/json; charset=UTF-8");

            connection.connect();

            //POST请求
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());
//            JSONObject obj = new JSONObject();
//
//            obj.put("orderId", "4444444444444"); // 订单号
//
//            SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            System.out.println(sf.format(new Date()));
//            obj.put("compTime",sf.format(new Date())); // 投诉时间
//
//            obj.put("comperAddress", "我是一个兵"); // 投诉人地址
//
//            //System.out.println(obj.toString());

            //out.writeBytes(obj.toString());//这个中文会乱码
            out.write(params.getBytes("UTF-8"));//这样可以处理中文乱码问题
            out.flush();
            out.close();

            //读取响应
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String lines;
            while ((lines = reader.readLine()) != null) {
                lines = new String(lines.getBytes(), "utf-8");
                sb.append(lines);
            }
            //System.out.println(sb);
            reader.close();
            // 断开连接
            connection.disconnect();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return sb.toString();
    }

}
