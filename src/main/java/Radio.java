public class Radio {

    public int currentStation;
    public int currentVolume;
    public int maxStation;
    public int minStation;
    public int maxVolume = 100;
    public int minVolume = 0;

    public Radio() {
        this.maxStation = 9;
        this.minStation = 0;
    }

    public Radio(int maxStationUsers) {
        this.maxStation = maxStationUsers - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void increase() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decrease() {
        if (currentVolume != minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

}
