package main.java.learn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CustProps {
    private static Logger logger = Logger.getInstance(CustProps.class);
    public static void main(String[] args){
        logger.log(Logger.DEBUG,"BEFORE readFile",null);
       readFile();
    }

    public static void readFile() {
        String fileName = "file does not exist";
        File file = new File(fileName);
        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            RuntimeException exception = new RuntimeException("RuntimeException") ;
            logger.log("ERROR","ExceptionThrown",exception);
            throw exception;

        }
    }

}
