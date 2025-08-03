import React from 'react';

function SyntheticEventButton() {
  const handleClick = (e) => {
    e.preventDefault(); // SyntheticEvent
    alert('I was clicked!');
  };

  return (
    <div className="synthetic-container">
      <button onClick={handleClick}>OnPress</button>
    </div>
  );
}

export default SyntheticEventButton;
