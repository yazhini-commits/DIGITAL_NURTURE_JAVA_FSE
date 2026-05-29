// B_SYNTAX_DATATYPES.js
const eventName = "Community Festival";
const eventDate = "2026-06-15";
let seats = 100;

console.log(`Event: ${eventName} on ${eventDate}. Seats available: ${seats}`);

function registerOne() {
  if (seats > 0) {
    seats--; // use -- to decrement seats
    console.log(`Registered 1. Seats left: ${seats}`);
  } else {
    console.warn("No seats available");
  }
}

// Example usage
registerOne();
registerOne();
