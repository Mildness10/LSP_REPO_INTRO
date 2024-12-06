package org.howard.edu.lsp.finalexam.question3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeRendererTest {
    private ShapeRenderer renderer;
    
    @BeforeEach
    void setUp() {
        renderer = new ShapeRenderer();
    }
    
    @Test
    void testSingletonFactory() {
        ShapeFactory factory1 = ShapeFactory.getInstance();
        ShapeFactory factory2 = ShapeFactory.getInstance();
        assertSame(factory1, factory2, "Factory instances should be the same");
    }
    
    @Test
    void testCircleCreation() {
        Shape shape = renderer.getShapeFactory().createShape("circle");
        assertNotNull(shape);
        assertTrue(shape instanceof Circle);
    }
    
    @Test
    void testRectangleCreation() {
        Shape shape = renderer.getShapeFactory().createShape("rectangle");
        assertNotNull(shape);
        assertTrue(shape instanceof Rectangle);
    }
    
    @Test
    void testTriangleCreation() {
        Shape shape = renderer.getShapeFactory().createShape("triangle");
        assertNotNull(shape);
        assertTrue(shape instanceof Triangle);
    }
    
    @Test
    void testInvalidShape() {
        assertThrows(IllegalArgumentException.class, () -> {
            renderer.getShapeFactory().createShape("hexagon");
        });
    }
    
    @Test
    void testNullShape() {
        assertThrows(IllegalArgumentException.class, () -> {
            renderer.getShapeFactory().createShape(null);
        });
    }
}