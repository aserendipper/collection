package com.aserendipper.demo.book.zenofdesignpattern.designpattern.compositepattern.two;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        //首先是组装一个组织结构出来
        Branch ceo = compositeCorpTree();
        //首先把CEO的信息打印出来
        System.out.println(ceo.getInfo());
        //然后是所有员工信息
        System.out.println(getTreeInfo(ceo));
    }
    //遍历整棵树，只要给我根节点，我就能遍历出所有的节点
    private static String getTreeInfo(Branch root) {
        ArrayList<ICorp> subordinateList = root.getSubordinate();
        String info = "";
        for (ICorp s : subordinateList) {
            //是员工就直接获得信息
            if (s instanceof Leaf) {
                info = info + s.getInfo() + "\n";
            } else {
                //是个小头目
                info = info + s.getInfo() + "\n" + getTreeInfo((Branch)s);
            }
        }
        return info;
    }

    //把整个数组装起来
    public static Branch compositeCorpTree() {
        //首先产生总经理CEO
        Branch root = new Branch("王大麻子", "总经理", 100000);
        //把三个部门经理产生出来
        IBranch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
        IBranch salesDep = new Branch("马二拐子", "销售部门经理", 20000);
        IBranch financeDep = new Branch("赵三驼子", "财务部经理", 30000);
        //把三个小组长产生出来
        IBranch firstDevGroup = new Branch("杨三也斜", "开发一组组长", 5000);
        IBranch secondDevGroup = new Branch("吴大棒槌", "开发二组组长", 6000);
        //把所有小兵都产生出来
        ILeaf a = new Leaf("a", "开发人员", 2000);
        ILeaf b = new Leaf("b", "开发人员", 2000);
        ILeaf c = new Leaf("c", "开发人员", 2000);
        ILeaf d = new Leaf("d", "开发人员", 2000);
        ILeaf e = new Leaf("e", "开发人员", 2000);
        ILeaf f = new Leaf("f", "开发人员", 2000);
        ILeaf g = new Leaf("g", "开发人员", 2000);
        ILeaf h = new Leaf("h", "销售人员", 5000);
        ILeaf i = new Leaf("i", "销售人员", 4000);
        ILeaf j = new Leaf("j", "财务人员", 5000);
        ILeaf k = new Leaf("k", "CEO秘书", 8000);
        ILeaf zhengLaoLiu = new Leaf("郑老六", "研发部副总", 20000);
        //开始组装
        //CEO下有三个部门经理和一个秘书
        root.addSubordinate(k);
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);
        //研发部经理
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);
        developDep.addSubordinate(zhengLaoLiu);
        //看看两个开发小组下有什么
        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);
        secondDevGroup.addSubordinate(d);
        secondDevGroup.addSubordinate(e);
        secondDevGroup.addSubordinate(f);
        //再看销售部下的人员情况
        salesDep.addSubordinate(h);
        salesDep.addSubordinate(i);
        //最后一个财务
        financeDep.addSubordinate(j);
        return root;
    }
}