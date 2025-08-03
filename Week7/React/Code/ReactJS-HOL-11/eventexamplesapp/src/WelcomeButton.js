import React from 'react';

function WelcomeButton() {
  const handleWelcome = (message) => {
    alert(message);
  };

  return (
    <div className="welcome-container">
      <button onClick={() => handleWelcome('Welcome to React Events!')}>Say Welcome</button>
    </div>
  );
}

export default WelcomeButton;
