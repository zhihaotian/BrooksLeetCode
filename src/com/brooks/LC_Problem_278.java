package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/7.
 */
public class LC_Problem_278{
    public int firstBadVersion(int n){
        int left=1;
        int right=n;
        while(left<right){
            int mid=(left+right)>>>1;
            if(isBadVersion(mid)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    boolean isBadVersion(int version){
        return false;
    }
}
