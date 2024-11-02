package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Frontendmentor: ImageVector
    get() {
        if (_frontendmentor != null) {
            return _frontendmentor!!
        }
        _frontendmentor = Builder(name = "Frontendmentor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.171f, 1.272f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, false, -0.719f, 0.732f)
                verticalLineToRelative(13.914f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, false, 0.732f, 0.732f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, false, 0.732f, -0.732f)
                lineTo(12.916f, 2.004f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, false, -0.745f, -0.732f)
                close()
                moveTo(23.245f, 5.44f)
                arcToRelative(0.734f, 0.734f, 0.0f, false, false, -0.276f, 0.063f)
                lineTo(16.686f, 8.307f)
                arcToRelative(0.733f, 0.733f, 0.0f, false, false, 0.0f, 1.336f)
                lineToRelative(6.282f, 2.813f)
                arcToRelative(0.738f, 0.738f, 0.0f, false, false, 0.299f, 0.065f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, false, 0.297f, -1.401f)
                lineToRelative(-4.786f, -2.144f)
                lineToRelative(4.786f, -2.137f)
                arcToRelative(0.734f, 0.734f, 0.0f, false, false, 0.37f, -0.966f)
                arcToRelative(0.734f, 0.734f, 0.0f, false, false, -0.69f, -0.433f)
                close()
                moveTo(0.746f, 10.472f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, false, -0.722f, 0.915f)
                curveToRelative(1.736f, 6.677f, 7.775f, 11.341f, 14.682f, 11.341f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, false, 0.0f, -1.464f)
                arcToRelative(13.705f, 13.705f, 0.0f, false, true, -13.266f, -10.245f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, false, -0.694f, -0.547f)
                close()
            }
        }
        .build()
        return _frontendmentor!!
    }

private var _frontendmentor: ImageVector? = null
