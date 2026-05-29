// C_CONDITIONALS_LOOPS.js
const events = [
  { id: 1, name: "Past Event", date: "2021-01-01", seats: 0 },
  { id: 2, name: "Open Workshop", date: "2099-12-31", seats: 25 },
  { id: 3, name: "Full Concert", date: "2099-06-10", seats: 0 },
];

function isUpcoming(evt) {
  try {
    return new Date(evt.date) > new Date();
  } catch (e) {
    console.error("Invalid date for event", evt, e);
    return false;
  }
}

function displayAvailableEvents(list) {
  list.forEach((evt) => {
    if (isUpcoming(evt) && evt.seats > 0) {
      console.log(
        `Showing event: ${evt.name} (${evt.date}) — seats: ${evt.seats}`,
      );
    } else {
      console.log(`Hiding event: ${evt.name} (past or full)`);
    }
  });
}

displayAvailableEvents(events);

function registerForEvent(eventId) {
  try {
    const evt = events.find((e) => e.id === eventId);
    if (!evt) throw new Error("Event not found");
    if (!isUpcoming(evt)) throw new Error("Cannot register for past event");
    if (evt.seats <= 0) throw new Error("Event is full");
    evt.seats--;
    console.log(`Registered to ${evt.name}. Seats left: ${evt.seats}`);
  } catch (err) {
    console.error("Registration error:", err.message);
  }
}

// Example: attempt registration
registerForEvent(2);
registerForEvent(3);
