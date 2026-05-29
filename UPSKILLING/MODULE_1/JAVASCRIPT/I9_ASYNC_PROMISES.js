// I_ASYNC_PROMISES.js
// Fetch example using .then/.catch and async/await

function fetchEventsThen() {
  console.log("Loading events (then/catch)...");
  fetch("https://jsonplaceholder.typicode.com/posts?_limit=5")
    .then((r) => r.json())
    .then((data) => {
      console.log("Events loaded (then):", data);
    })
    .catch((err) => console.error("Failed to load events", err));
}

async function fetchEventsAsync() {
  console.log("Loading events (async/await)...");
  const spinner = document.querySelector("#loadingSpinner");
  if (spinner) spinner.style.display = "block";
  try {
    const resp = await fetch(
      "https://jsonplaceholder.typicode.com/posts?_limit=5",
    );
    const data = await resp.json();
    console.log("Events loaded (async):", data);
  } catch (err) {
    console.error("Async load failed", err);
  } finally {
    if (spinner) spinner.style.display = "none";
  }
}

// Call demo functions (don't auto-run both in production)
fetchEventsThen();
// fetchEventsAsync();
