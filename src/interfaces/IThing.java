package interfaces;

public interface IThing {
    String getName();
    String getDescription(int i);

    String toString();
    boolean equals(Object pbj);
    int hashCode();
}
