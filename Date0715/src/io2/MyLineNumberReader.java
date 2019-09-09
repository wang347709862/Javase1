package io2;

import io.MyBufferedReader;

import java.io.IOException;
import java.io.Reader;

public class MyLineNumberReader {
    private Reader r;
    private int lineNumber;

    public MyLineNumberReader(Reader r){
        this.r=r;
    }
    public int getLineNumber(){
        return lineNumber;
    }
    public void  setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String readLine()throws IOException{
        lineNumber++;
        StringBuilder sb=new StringBuilder();

        int by=0;
        while((by=r.read())!=-1){
            if(by=='\r'){
                continue;
            }
            if(by=='\n'){
                return sb.toString();
            }else{
                sb.append((char)by);
            }
        }
        if(sb.length()>0)
        return sb.toString();
        return null;
    }

    public void close() throws IOException {
        this.r.close();
    }
}
