package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/8.
 */
public class LC_Problem_93{
    public List<String> restoreIpAddresses(String s){
        List<String> res=new ArrayList<>();
        if(s==null||s.length()<4){
            return res;
        }
        int len=s.length();
        for(int i=1;i<4&&i<len-2;i++){
            for(int j=i+1;j<i+4&&j<len-1;j++)
                for(int k=j+1;k<j+4&&k<len;k++){
                    String s1=s.substring(0,i);
                    String s2=s.substring(i,j);
                    String s3=s.substring(j,k);
                    String s4=s.substring(k,len);
                    if(isValid(s1)&&isValid(s2)&&isValid(s3)&&isValid(s4)){
                        res.add(s1+"."+s2+"."+s3+"."+s4);
                    }
                }
        }
        return res;
    }
    private boolean isValid(String s){
        if(s==null||s.length()==0||s.length()>=4
                ||(s.length()>1&&s.charAt(0)=='0')||Integer.parseInt(s)>255)
            return false;
        else return true;
    }
}
