// J_MODERN_JS.js
// Examples of ES6+ features

// Default params and destructuring
function showEvent({ name = "Unnamed", date = "TBD" } = {}) {
  console.log(`Event: ${name} — ${date}`);
}

// Spread operator for cloning
const original = [{ id: 1, name: "A" }];
const cloned = [...original];

showEvent({ name: "Community Meetup", date: "2026-07-01" });
console.log("Cloned list:", cloned);
