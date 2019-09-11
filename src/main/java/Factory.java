class Factory {

    Coordinates createCoordinates(final Integer x, final Integer y) {
        return new Coordinates(x, y);
    }

    static Coordinates createsCoordinates(final Integer x, final Integer y) {
        return new Coordinates(x, y);
    }
}
