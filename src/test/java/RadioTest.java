import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void currentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void lessCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void moreCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void maxCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void minCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.next();

        Assertions.assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void nextOutsideStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.prev();

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void prevOutsideStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void currentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void lessCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void moreCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void maxCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void minCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void increaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.increase();

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.decrease();

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void decreaseOutsideVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decrease();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void increaseOutsideVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increase();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }


}