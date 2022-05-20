import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    public static ATM atm;
    public static ATMsecond atr;

    @Nested
    class TopDownTesting{
        @BeforeAll
        public static void init(){
            atm = new ATM();
            atr = new ATMsecond();
        }

        @Test
        public void testatm1(){
            assertTrue(atm.input('l'));
        }

        @Test
        public void testatm3(){
            assertTrue(atm.input('d'));
        }

        @Test
        public void testatm4(){
            assertTrue(atm.input('o'));
        }

        @Test
        public void testatm5(){
            assertTrue(atm.input('u'));
        }

        @Test
        public void testatm6(){
            assertTrue(atm.input('f'));
        }

        @Test
        public void testatm7(){
            assertTrue(atm.input('l'));
        }

        @Test
        public void test(){
            assertFalse(atr.withdraw());
            atr.deposit(1);
            assertTrue(atr.withdraw());
            assertFalse(atr.withdraw());
            atr.deposit(3);
            assertTrue(atr.withdraw());
            assertTrue(atr.withdraw());
            assertTrue(atr.withdraw());
        }

    }


    @Nested
    class BottomUpTesting{
        @BeforeAll
        public static void init(){
            atm = new ATM();
            atr = new ATMsecond();
        }

        @Test
        public void testatr(){
            assertFalse(atr.withdraw());
            atr.deposit(1);
            assertTrue(atr.withdraw());
            assertFalse(atr.withdraw());
            atr.deposit(3);
            assertTrue(atr.withdraw());
            assertTrue(atr.withdraw());
            assertTrue(atr.withdraw());
        }


        @Test
        public void testatm1(){
            assertTrue(atm.input('l'));
        }

        @Test
        public void testatm2(){
            assertFalse(atm.input('w'));
        }

        @Test
        public void testatm3(){
            assertTrue(atm.input('d'));
        }

        @Test
        public void testatm4(){
            assertTrue(atm.input('w'));
        }

        @Test
        public void testatm5(){
            assertTrue(atm.input('o'));
        }

        @Test
        public void testatm6(){
            assertTrue(atm.input('u'));
        }

        @Test
        public void testatm7(){
            assertTrue(atm.input('f'));
        }

        @Test
        public void testatm8(){
            assertTrue(atm.input('l'));
        }

        @Test
        public void testatm9(){
            assertTrue(atm.input('l'));
        }

    }

}