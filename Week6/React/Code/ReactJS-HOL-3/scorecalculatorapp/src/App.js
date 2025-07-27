import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore 
        name="Alice"
        school="Green Valley High School"
        total={420}
        goal={5}
      />
    </div>
  );
}

export default App;
