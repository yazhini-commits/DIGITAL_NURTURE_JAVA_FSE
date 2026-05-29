// H_EVENT_HANDLING.js
// Example handlers for register buttons, filters, and search

document.addEventListener("DOMContentLoaded", () => {
  // onchange filter example
  const categorySelect = document.querySelector("#categoryFilter");
  if (categorySelect) {
    categorySelect.addEventListener("change", (e) => {
      console.log("Filter changed to", e.target.value);
      // call filter function (assumes filterEvents exists)
      if (window.filterEventsByCategory)
        window.filterEventsByCategory(e.target.value);
    });
  }

  // keydown quick search
  const searchInput = document.querySelector("#quickSearch");
  if (searchInput) {
    searchInput.addEventListener("keydown", (e) => {
      if (e.key === "Enter") {
        e.preventDefault();
        console.log("Search:", e.target.value);
        // trigger search (assumes searchByName exists)
        if (window.searchByName) window.searchByName(e.target.value);
      }
    });
  }

  // generic onclick example for delegation
  const container = document.querySelector("#eventsContainer");
  if (container) {
    container.addEventListener("click", (e) => {
      if (e.target && e.target.matches("button.register")) {
        const id = parseInt(e.target.dataset.eventId, 10);
        console.log("Register button clicked for", id);
      }
    });
  }
});
