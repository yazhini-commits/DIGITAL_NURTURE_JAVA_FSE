// F_ARRAYS_METHODS.js
let events = [
  { id: 1, name: "Music Fest", category: "music", seats: 10 },
  { id: 2, name: "Baking Workshop", category: "workshop", seats: 5 },
];

// Add new event
events.push({ id: 3, name: "Farmers Market", category: "market", seats: 0 });

// Filter music events
const musicEvents = events.filter((e) => e.category === "music");
console.log("Music events:", musicEvents);

// Map to display strings
const display = events.map((e) => `${e.name} (${e.category})`);
console.log("Display list:", display);
