var checkStraightLine = function(coordinates) {
  const coordinateCount = coordinates.length;

  // Check for vertical line first
  if (coordinates[1][0] === coordinates[0][0]) {
    return coordinates.every(([x, y]) => x === coordinates[0][0]);
  }

  let initX = coordinates[0][0];
  let initY = coordinates[0][1];

  const xDiff = coordinates[1][0] - coordinates[0][0];
  const yDiff = coordinates[1][1] - coordinates[0][1];

  const initialSlope = yDiff / xDiff;

  for (let i = 1; i < coordinateCount; i++) {
    const x = coordinates[i][0];
    const y = coordinates[i][1];

    const slope = x !== initX ? (y - initY) / (x - initX) : Infinity; // Handle vertical lines

    if (slope!== initialSlope) {
      return false;
    }

    initX = x;
    initY = y;
  }

  return true;
};
