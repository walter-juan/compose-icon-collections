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

public val Twbs.Messenger: ImageVector
    get() {
        if (_messenger != null) {
            return _messenger!!
        }
        _messenger = Builder(name = "Messenger", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.76f)
                curveTo(0.0f, 3.301f, 3.493f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(8.0f, 3.301f, 8.0f, 7.76f)
                reflectiveCurveToRelative(-3.493f, 7.76f, -8.0f, 7.76f)
                curveToRelative(-0.81f, 0.0f, -1.586f, -0.107f, -2.316f, -0.307f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, -0.427f, 0.03f)
                lineToRelative(-1.588f, 0.702f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, true, -0.898f, -0.566f)
                lineToRelative(-0.044f, -1.423f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, -0.215f, -0.456f)
                curveTo(0.956f, 12.108f, 0.0f, 10.092f, 0.0f, 7.76f)
                moveToRelative(5.546f, -1.459f)
                lineToRelative(-2.35f, 3.728f)
                curveToRelative(-0.225f, 0.358f, 0.214f, 0.761f, 0.551f, 0.506f)
                lineToRelative(2.525f, -1.916f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, true, 0.578f, -0.002f)
                lineToRelative(1.869f, 1.402f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 1.735f, -0.32f)
                lineToRelative(2.35f, -3.728f)
                curveToRelative(0.226f, -0.358f, -0.214f, -0.761f, -0.551f, -0.506f)
                lineTo(9.728f, 7.381f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, true, -0.578f, 0.002f)
                lineTo(7.281f, 5.98f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -1.735f, 0.32f)
                close()
            }
        }
        .build()
        return _messenger!!
    }

private var _messenger: ImageVector? = null
