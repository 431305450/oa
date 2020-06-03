package com.imooc.oa.global;

import java.util.ArrayList;
import java.util.List;

public class contant {
    //职务
    private  static  final String  POST_STAFF="员工";
    private  static  final String  POST_FM="部门经理";
    private  static  final String  POST_GM="总经理";
    private  static  final String  POST_CASHIER="财务";
    public List<String> getPost(){
        List<String> list=new ArrayList<String>();
        list.add(POST_STAFF);
        list.add(POST_FM);
        list.add(POST_GM);
        list.add(POST_CASHIER);
        return list;
    }
    //费用类别
    public List<String> getItems(){
        List<String> list=new ArrayList<String>();
        list.add("交通");
        list.add("餐饮");
        list.add("住宿");
        list.add("办公");
        return list;
    }
    //报销单状态
    public  static  final String ClASIMVOUCHER_CREATED="新创建";
    public  static  final String ClASIMVOUCHER_SUBMIT="已提交";
    public  static  final String ClASIMVOUCHER_APPROVED="已审核";
    public  static  final String ClASIMVOUCHER_BACK="已打回";
    public  static  final String ClASIMVOUCHER_TERMINATED="已终止";
    public  static  final String ClASIMVOUCHER_RECHECK="代复审";
    public  static  final String ClASIMVOUCHER_PAID="已打款";
    //审核额度
    public static  final double LIMIT_CHECK=5000.00;
    //处理方式
    public  static  final  String DEAL_CREATE="创建";
    public  static  final  String DEAL_SUBMIT="提交";
    public  static  final  String DEAL_UPDATA="修改";
    public  static  final  String DEAL_BACK="打会";
    public  static  final  String DEAL_REJECT="拒绝";
    public  static  final  String DEAL_PASS="通过";
    public  static  final  String DEAL_PAID="打款";



}
