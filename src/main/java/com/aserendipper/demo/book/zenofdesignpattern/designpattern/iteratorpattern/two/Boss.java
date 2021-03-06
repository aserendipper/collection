package com.aserendipper.demo.book.zenofdesignpattern.designpattern.iteratorpattern.two;

public class Boss {
    public static void main(String[] args) {
        IProject project = new Project();
        project.add("星球大战项目ddddd", 10, 100000);
        project.add("扭转时空项目", 100, 10000000);
        project.add("超人改造项目", 10000, 1000000000);
        for (int i = 4; i < 104; i++) {
            project.add("第" + i + "个项目", i * 5, i * 1000000);
        }
        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
            IProject p = (IProject) projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
