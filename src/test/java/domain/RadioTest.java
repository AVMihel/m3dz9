package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // Переключение радиостанции
    @Test
    public void shouldStationNumber() {
        Radio station = new Radio();

        station.setCurrentStation(7);

        int expected = 7;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumber() {
        Radio station = new Radio();

        station.setCurrentStation(15);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberLess0() {
        Radio station = new Radio();

        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio station = new Radio();

        station.setCurrentStation(8);
        station.next();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAfter9() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.next();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.prev();

        int expected = 8;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationAfter0() {
        Radio station = new Radio();

        station.setCurrentStation(0);
        station.prev();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Изменение громкости звука
    @Test
    public void shouldCurrentVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(75);

        int expected = 75;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(75);
        volume.increaseVolume();

        int expected = 76;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeMore100() {
        Radio volume = new Radio();

        volume.setCurrentVolume(175);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReductionVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(15);
        volume.reductionVolume();

        int expected = 14;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReductionVolumeLess0() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-100);
        volume.reductionVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}