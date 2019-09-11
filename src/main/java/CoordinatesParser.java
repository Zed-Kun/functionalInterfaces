class CoordinatesParser {

    Coordinates parse(String coordinates, CoordinatesCreator coordinatesCreator) {
        final String[] coordinatesParts = coordinates.split(",");
        final String x = coordinatesParts[0];
        final String y = coordinatesParts[1];
        return coordinatesCreator.createCoordinates(Integer.parseInt(x), Integer.parseInt(y));
    }
}
