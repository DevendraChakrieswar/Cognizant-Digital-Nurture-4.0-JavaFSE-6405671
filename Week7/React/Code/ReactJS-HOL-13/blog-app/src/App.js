import React, { useState } from 'react';
import BookDetails from './Components/BookDetails';
import BlogDetails from './Components/BlogDetails';
import CourseDetails from './Components/CourseDetails';

function App() {
  const [selectedComponent, setSelectedComponent] = useState('');

  // Using if-else
  const renderComponentIfElse = () => {
    if (selectedComponent === 'book') {
      return <BookDetails />;
    } else if (selectedComponent === 'blog') {
      return <BlogDetails />;
    } else if (selectedComponent === 'course') {
      return <CourseDetails />;
    } else {
      return <p>Please select a component.</p>;
    }
  };

  // Using element variable
  let componentToRender;
  if (selectedComponent === 'book') {
    componentToRender = <BookDetails />;
  } else if (selectedComponent === 'blog') {
    componentToRender = <BlogDetails />;
  } else if (selectedComponent === 'course') {
    componentToRender = <CourseDetails />;
  }

  return (
    <div style={{ textAlign: 'center', marginTop: '30px' }}>
      <h1>Blogger App - Conditional Rendering Demo</h1>
      
      <div style={{ marginBottom: '20px' }}>
        <button onClick={() => setSelectedComponent('book')}>Show Book</button>
        <button onClick={() => setSelectedComponent('blog')}>Show Blog</button>
        <button onClick={() => setSelectedComponent('course')}>Show Course</button>
        <button onClick={() => setSelectedComponent('')}>Clear</button>
      </div>

      <h2>1️⃣ Using If-Else</h2>
      {renderComponentIfElse()}

      <h2>2️⃣ Using Element Variable</h2>
      {componentToRender}

      <h2>3️⃣ Using Ternary Operator</h2>
      {selectedComponent === 'book' ? (
        <BookDetails />
      ) : selectedComponent === 'blog' ? (
        <BlogDetails />
      ) : selectedComponent === 'course' ? (
        <CourseDetails />
      ) : (
        <p>No component selected.</p>
      )}

      {/* 4️⃣ Logical && Operator (Alternative Way) */}
      {/* 
        {selectedComponent === 'book' && <BookDetails />}
        {selectedComponent === 'blog' && <BlogDetails />}
        {selectedComponent === 'course' && <CourseDetails />}
      */}
    </div>
  );
}

export default App;
