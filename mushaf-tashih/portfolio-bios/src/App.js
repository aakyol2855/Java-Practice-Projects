import React, { useState, useEffect } from 'react';
import './styles/BiosStyle.css';

function App() {
  const [activeTab, setActiveTab] = useState('main');
  const [isAdmin, setIsAdmin] = useState(false);
  const [adminCredentials, setAdminCredentials] = useState({ username: '', password: '' });
  const [showLoginForm, setShowLoginForm] = useState(false);
  const [showCursor, setShowCursor] = useState(true);
  const [notification, setNotification] = useState({ show: false, message: '', type: '' });
  
  // Yeni state'ler
  const [information, setInformation] = useState('');
  const [projects, setProjects] = useState([]);
  const [socialMedia, setSocialMedia] = useState([]);
  const [newProject, setNewProject] = useState({ 
    title: '', 
    description: '', 
    githubUrl: '',
    liveUrl: '',
    technologies: ''
  });
  const [newSocialMedia, setNewSocialMedia] = useState({ platform: '', url: '' });

  // Sayfa yüklendiğinde localStorage'dan verileri al
  useEffect(() => {
    const savedInformation = localStorage.getItem('information');
    const savedProjects = localStorage.getItem('projects');
    const savedSocialMedia = localStorage.getItem('socialMedia');

    if (savedInformation) setInformation(savedInformation);
    if (savedProjects) setProjects(JSON.parse(savedProjects));
    if (savedSocialMedia) setSocialMedia(JSON.parse(savedSocialMedia));
  }, []);

  useEffect(() => {
    const cursorInterval = setInterval(() => {
      setShowCursor(prev => !prev);
    }, 500);
    return () => clearInterval(cursorInterval);
  }, []);

  const showNotification = (message, type) => {
    setNotification({ show: true, message, type });
    setTimeout(() => {
      setNotification({ show: false, message: '', type: '' });
    }, 3000);
  };

  const handleAdminLogin = () => {
    if (adminCredentials.username === 'aakyol28' && adminCredentials.password === '55samsun') {
      setIsAdmin(true);
      setShowLoginForm(false);
      showNotification('Login successful!', 'success');
    } else {
      showNotification('Invalid credentials!', 'error');
    }
  };

  const handleAdminLogout = () => {
    setIsAdmin(false);
    showNotification('Logged out successfully!', 'success');
  };

  const handleSaveInformation = () => {
    localStorage.setItem('information', information);
    showNotification('Information saved successfully!', 'success');
  };

  const handleAddProject = () => {
    if (newProject.title && newProject.description) {
      const updatedProjects = [...projects, newProject];
      setProjects(updatedProjects);
      localStorage.setItem('projects', JSON.stringify(updatedProjects));
      setNewProject({ 
        title: '', 
        description: '', 
        githubUrl: '',
        liveUrl: '',
        technologies: ''
      });
      showNotification('Project added successfully!', 'success');
    } else {
      showNotification('Please fill required fields!', 'error');
    }
  };

  const handleAddSocialMedia = () => {
    if (newSocialMedia.platform && newSocialMedia.url) {
      const updatedSocialMedia = [...socialMedia, newSocialMedia];
      setSocialMedia(updatedSocialMedia);
      localStorage.setItem('socialMedia', JSON.stringify(updatedSocialMedia));
      setNewSocialMedia({ platform: '', url: '' });
      showNotification('Social media link added successfully!', 'success');
    } else {
      showNotification('Please fill all fields!', 'error');
    }
  };

  const renderContent = () => {
    switch (activeTab) {
      case 'information':
        return (
          <div className="bios-section">
            <h2 className="bios-section-title">Information</h2>
            {isAdmin ? (
              <div>
                <textarea 
                  className="bios-input" 
                  rows="10" 
                  cols="50" 
                  placeholder="Enter your information here..." 
                  value={information}
                  onChange={(e) => setInformation(e.target.value)}
                />
                <button className="bios-button" onClick={handleSaveInformation}>Save</button>
              </div>
            ) : (
              <div>
                <p>{information || 'Your information will be displayed here...'}</p>
                <span className="bios-cursor" style={{ opacity: showCursor ? 1 : 0 }}></span>
              </div>
            )}
          </div>
        );
      case 'main':
        return (
          <div className="bios-section">
            <h2 className="bios-section-title">Main</h2>
            <div className="bios-section">
              <h3 className="bios-section-subtitle">Projects</h3>
              {isAdmin ? (
                <div>
                  <input 
                    type="text" 
                    className="bios-input" 
                    placeholder="Project title" 
                    value={newProject.title}
                    onChange={(e) => setNewProject({ ...newProject, title: e.target.value })}
                  />
                  <textarea 
                    className="bios-input" 
                    rows="5" 
                    cols="50" 
                    placeholder="Project description" 
                    value={newProject.description}
                    onChange={(e) => setNewProject({ ...newProject, description: e.target.value })}
                  />
                  <input 
                    type="text" 
                    className="bios-input" 
                    placeholder="GitHub URL (optional)" 
                    value={newProject.githubUrl}
                    onChange={(e) => setNewProject({ ...newProject, githubUrl: e.target.value })}
                  />
                  <input 
                    type="text" 
                    className="bios-input" 
                    placeholder="Live URL (optional)" 
                    value={newProject.liveUrl}
                    onChange={(e) => setNewProject({ ...newProject, liveUrl: e.target.value })}
                  />
                  <input 
                    type="text" 
                    className="bios-input" 
                    placeholder="Technologies used (e.g., React, HTML, CSS)" 
                    value={newProject.technologies}
                    onChange={(e) => setNewProject({ ...newProject, technologies: e.target.value })}
                  />
                  <button className="bios-button" onClick={handleAddProject}>Add Project</button>
                </div>
              ) : (
                <div className="project-list">
                  {projects.map((project, index) => (
                    <div key={index} className="project-item">
                      <a href="#" className="project-link">[{project.title}]</a>
                      <p className="project-description">{project.description}</p>
                      {project.technologies && (
                        <p className="project-description">Technologies: {project.technologies}</p>
                      )}
                      <div className="project-links">
                        {project.githubUrl && (
                          <a href={project.githubUrl} className="project-link-item" target="_blank" rel="noopener noreferrer">
                            [GitHub]
                          </a>
                        )}
                        {project.liveUrl && (
                          <a href={project.liveUrl} className="project-link-item" target="_blank" rel="noopener noreferrer">
                            [Live Demo]
                          </a>
                        )}
                      </div>
                    </div>
                  ))}
                </div>
              )}
            </div>
            <div className="bios-section">
              <h3 className="bios-section-subtitle">Social Media</h3>
              {isAdmin ? (
                <div>
                  <input 
                    type="text" 
                    className="bios-input" 
                    placeholder="Social media platform" 
                    value={newSocialMedia.platform}
                    onChange={(e) => setNewSocialMedia({ ...newSocialMedia, platform: e.target.value })}
                  />
                  <input 
                    type="text" 
                    className="bios-input" 
                    placeholder="URL" 
                    value={newSocialMedia.url}
                    onChange={(e) => setNewSocialMedia({ ...newSocialMedia, url: e.target.value })}
                  />
                  <button className="bios-button" onClick={handleAddSocialMedia}>Add Social Media</button>
                </div>
              ) : (
                <div className="social-links">
                  {socialMedia.map((social, index) => (
                    <a key={index} href={social.url} className="social-link" target="_blank" rel="noopener noreferrer">
                      [{social.platform}]
                    </a>
                  ))}
                </div>
              )}
            </div>
          </div>
        );
      case 'exit':
        return (
          <div className="bios-section">
            <h2 className="bios-section-title">Exit</h2>
            <p>Are you sure you want to exit?</p>
            <button className="bios-button">Yes</button>
            <button className="bios-button">No</button>
          </div>
        );
      default:
        return null;
    }
  };

  return (
    <div className="bios-container">
      <div className="bios-header">
        BIOS SETUP UTILITY
      </div>
      <div className="bios-menu">
        <div className={`bios-menu-item ${activeTab === 'information' ? 'active' : ''}`} onClick={() => setActiveTab('information')}>Information</div>
        <div className={`bios-menu-item ${activeTab === 'main' ? 'active' : ''}`} onClick={() => setActiveTab('main')}>Main</div>
        <div className={`bios-menu-item ${activeTab === 'exit' ? 'active' : ''}`} onClick={() => setActiveTab('exit')}>Exit</div>
      </div>
      <div className="bios-main-content">
        {renderContent()}
      </div>
      {isAdmin ? (
        <div className="admin-login">
          <button className="bios-button" onClick={handleAdminLogout}>Logout</button>
        </div>
      ) : (
        <div className="admin-login">
          <button className="bios-button" onClick={() => setShowLoginForm(true)}>Admin Login</button>
        </div>
      )}
      <div className="bios-footer">
        © 2024 Portfolio BIOS. All rights reserved.
      </div>
      {showLoginForm && (
        <div className="bios-content" style={{ position: 'fixed', top: '50%', left: '50%', transform: 'translate(-50%, -50%)', width: '300px' }}>
          <h2 className="bios-section-title">Admin Login</h2>
          <input
            type="text"
            className="bios-input"
            placeholder="Username"
            value={adminCredentials.username}
            onChange={(e) => setAdminCredentials({ ...adminCredentials, username: e.target.value })}
          />
          <input
            type="password"
            className="bios-input"
            placeholder="Password"
            value={adminCredentials.password}
            onChange={(e) => setAdminCredentials({ ...adminCredentials, password: e.target.value })}
          />
          <div style={{ display: 'flex', gap: '10px', marginTop: '10px' }}>
            <button className="bios-button" onClick={handleAdminLogin}>Login</button>
            <button className="bios-button" onClick={() => setShowLoginForm(false)}>Cancel</button>
          </div>
        </div>
      )}
      {notification.show && (
        <div className={`bios-notification ${notification.type}`}>
          {notification.message}
        </div>
      )}
    </div>
  );
}

export default App;
