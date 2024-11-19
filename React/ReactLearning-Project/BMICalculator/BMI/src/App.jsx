import React, { useCallback, useMemo, useState } from 'react'
import './App.css'

const App = () => {
  const [h, setHeight] = useState(0);
  const [w, setWeight] = useState(0);

  const heightchange = (e) => {
    console.log(e.target.value);
    setHeight(e.target.value);
  }

  const weightchange = (e) => {
    console.log(e.target.value);
    setWeight(e.target.value);
  }

  const result = useMemo(() => {
    const calculatedHeight = h / 100;
    return (w / (calculatedHeight * calculatedHeight)).toFixed(1);
  }, [h,w]);

  return (
    <div className='box'>
      <div className='container'>
        <h1 className='title'>BMI Calculator</h1>
         
        <div className='input-group'>
          <label htmlFor="" className='label'>Weight: {w} kg</label>
          <input type="range" min="40" max="220" onChange={weightchange} value={w} className='range-input' />

          <label htmlFor="" className='label'>Height: {h} cm</label>
          <input type="range" min="40" max="220" onChange={heightchange} value={h} className='range-input' />
        </div>

        <div className='result-container'>
          <span className='result-text'>Your BMI is</span>
          <p className='result-value'>{result}</p>
        </div>
      </div>
    </div>
  )
}

export default App;
