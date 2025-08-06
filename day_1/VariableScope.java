package day_1;
// Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?

public class VariableScope {

    // Static variable (shared across all instances)
    static int staticVar = 100;

    // Instance variable (unique for each object)
    int instanceVar = 50;

    // Final variable (constant, value cannot change)
    final int finalVar = 10;

    // Method to show local, block, and instance variable scope
    public void demonstrateScopes() {
        // Local variable (only within this method)
        int localVar = 20;

        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Final Variable: " + finalVar);
        System.out.println("Local Variable: " + localVar);

        // Block variable (scope is within this block only)
        if (localVar > 10) {
            int blockVar = 5;
            System.out.println("Block Variable (inside if): " + blockVar);
        }

        // The below line would cause an error if uncommented
        // System.out.println(blockVar); // blockVar not accessible here
    }

    public static void main(String[] args) {
        // Access static variable directly from static method
        System.out.println("Static Variable (from main): " + staticVar);

        // Create object to access instance and final variables
        VariableScope obj1 = new VariableScope();
        obj1.demonstrateScopes();

        // Show how instance variables differ per object
        VariableScope obj2 = new VariableScope();
        obj2.instanceVar = 80;

        System.out.println("\nAfter modifying obj2's instance variable:");
        System.out.println("obj1 instanceVar: " + obj1.instanceVar); // 50
        System.out.println("obj2 instanceVar: " + obj2.instanceVar); // 80

        // Changing static variable (affects all objects)
        staticVar = 200;
        System.out.println("Static Variable (after modification): " + staticVar);
    }
}
