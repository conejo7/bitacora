import { TestBed } from '@angular/core/testing';

import { AudImagenService } from './aud-imagen.service';

describe('AudImagenService', () => {
  let service: AudImagenService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AudImagenService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
