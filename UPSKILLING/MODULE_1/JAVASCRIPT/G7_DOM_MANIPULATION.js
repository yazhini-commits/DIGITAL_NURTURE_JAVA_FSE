// G_DOM_MANIPULATION.js
// This file assumes an HTML container: <div id="eventsContainer"></div>

const sampleEvents = [
  { id: 1, name: "Music Fest", date: "2099-08-10", seats: 10 },
  { id: 2, name: "Art Class", date: "2099-09-01", seats: 0 },
];

function createEventCard(evt) {
  const card = document.createElement("div");
  card.className = "event-card";
  const title = document.createElement("h3");
  title.textContent = evt.name;
  const info = document.createElement("p");
  info.textContent = `${evt.date} — Seats: ${evt.seats}`;

  const btn = document.createElement("button");
  btn.textContent = "Register";
  btn.disabled = evt.seats <= 0;
  btn.onclick = () => {
    if (evt.seats > 0) {
      evt.seats--;
      info.textContent = `${evt.date} — Seats: ${evt.seats}`;
      if (evt.seats === 0) btn.disabled = true;
      console.log(`You registered for ${evt.name}`);
    }
  };

  card.appendChild(title);
  card.appendChild(info);
  card.appendChild(btn);
  return card;
}

function renderEvents(list) {
  const container = document.querySelector("#eventsContainer");
  if (!container) return console.warn("No #eventsContainer in DOM");
  container.innerHTML = "";
  list.forEach((evt) => container.appendChild(createEventCard(evt)));
}

// Render on DOMContentLoaded
window.addEventListener("DOMContentLoaded", () => renderEvents(sampleEvents));
