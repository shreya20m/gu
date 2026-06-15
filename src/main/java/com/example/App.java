package com.example;

import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.io.File;
import com.google.common.collect.ImmutableList;

public class App 
{
    public static void main( String[] args )
    {
    ImmutableList<String> fruits=ImmutableList.of("apple","banana","cherry");
        System.out.println(fruits);
        File sf=new File("source.txt");
        File df=new File("destination.txt");
        try{
        FileUtils.copyFile(sf,df);
        System.out.println("file copied succesfully");
        }
        catch(IOException e){
        System.err.println("error:"+e.getMessage());
        }
    }
}
