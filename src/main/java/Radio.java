import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

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

    public Radio(int size) {
        maxStation = minStation + size - 1;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            setCurrentStation(minStation);
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


}


/*
public class Radio {

    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStation = minStation;
    private int currentVolume = minVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
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
            setCurrentStation(minStation);
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
}*/
