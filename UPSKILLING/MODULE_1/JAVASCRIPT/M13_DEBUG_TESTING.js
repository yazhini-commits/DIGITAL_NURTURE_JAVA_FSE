// M_DEBUG_TESTING.js
// Use console logs and debugger statements to aid debugging

function problematicFunction(x) {
  console.log("Entering problematicFunction with", x);
  debugger; // set a breakpoint here in DevTools
  if (!x) throw new Error("Invalid input");
  return x * 2;
}

try {
  const result = problematicFunction(0);
  console.log("Result", result);
} catch (err) {
  console.error("Caught error:", err.message);
}

// Tips: open DevTools, add breakpoints, inspect network requests in the Network tab.
