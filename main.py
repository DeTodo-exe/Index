import flask as f
from flask_ngrok import run_with_ngrok

app = f.Flask(__name__)
run_with_ngrok(app)

@app.route('/')
def inicio():
    return f.render_template("intentodescript.html")

#zuñigay
if __name__ == "__main__":
    app.config['DEBUG'] = True
    app.run()