# DongSan2Mong
건국대학교 2023년 1학기 산학협력프로젝트 [진매알밥양많이] 팀의 부동산 플래너 어플 "동산이몽"의 리포지토리입니다.

# Commit Message Convention
### 1. 기본 구조
> 제목 (Type: Subject)
> (한줄 띄고)
> 본문 (Body)
> (한줄 띄고)
> 꼬리말 (Footer)

### 2. 커밋의 타입 구성
> 태그: 제목
> : 뒤에만 space를 넣는다.

| Tag | Description |
| :---: | :---: | :---: |
| `Feat` | 새로운 기능을 추가 |
| `Fix` | 버그 수정 |
| `Design` | CSS 등 사용자 UI 디자인 변경 |
| `!BREAKING CHANGE` | 커다란 API 변경의 경우 |
| `!HOTFIX` | 급하게 치명적인 버그를 고쳐야하는 경우 |
| `Style` | 코드 포맷 변경, 세미 콜론 누락, 코드 수정이 없는 경우 |
| `Refactor` | 프로덕션 코드 리팩토링 |
| `Comment` | 필요한 주석 추가 및 변경 |
| `Docs` | 문서 수정 |
| `Test` | 테스트 코드, 리펙토링 테스트 코드 추가, Production Code(실제로 사용하는 코드) 변경 없음 |
| `Chore` | 빌드 업무 수정, 패키지 매니저 수정, 패키지 관리자 구성 등 업데이트, Production Code 변경 없음 |
| `Rename` | 파일 혹은 폴더명을 수정하거나 옮기는 작업만인 경우 |
| `Remove` | 파일을 삭제하는 작업만 수행한 경우 |

- 예시
  - Feat [#12] Home - 서치바 레이아웃
  - Add [#15] 리포트 에셋 추가

### 3. Subject
- 제목은 50글자 이내
- 첫글자는 대문자
- 마침표 및 특수기호 사용X
- 현재시제
- 간결하게

### 4. Body
- 72자 이내
- 최대한 상세히(코드 변경의 이유가 명확할수록 좋음)
- 어떻게보다 무엇을, 왜

### 5. Footer
- 선택사항
- issue tracker ID 명시하고 싶을 떄만
- 유형: #이슈 번호
- 여러 개의 이슈변호는 쉼표(,)로 구분
- 이슈 트래커 유형은 다음 중 하나를 사용
  - Fixes: 이슈 수정중(아직 해결되지 않은 경우)
  - Resolves: 이슈를 해결했을 때
  - Ref: 참고할 이슈가 있을 때
  - Related to: 해당 커밋에 관련된 이슈번호(아직 해결되지 않은 경우)
- ex)
- Fixes: #45 Related to: #34, #23

### 6. Example
Feat: 회원 가입 기능 구현

SMS, 이메일 중복확인 API 개발

Resolves: #123
Ref: #456
Related to: #48, #45
