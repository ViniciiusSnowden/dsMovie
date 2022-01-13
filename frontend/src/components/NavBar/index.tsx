import { ReactComponent as GitHubIcon } from "assets/img/github.svg";
import './style.css'
function NavBar() {
  return (
    <header>
      <nav className="container">
        <div className="dsmovieNavContent">
          <h1>DsMovie</h1>
          <a href="https://github.com/ViniciiusSnowden/dsMovie" target="_blank" rel="noreferrer">
            <div className="dsmovieContactContainer">
              <GitHubIcon />
              <p className="dsmovieContactLink">/DevSuperior</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default NavBar;
