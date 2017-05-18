package br.eti.kinoshita.commons.bcel;

import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.MethodGen;

public class BCEL_289 {

    // OK!
    public static void main1(String[] args) throws Throwable {
        ClassParser cp = new ClassParser("/home/kinow/Development/java/apache/tests-for-commons/target/classes/br/eti/kinoshita/commons/bcel/Test.class");
        ClassGen cg = new ClassGen(cp.parse());
        MethodGen mg = new MethodGen(cg.getMethodAt(0), cg.getClassName(), cg.getConstantPool());
        mg.getAnnotationsOnParameter(0);
        System.out.println("OK!");
    }

    public static void main(String[] args) throws Throwable {
        ClassParser cp = new ClassParser("/home/kinow/Development/java/apache/tests-for-commons/target/classes/br/eti/kinoshita/commons/bcel/Test$Inner.class");
        ClassGen cg = new ClassGen(cp.parse());
        MethodGen mg = new MethodGen(cg.getMethodAt(0), cg.getClassName(), cg.getConstantPool());
        // here..args.
        System.out.println(mg.getAnnotationsOnParameter(0));
        System.out.println("OK!");
    }

}
