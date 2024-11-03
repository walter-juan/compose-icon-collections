package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.PersonStandingDress: ImageVector
    get() {
        if (_personStandingDress != null) {
            return _personStandingDress!!
        }
        _personStandingDress = Builder(name = "PersonStandingDress", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                moveToRelative(-0.5f, 12.25f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(-1.0f, -5.0f)
                verticalLineToRelative(-0.215f)
                arcToRelative(0.285f, 0.285f, 0.0f, false, true, 0.56f, -0.078f)
                lineToRelative(0.793f, 2.777f)
                arcToRelative(0.711f, 0.711f, 0.0f, true, false, 1.364f, -0.405f)
                lineToRelative(-1.065f, -3.461f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.784f, 3.5f)
                horizontalLineTo(7.216f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.868f, 2.118f)
                lineTo(3.283f, 9.079f)
                arcToRelative(0.711f, 0.711f, 0.0f, true, false, 1.365f, 0.405f)
                lineToRelative(0.793f, -2.777f)
                arcToRelative(0.285f, 0.285f, 0.0f, false, true, 0.56f, 0.078f)
                verticalLineTo(7.0f)
                lineToRelative(-1.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                close()
            }
        }
        .build()
        return _personStandingDress!!
    }

private var _personStandingDress: ImageVector? = null
