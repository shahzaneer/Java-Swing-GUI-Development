public class First{
    int shah;

}
    public First() {
    }

    public First(int shah) {
        this.shah = shah;
    }

    public int getShah() {
        return this.shah;
    }

    public void setShah(int shah) {
        this.shah = shah;
    }

    public First shah(int shah) {
        setShah(shah);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof First)) {
            return false;
        }
        First first = (First) o;
        return shah == first.shah;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(shah);
    }

    @Override
    public String toString() {
        return "{" +
            " shah='" + getShah() + "'" +
            "}";
    }
