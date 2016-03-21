import cgi
from wsgiref.simple_server import make_server


def app(environ, start_response):
    html = b"""
    <html>
        <head>
            <title>Hello User!</title>
        </head>
        <body>
            <form method="post">
                <label>Hello</label>
                <input type="text" name="name">
                <input type="submit" value="Go">
            </form>
        </body>
    </html>
    """
    if environ['REQUEST_METHOD'] == 'POST':
        post_env = environ.copy()
        post_env['QUERY_STRING'] = ''
        import ipdb; ipdb.set_trace()
        post = cgi.FieldStorage(fp=environ['wsgi.input'], environ=post_env,
                                keep_blank_values=True)
        html = b'Hello, ' + post['name'].value + '!'

    start_response('200 OK', [('Content-Type', 'text/html')])
    return [html]

if __name__ == '__main__':
    try:
        httpd = make_server('', 8081, app)
        print 'Serving on port 8081...'
        httpd.serve_forever()
    except KeyboardInterrupt:
        print 'Goodbye..'
