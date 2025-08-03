import React from 'react';

function ListofPlayers() {
  const players = [
    { name: "Virat", score: 85 },
    { name: "Rohit", score: 70 },
    { name: "Dhoni", score: 90 },
    { name: "Hardik", score: 65 },
    { name: "Kohli", score: 50 },
    { name: "Rahul", score: 75 },
    { name: "Pant", score: 60 },
    { name: "Bumrah", score: 40 },
    { name: "Shami", score: 80 },
    { name: "Jadeja", score: 55 },
    { name: "Ashwin", score: 88 }
  ];

  // 🔍 ES6 map()
  const playerList = players.map((p, index) => (
    <li key={index}>{p.name} - {p.score}</li>
  ));

  // 🎯 Arrow Function + filter
  const below70 = players.filter(p => p.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>{playerList}</ul>

      <h3>Players with score below 70:</h3>
      <ul>
        {below70.map((p, index) => (
          <li key={index}>{p.name} - {p.score}</li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;
