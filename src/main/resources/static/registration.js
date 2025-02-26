// Script for switching between Login and Signup forms
function showLogin() {
    document.getElementById("login-form").classList.add("active");
    document.getElementById("signup-form").classList.remove("active");

    // Update buttons
    document.getElementById("login-btn").classList.add("active");
    document.getElementById("signup-btn").classList.remove("active");
}

function showSignup() {
    document.getElementById("signup-form").classList.add("active");
    document.getElementById("login-form").classList.remove("active");

    // Update buttons
    document.getElementById("signup-btn").classList.add("active");
    document.getElementById("login-btn").classList.remove("active");
}