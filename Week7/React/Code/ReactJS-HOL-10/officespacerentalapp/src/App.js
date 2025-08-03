import React from "react";

function App() {
  const heading = <h1 style={{ textAlign: "center", margin: "20px" }}>Office Space Rental App</h1>;

  const officeImage = "https://images.unsplash.com/photo-1497215728101-856f4ea42174?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"; // sample image URL

  const offices = [
    {
      name: "Eco Space",
      rent: 55000,
      address: "MG Road, Bangalore"
    },
    {
      name: "Urban Hub",
      rent: 75000,
      address: "Powai, Mumbai"
    },
    {
      name: "Skyline Towers",
      rent: 62000,
      address: "Hi-Tech City, Hyderabad"
    },
    {
      name: "Nest Works",
      rent: 45000,
      address: "T-Nagar, Chennai"
    }
  ];

  const getRentColor = (rent) => {
    return {
      color: rent < 60000 ? "red" : "green",
      fontWeight: "bold"
    };
  };

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      {heading}
      <div style={{ textAlign: "center" }}>
        <img src={officeImage} alt="Office" width="400" style={{ borderRadius: "10px" }} />
      </div>

      <h2 style={{ marginTop: "30px" }}>Available Office Spaces</h2>
      <ul>
        {offices.map((office, index) => (
          <li key={index} style={{ marginBottom: "15px", lineHeight: "1.6" }}>
            <strong>Name:</strong> {office.name} <br />
            <strong>Rent:</strong>{" "}
            <span style={getRentColor(office.rent)}>₹{office.rent}</span> <br />
            <strong>Address:</strong> {office.address}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
