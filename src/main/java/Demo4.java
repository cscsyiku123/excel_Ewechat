import com.sun.org.glassfish.external.statistics.Stats;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Demo4 {
    public static void main(String[] args) {
        String pwd = Demo4.class.getResource(".").getPath();
        renderImage(pwd+"./123.html",pwd+"./123.png");

    }


    //请求网页渲染生成图片
    public static void renderImage(String httpUrl,String outputImagePath){
        try {
            String pwd = Demo4.class.getResource(".").getPath();
            String command = String.format("%sphantomjs %srasterize.js %s %s", pwd, pwd, httpUrl, outputImagePath);
            System.out.println("command:[]"+command);

            String[] cmd = new String[]{"/bin/sh", "-c", command};
            Process ps = Runtime.getRuntime().exec(cmd);


            InputStream is = ps.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);
            }
            ps.waitFor();
            is.close();
            reader.close();
            ps.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
