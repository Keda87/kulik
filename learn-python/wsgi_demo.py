from wsgiref.simple_server import make_server


def app(environ, start_response):
    start_response('200 OK', [('Content-Type', 'text/html')])
    return [b'Hello world, wsgi!']

if __name__ == '__main__':
    try:
        httpd = make_server('', 8081, app)
        print 'Serving on port 8081...'
        httpd.serve_forever()
    except KeyboardInterrupt:
        print 'Goodbye..'
