package domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
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
    }

    public Radio(int currentStation, int currentVolume, int minStation, int maxStation, int minVolum, int maxVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.minVolum = minVolum;
        this.maxVolume = maxVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinVolum() {
        return minVolum;
    }

    public void setMinVolum(int minVolum) {
        this.minVolum = minVolum;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
}
