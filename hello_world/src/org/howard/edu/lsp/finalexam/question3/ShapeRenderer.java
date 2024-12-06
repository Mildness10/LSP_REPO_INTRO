package org.howard.edu.lsp.finalexam.question3;

public class ShapeRenderer {
    private final ShapeFactory shapeFactory;
    
    public ShapeRenderer() {
        this.shapeFactory = ShapeFactory.getInstance();
    }
    
    public ShapeFactory getShapeFactory() {
        return shapeFactory;
    }
    
    public void renderShape(String shapeType) {
        try {
            Shape shape = shapeFactory.createShape(shapeType);
            shape.draw();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    // Main method for testing
    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();
        
        renderer.renderShape("circle");
        renderer.renderShape("rectangle");
        renderer.renderShape("triangle");
        renderer.renderShape("hexagon");
    }
}