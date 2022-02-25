package codelex.typesandvariables.practice.exercise;

public class Exercise5 {
    public static void main(String[] args) {
        String[] classes = {"English III", "Precalculus", "Music Theory", "Biotechnology", "Principles of Technology I", "Latin II", "AP US History", "Business Computer Infomation Systems"};
        String[] teachers = {" Ms. Lapan", "Mrs. Gideon", "Mr. Davis", " Ms. Palmer", "Ms. Garcia", "Mrs. Barnett", "Ms. Johannessen", "Mr. James"};

        int classesW = 38;
        int teachersW = 17;
        int count = 1;
        String verticalLine = "|";
        String horizontalSybol = "-";
        String horizontalLine = "+" + horizontalSybol.repeat(classesW + teachersW + 5) + "+";
        String space = " ";

        System.out.println(horizontalLine);
        for (int i = 0; i < 8; i++) {
            String firstSection = verticalLine + space + count + space + verticalLine;
            String secondSection = space.repeat(classesW - classes[i].length() - 1) + classes[i] + space;
            String thirdSection = verticalLine + space.repeat(teachersW - teachers[i].length() - 1) + teachers[i] + space + verticalLine;
            System.out.println(firstSection + secondSection + thirdSection);
            count++;
        }
        System.out.println(horizontalLine);
    }
}
