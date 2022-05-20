import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineTest {

    public static CoffeeMachine cm;
    public static CoffeeMachineSecond cr;

    @Nested
    class TopDownTesting{
        @BeforeAll
        public static void init(){
            cm = new CoffeeMachine();
            cr = new CoffeeMachineSecond();
        }

        @Test
        public void testCm4(){
            assertTrue(cm.input('r'));
        }

        @Test
        public void testCm5(){
            assertTrue(cm.input('c'));
        }

        @Test
        public void testCm6(){
            assertTrue(cm.input('m'));
        }

        @Test
        public void testCm7(){
            assertTrue(cm.input('w'));
        }

        @Test
        public void testCm8(){
            assertTrue(cm.input('b'));
        }

        @Test
        public void testCm9(){
            assertTrue(cm.input('v'));
        }

        @Test
        public void testCm10(){
            assertTrue(cm.input('c'));
        }

        @Test
        public void testCr(){
            assertFalse(cr.useBeans());
            assertFalse(cr.useWater());
            assertFalse(cr.useMilk());
            assertFalse(cr.useChoco());
            cr.addBeans(1);
            cr.addWater(1);
            cr.addMilk(1);
            cr.addChocolate(1);
            assertTrue(cr.useBeans());
            assertTrue(cr.useWater());
            assertTrue(cr.useMilk());
            assertTrue(cr.useChoco());
        }

    }


    @Nested
    class BottomUpTesting{
        @BeforeAll
        public static void init(){
            cm = new CoffeeMachine();
            cr = new CoffeeMachineSecond();
        }

        @Test
        public void testCr(){
            assertFalse(cr.useBeans());
            assertFalse(cr.useWater());
            assertFalse(cr.useMilk());
            assertFalse(cr.useChoco());
            cr.addBeans(1);
            cr.addWater(1);
            cr.addMilk(1);
            cr.addChocolate(1);
            assertTrue(cr.useBeans());
            assertTrue(cr.useWater());
            assertTrue(cr.useMilk());
            assertTrue(cr.useChoco());
        }


        @Test
        public void testCm1(){
            assertFalse(cm.input('c'));
        }

        @Test
        public void testCm2(){
            assertFalse(cm.input('l'));
        }

        @Test
        public void testCm3(){
            assertFalse(cm.input('m'));
        }

        @Test
        public void testCm4(){
            assertTrue(cm.input('r'));
        }

        @Test
        public void testCm5(){
            assertTrue(cm.input('c'));
        }

        @Test
        public void testCm6(){
            assertTrue(cm.input('m'));
        }

        @Test
        public void testCm7(){
            assertTrue(cm.input('w'));
        }

        @Test
        public void testCm8(){
            assertTrue(cm.input('b'));
        }

        @Test
        public void testCm9(){
            assertTrue(cm.input('v'));
        }

        @Test
        public void testCm10(){
            assertTrue(cm.input('c'));
        }

    }

}