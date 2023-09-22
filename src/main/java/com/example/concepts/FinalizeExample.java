package com.example.concepts;

public class FinalizeExample {
    private String resourceName;

    public FinalizeExample(String resourceName) {
        this.resourceName = resourceName;
    }

    // The finalize method is called by the garbage collector before the object is reclaimed.
    @Override
    protected void finalize() throws Throwable {
        try {
            // Perform cleanup operations here, such as closing resources.
            System.out.println("Finalizing resource: " + resourceName);
        } finally {
            // Always call the superclass finalize method.
            super.finalize();
        }
    }

    public static void main(String[] args) {
        FinalizeExample resource1 = new FinalizeExample("Resource 1");
        FinalizeExample resource2 = new FinalizeExample("Resource 2");

        // Nullify references to the objects, making them eligible for garbage collection.
        resource1 = null;
        resource2 = null;

        // Trigger garbage collection explicitly (for demonstration purposes).
        System.gc();
    }
}

