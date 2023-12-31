import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationLessMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(radio.getMinStation() - 1);

        int expected = radio.getMinStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(radio.getMaxStation() + 1);

        int expected = radio.getMinStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationIfMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(radio.getMaxStation());
        radio.nextStation();

        int expected = radio.getMinStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIfMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(radio.getMinStation());
        radio.prevStation();

        int expected = radio.getMaxStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(25);

        int expected = 25;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeLessMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMinVolume() - 1);

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMaxVolume() + 1);

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeUp() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.volumeUp();

        int expected = 11;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotVolumeUpIfMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMaxVolume());
        radio.volumeUp();

        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDown() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.volumeDown();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotVolumeDownIfMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMinVolume());
        radio.volumeDown();

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}