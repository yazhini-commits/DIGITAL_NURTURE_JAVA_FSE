// D_FUNCTIONS_SCOPE.js
const eventsByCategory = { food: 0, music: 0 };

function addEvent(list, evt) {
  list.push(evt);
}

function registerUser(list, eventId, user) {
  const evt = list.find((e) => e.id === eventId);
  if (!evt) throw new Error("Event not found");
  if (evt.seats <= 0) throw new Error("Event full");
  evt.seats--;
  console.log(`${user} registered for ${evt.name}`);
}

function filterEventsByCategory(list, category, callback) {
  const result = list.filter((e) => e.category === category);
  if (callback) callback(result);
  return result;
}

// Closure to track registrations per category
function registrationTracker(category) {
  let count = 0;
  return function increment() {
    count++;
    eventsByCategory[category] = count;
    return count;
  };
}

const trackMusic = registrationTracker("music");
trackMusic();
trackMusic();

// Example usage with callback
const sample = [{ id: 1, name: "Jazz Night", category: "music", seats: 10 }];
filterEventsByCategory(sample, "music", (list) =>
  console.log("Filtered:", list),
);
