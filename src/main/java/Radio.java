public class Radio {
    private int currentStation;
    private int minStation;
    private int maxStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
        maxStation = 9;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public int getMinStation() {
        return this.minStation;
    }

    public int getMaxStation() {
        return this.maxStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public int getMinVolume() {
        return this.minVolume;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            setCurrentStation(0);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume)
            return;
        currentVolume = newCurrentVolume;
    }

    public void volumeUp() {
        if (currentVolume < maxVolume)
            currentVolume = currentVolume + 1;
    }

    public void volumeDown() {
        if (currentVolume > minVolume)
            currentVolume = currentVolume - 1;
    }

    public Radio(int size) {
        maxStation = minStation + size - 1;
    }
}




/*
public class Radio {

    private int currentStation;
    private int minStation;
    private int maxStation;

    public Radio(int size) {
        maxStation = minStation + size - 1;
    }

    public Radio() {
        maxStation = 9;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            setCurrentStation(0);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume)
            return;
        currentVolume = newCurrentVolume;
    }

    public void volumeUp() {
        if (currentVolume < maxVolume)
            currentVolume = currentVolume + 1;
    }

    public void volumeDown() {
        if (currentVolume > minVolume)
            currentVolume = currentVolume - 1;
    }
} */
