import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitalWatchTest {

    public static DigitalWatch dw;
    public static Alarm am;

    @Nested
    class TopDown{
        @BeforeAll
        public static void init(){
            dw = new DigitalWatch();
            am = new Alarm();
        }

        @Test
        public void test1(){
            assertTrue(dw.input('t'));
        }

        @Test
        public void test2(){
            assertTrue(dw.input('a'));
        }


        @Test
        public void test4(){
            assertTrue(dw.input('s'));
        }

        @Test
        public void test5(){
            assertTrue(dw.input('c'));
        }

        @Test
        public void test6(){
            assertTrue(dw.input('t'));
        }

        @Test
        public void test7(){
            assertTrue(dw.input('s'));
        }

        @Test
        public void test8(){
            assertTrue(dw.input('s'));
        }

        @Test
        public void test9(){
            assertTrue(dw.input('m'));
        }


        @Test
        public void test13(){
            assertTrue(dw.input('t'));
        }

        @Test
        public void test(){
            assertFalse(am.check());
            assertFalse(am.unset());
            assertTrue(am.set());
            assertTrue(am.check());
            assertTrue(am.set());
            assertFalse(am.set());
            assertTrue(am.unset());
        }

    }


    @Nested
    class BottomUp {
        @BeforeAll
        public static void init() {
            dw = new DigitalWatch();
            am = new Alarm();
        }

        @Test
        public void test() {
            assertFalse(am.check());
            assertFalse(am.unset());
            assertTrue(am.set());
            assertTrue(am.check());
            assertTrue(am.set());
            assertFalse(am.set());
            assertTrue(am.unset());
        }


        @Test
        public void test1(){
            assertTrue(dw.input('t'));
        }

        @Test
        public void test2(){
            assertTrue(dw.input('a'));
        }

        @Test
        public void test3(){
            assertTrue(dw.input('s'));
        }

        @Test
        public void test4(){
            assertTrue(dw.input('c'));
        }

        @Test
        public void test5(){
            assertTrue(dw.input('s'));
        }

        @Test
        public void test6(){
            assertTrue(dw.input('u'));
        }

        @Test
        public void test7(){
            assertTrue(dw.input('t'));
        }

        @Test
        public void test8(){
            assertTrue(dw.input('s'));
        }

        @Test
        public void test9(){
            assertTrue(dw.input('s'));
        }

        @Test
        public void test14(){
            assertTrue(dw.input('t'));
        }
    }

}
