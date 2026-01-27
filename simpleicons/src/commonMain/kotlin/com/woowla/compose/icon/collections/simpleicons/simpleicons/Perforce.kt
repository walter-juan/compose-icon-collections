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

public val Simpleicons.Perforce: ImageVector
    get() {
        if (_perforce != null) {
            return _perforce!!
        }
        _perforce = Builder(name = "Perforce", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.386f, 14.957f)
                lineToRelative(2.279f, -1.316f)
                lineToRelative(-0.576f, -0.333f)
                arcTo(1.48f, 1.48f, 0.0f, false, true, 8.334f, 12.0f)
                curveToRelative(0.0f, -0.262f, 0.073f, -0.915f, 0.755f, -1.308f)
                lineToRelative(10.31f, -5.953f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, true, 1.51f, 0.0f)
                curveToRelative(0.228f, 0.13f, 0.755f, 0.52f, 0.755f, 1.308f)
                verticalLineToRelative(11.906f)
                curveToRelative(0.0f, 0.788f, -0.527f, 1.178f, -0.754f, 1.308f)
                reflectiveCurveToRelative(-0.828f, 0.393f, -1.51f, 0.0f)
                lineToRelative(-2.732f, -1.577f)
                lineToRelative(-2.334f, 1.348f)
                lineToRelative(3.899f, 2.251f)
                arcToRelative(3.81f, 3.81f, 0.0f, false, false, 3.845f, 0.0f)
                arcTo(3.81f, 3.81f, 0.0f, false, false, 24.0f, 17.953f)
                lineTo(24.0f, 6.047f)
                arcToRelative(3.81f, 3.81f, 0.0f, false, false, -1.922f, -3.33f)
                arcToRelative(3.83f, 3.83f, 0.0f, false, false, -1.923f, -0.52f)
                curveToRelative(-0.66f, 0.0f, -1.32f, 0.173f, -1.922f, 0.52f)
                lineTo(7.923f, 8.67f)
                arcTo(3.81f, 3.81f, 0.0f, false, false, 6.0f, 12.0f)
                curveToRelative(0.0f, 1.17f, 0.51f, 2.234f, 1.386f, 2.956f)
                close()
                moveTo(16.614f, 9.044f)
                lineTo(14.335f, 10.36f)
                lineTo(14.911f, 10.693f)
                curveToRelative(0.682f, 0.393f, 0.755f, 1.046f, 0.755f, 1.308f)
                curveToRelative(0.0f, 0.263f, -0.073f, 0.915f, -0.755f, 1.308f)
                lineToRelative(-10.31f, 5.954f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, true, -1.51f, 0.0f)
                arcToRelative(1.48f, 1.48f, 0.0f, false, true, -0.755f, -1.308f)
                lineTo(2.336f, 6.047f)
                curveToRelative(0.0f, -0.788f, 0.527f, -1.178f, 0.754f, -1.308f)
                reflectiveCurveToRelative(0.828f, -0.393f, 1.51f, 0.0f)
                lineToRelative(2.732f, 1.577f)
                lineToRelative(2.334f, -1.348f)
                lineToRelative(-3.899f, -2.251f)
                arcToRelative(3.81f, 3.81f, 0.0f, false, false, -3.845f, 0.0f)
                arcTo(3.81f, 3.81f, 0.0f, false, false, 0.0f, 6.047f)
                verticalLineToRelative(11.906f)
                curveToRelative(0.0f, 1.39f, 0.72f, 2.635f, 1.922f, 3.33f)
                arcToRelative(3.83f, 3.83f, 0.0f, false, false, 1.923f, 0.52f)
                curveToRelative(0.66f, 0.0f, 1.32f, -0.173f, 1.922f, -0.52f)
                lineToRelative(10.31f, -5.953f)
                arcTo(3.81f, 3.81f, 0.0f, false, false, 18.0f, 12.0f)
                curveToRelative(0.0f, -1.17f, -0.51f, -2.234f, -1.386f, -2.956f)
            }
        }
        .build()
        return _perforce!!
    }

private var _perforce: ImageVector? = null
