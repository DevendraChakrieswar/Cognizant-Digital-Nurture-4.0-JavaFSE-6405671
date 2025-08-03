import React, { useState } from "react";
import "./App.css";

const exchangeRates = {
  USD: 0.012,
  EUR: 0.011,
  GBP: 0.0095,
  JPY: 1.80,
  AUD: 0.018,
  CAD: 0.016,
};

const CurrencyConvertor = () => {
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("USD");
  const [converted, setConverted] = useState(null);

  const handleSubmit = (e) => {
    e.preventDefault();

    if (!amount || isNaN(amount)) {
      alert("Please enter a valid amount in INR");
      return;
    }

    const rate = exchangeRates[currency];
    const result = (parseFloat(amount) * rate).toFixed(2);
    setConverted(`${result} ${currency}`);
  };

  return (
    <div className="converter-box">
      <h2>Currency Converter</h2>
      <form onSubmit={handleSubmit}>
        <label>
          Amount (INR):
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
            placeholder="Enter INR"
          />
        </label>
        <br />
        <label>
          Convert to:
          <select
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
          >
            {Object.keys(exchangeRates).map((cur) => (
              <option key={cur} value={cur}>
                {cur}
              </option>
            ))}
          </select>
        </label>
        <br />
        <button type="submit">Convert</button>
      </form>
      {converted && <p className="result">Converted Amount: {converted}</p>}
    </div>
  );
};

export default CurrencyConvertor;
