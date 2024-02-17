import React from 'react';
import { Link } from "react-router-dom";
const DriverHome = ({ isLoggedIn, handleLogout }) => {
  
  return (
    <div>
     
      <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
        <div className="container">
          <span className="navbar-brand" href="#">Driver Home</span>
          <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav me-auto mb-2 mb-lg-0">
              <li className="nav-item">
              <Link className="nav-link active" to="/postRides">PostRides</Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to="/myRides">MyRides</Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to="/oldRides">OldRides</Link>
              </li>
            </ul>
          </div>
        </div>
      <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav ms-auto">
              {isLoggedIn ? (
                <li className="nav-item">
                  <button
                    className="btn btn-outline-text-success"
                    onClick={handleLogout}
                  >
                    Logout
                  </button>
                </li>
              ) : (
                <li className="nav-item">
                  <Link className="btn btn-outline-primary" to="/logout">
                    Logout
                  </Link>
                </li>
              )}
            </ul>
          </div>
      </nav>
    <div>
      {/* Page Content */}
     <h1>This is driver Page</h1>
     <h1>Welcome </h1>
    </div>
    </div>
  );
};

export default DriverHome;
