//10.1.2 目录
//创建子目录，列出全部文件的名字

/*
*使用到的类
* FileAccept
* */
package bar10_1;

import javax.management.openmbean.CompositeType;
import java.io.File;

public class eg10_1_2 {
    public static void main(String[] args) {
        File javaDir = new File("java_10_1_2_测试结果");
        System.out.println(javaDir.isDirectory());
        boolean boo = javaDir.mkdir();      //在当前目录下建立java子目录
        if(boo){
            System.out.println("新建子目录："+javaDir.getName());
        }
        File dirFile = new File(".");   //dirFile是当前目录
        System.out.println("全部文件（包括文件夹）");
        String[] fileName = dirFile.list();
        if(fileName == null){
            System.out.println("没有文件");
        }else{
            for(String name:fileName){
                System.out.println(name);
            }
        }
        FileAccept fileAccept = new FileAccept();
        fileAccept.setExtendName("java");
        System.out.println("仅仅列出java源文件");
        File file[] = dirFile.listFiles(fileAccept);
        if(file == null){
            System.out.println("没有java源文件");
        }else{
            for(File f:file){
                System.out.println(f.getName());
            }
        }
    }
}
