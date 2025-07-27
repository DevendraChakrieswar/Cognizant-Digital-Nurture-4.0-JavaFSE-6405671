
import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  // Method to load posts
  loadPosts = async () => {
    try {
      const response = await fetch("https://jsonplaceholder.typicode.com/posts");
      const data = await response.json();
      this.setState({ posts: data });
    } catch (error) {
      this.setState({ hasError: true });
      console.error("Error fetching posts:", error);
    }
  };

  // componentDidMount
  componentDidMount() {
    this.loadPosts();
  }

  // Error Boundary
  componentDidCatch(error, info) {
    alert("An error occurred in the Posts component.");
    console.error("Error caught by componentDidCatch:", error, info);
  }

  // Render posts
  render() {
    if (this.state.hasError) {
      return <h2>Something went wrong while loading posts.</h2>;
    }

    return (
      <div style={{ padding: "20px" }}>
        <h2>Blog Posts</h2>
        {this.state.posts.map((post) => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
