import React, { useState } from 'react';
import GuestPage from './Components/GuestPage';
import UserPage from './Components/UserPage';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  // Element Variable
  let content;
  if (isLoggedIn) {
    content = <UserPage />;
  } else {
    content = <GuestPage />;
  }

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  return (
    <div style={{ textAlign: 'center', marginTop: '20px' }}>
      <h1>Ticket Booking Application</h1>
      {isLoggedIn ? (
        <button onClick={handleLogout}>Logout</button>
      ) : (
        <button onClick={handleLogin}>Login</button>
      )}
      <hr />
      {content}
    </div>
  );
}

export default App;
