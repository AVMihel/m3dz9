package domain;


import lombok.*;


@AllArgsConstructor
@Data
public class Radio {

    private int currentStation;
    private int currentVolume;
    private int minStation;
    private int maxStation;
    private int minVolum;
    private int maxVolume;


    public Radio() {
        this.minStation = 0;
        this.maxStation = 9;
        this.minVolum = 0;
        this.maxVolume = 100;
    }

    public Radio(int newMaxStation) {
        this.maxStation = newMaxStation - 1;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
        ;
    }

    public void next() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {

        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolum) {
            newCurrentVolume = minVolum;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void reductionVolume() {
        if (currentVolume > minVolum) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolum;
        }
    }

}
