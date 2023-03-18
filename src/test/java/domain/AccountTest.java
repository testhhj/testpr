package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class AccountTest {

    @Test
    @DisplayName("1000원 입금")
    public void getBalance() throws Exception {
        //given
        Account account = new Account(1000);
        assertThat(1000).isEqualTo(account.getBalance());

        //when


        //then

    }

    @Test
    @DisplayName("2000원 입금")
    public void getBalance2000() throws Exception {
        //given
        Account account = new Account(2000);
        assertThat(2000).isEqualTo(account.getBalance());

        //when


        //then

    }

    @Test
    @DisplayName("0원 계좌 생성")
    public void createZeroAccount() throws Exception {
        //given
        Account account = new Account();
        assertThat(0).isEqualTo(account.getBalance());


        //when


        //then

    }

    @Test
    @DisplayName("입금")
    public void deposit() throws Exception {
        //given
        Account account = new Account(10000);
        account.deposit(10000);
        assertThat(20000).isEqualTo(account.getBalance());


        //when


        //then

    }

    @Test
    @DisplayName("음수 계좌 생성 에러")
    public void minusAccount() throws Exception {
        //given
        assertThatExceptionOfType(RuntimeException.class).isThrownBy(() -> new Account(-100));

        //when


        //then

    }

}