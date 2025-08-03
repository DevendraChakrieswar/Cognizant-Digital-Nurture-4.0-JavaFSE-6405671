import React from 'react';

function IndianPlayers() {
  const oddTeam = ["Virat", "Dhoni", "Kohli", "Pant", "Shami"];
  const evenTeam = ["Rohit", "Hardik", "Rahul", "Bumrah", "Jadeja"];

  // 🔧 ES6 Destructuring
  const [player1, player2, ...restOdd] = oddTeam;
  const [playerA, playerB, ...restEven] = evenTeam;

  const T20Players = ["Surya", "Rinku", "Gill"];
  const RanjiPlayers = ["Pujara", "Rahane", "Saha"];

  // 📦 Merge arrays using spread operator
  const allPlayers = [...T20Players, ...RanjiPlayers];

  return (
    <div>
      <h2>Odd Team (Destructured)</h2>
      <p>Player1: {player1}</p>
      <p>Player2: {player2}</p>
      <p>Rest: {restOdd.join(', ')}</p>

      <h2>Even Team (Destructured)</h2>
      <p>PlayerA: {playerA}</p>
      <p>PlayerB: {playerB}</p>
      <p>Rest: {restEven.join(', ')}</p>

      <h2>All Players (T20 + Ranji)</h2>
      <ul>
        {allPlayers.map((p, index) => (
          <li key={index}>{p}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;
