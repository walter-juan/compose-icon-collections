package com.woowla.compose.icon.collections.devicons.devicons.nextjs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.NextjsGroup

public val NextjsGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(28.66f, 0.0f, 0.0f, 28.66f, 0.0f, 64.0f)
                reflectiveCurveToRelative(28.66f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(63.99f, 63.99f, 0.0f, false, false, 35.51f, -10.84f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(0.37f, -0.28f)
                lineToRelative(-0.57f, -0.81f)
                lineToRelative(-52.68f, -68.05f)
                verticalLineToRelative(40.88f)
                horizontalLineToRelative(-7.55f)
                lineTo(39.1f, 39.1f)
                horizontalLineToRelative(9.94f)
                lineToRelative(56.23f, 72.43f)
                lineToRelative(0.64f, 0.82f)
                lineToRelative(0.37f, -0.34f)
                lineToRelative(0.01f, -0.01f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 128.0f, 64.0f)
                curveToRelative(0.0f, -35.34f, -28.66f, -64.0f, -64.0f, -64.0f)
                close()
                moveTo(64.0f, 0.99f)
                curveToRelative(34.8f, 0.0f, 63.01f, 28.2f, 63.01f, 63.01f)
                arcToRelative(63.0f, 63.0f, 0.0f, false, true, -20.98f, 46.88f)
                lineToRelative(-56.5f, -72.78f)
                lineTo(38.1f, 38.1f)
                verticalLineToRelative(51.77f)
                horizontalLineToRelative(9.54f)
                verticalLineToRelative(-38.97f)
                lineToRelative(50.86f, 65.71f)
                arcTo(63.0f, 63.0f, 0.0f, false, true, 64.0f, 127.01f)
                curveTo(29.2f, 127.01f, 0.99f, 98.81f, 0.99f, 64.0f)
                reflectiveCurveTo(29.2f, 0.99f, 64.0f, 0.99f)
                close()
                moveTo(81.14f, 38.1f)
                verticalLineToRelative(37.94f)
                lineToRelative(9.46f, 12.42f)
                lineTo(90.6f, 38.1f)
                close()
                moveTo(82.13f, 39.1f)
                horizontalLineToRelative(7.48f)
                verticalLineToRelative(46.43f)
                lineToRelative(-7.48f, -9.81f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
