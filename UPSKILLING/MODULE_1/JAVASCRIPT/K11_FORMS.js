// K_FORMS.js
// Assumes an HTML form with id="registerForm" and fields name,email,eventId

document.addEventListener("DOMContentLoaded", () => {
  const form = document.getElementById("registerForm");
  if (!form) return;
  form.addEventListener("submit", (e) => {
    e.preventDefault();
    const { name, email, eventId } = form.elements;
    let errors = [];
    if (!name.value.trim()) errors.push("Name is required");
    if (!email.value.includes("@")) errors.push("Valid email required");
    if (errors.length) {
      console.warn("Validation errors:", errors);
      // show inline errors (assumes an element #formErrors)
      const errEl = document.getElementById("formErrors");
      if (errEl) errEl.textContent = errors.join("; ");
      return;
    }
    console.log("Submitting registration", {
      name: name.value,
      email: email.value,
      eventId: eventId.value,
    });
    // proceed to POST or local handling
  });
});
