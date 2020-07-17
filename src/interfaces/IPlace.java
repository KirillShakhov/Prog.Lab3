package interfaces;

public interface IPlace extends IThing {
    default int getCoordinate() {
        return 0;
    }
    void setCoordinate(int i);
}
