package Item9preferTry;

import java.io.*;

//Always use try-with-resources in preference to try-finally when
//working with resources that must be closed.
/**
 * Created by wangcheng  on 2018/3/6.
 */
public class ExTryFin {
    static String firstLineOfFile(String path) throws IOException{
        //try-finally - No longer the best way to close resources!
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        }finally {
            br.close();
        }
    }
    //try-finally is ugly when used with more than one resource!
    static void copy (String src,String dst) throws IOException{
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[1024];
                int n;
                while ((n = in.read(buf)) > 0 ){
                    out.write(buf,0,n);
                }
            }finally {
                out.close();
            }
        }finally {
            in.close();
        }
    }
    //try-with-resources the best way to close resources!
    static String firstLineOfFileTwo(String path) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        }
    }

    //try-with-resources on multiple resources - shorts and sweet
    static void copyTwo(String src,String dst) throws IOException{
        try(InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst)){
            byte[] buf = new byte[1024];
            int n;
            while ((n = in.read(buf)) >= 0){
                out.write(buf,0,n);
            }
        }
    }

    //try-with-resources with a catch clause
    static String firstLineOfFileThree(String path,String defaultVal){
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        }catch (IOException e){
            return defaultVal;
        }
    }
    public static void main(String[] args) throws Exception{
        copy("src/main/java/Item9preferTry/test","src/main/java/Item9preferTry/t1");
    }
}
