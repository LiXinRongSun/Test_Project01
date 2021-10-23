package indio.lixinrong.javasenior.file;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) throws Exception {
        File file4 = new File("e:/a/b/c");
        File file5 = new File("e:/a/b/d");
        File file6 = new File("e:/a/b/e");
        File file7 = new File("e:/a/f");
        file4.mkdirs();
        file5.mkdirs();
        file6.mkdirs();
        file7.mkdirs();
        File file8 = new File("e:/a");
        File  file3 = new File("E:\\ProgramFiles\\JavaCode");
        showTree(file8,0);
        File   file = new File("E:/ b.txt");
        File    file2 = new File("a.txt");
        file.createNewFile();
        file2.createNewFile();
        System.out.println(file.exists());//文件是否存在
        System.out.println(file.isDirectory());//文件是否存在目录
        System.out.println(file.isFile());//文件是否是文件
        System.out.println(new Date(file.lastModified()));//文件最后修改时间；
        System.out.println(file.length());
        System.out.println(file.toString());
        System.out.println(file.getName());//file 文件名
        System.out.println(file.getPath());//返回文件名
        System.out.println(file3.getName());
        File[] files = file3.listFiles();
        System.out.println(Arrays.toString(files));

        
    }
    public static void showTree(File file,int lv){
        for(int i=0;i<lv;i++){
            System.out.println("-");
        }
        System.out.println(file.getName());
        
        if(file.isDirectory()){
            File[] f  =  file.listFiles();
            
            for(File filew : f){
                showTree(filew,lv+1);
            }

        }

    }



    }
    

