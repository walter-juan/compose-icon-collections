package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxRun: ImageVector
    get() {
        if (_bxRun != null) {
            return _bxRun!!
        }
        _bxRun = Builder(name = "BxRun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.777f, 10.969f)
                arcToRelative(2.007f, 2.007f, 0.0f, false, false, 2.148f, 0.83f)
                lineToRelative(3.316f, -0.829f)
                lineToRelative(-0.483f, -1.94f)
                lineToRelative(-3.316f, 0.829f)
                lineToRelative(-1.379f, -2.067f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, false, -1.272f, -0.854f)
                lineToRelative(-3.846f, -0.77f)
                arcToRelative(1.998f, 1.998f, 0.0f, false, false, -2.181f, 1.067f)
                lineToRelative(-1.658f, 3.316f)
                lineToRelative(1.789f, 0.895f)
                lineToRelative(1.658f, -3.317f)
                lineToRelative(1.967f, 0.394f)
                lineTo(7.434f, 17.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.434f)
                curveToRelative(0.698f, 0.0f, 1.355f, -0.372f, 1.715f, -0.971f)
                lineToRelative(1.918f, -3.196f)
                lineToRelative(5.169f, 1.034f)
                lineToRelative(1.816f, 5.449f)
                lineToRelative(1.896f, -0.633f)
                lineToRelative(-1.815f, -5.448f)
                arcToRelative(2.007f, 2.007f, 0.0f, false, false, -1.506f, -1.33f)
                lineToRelative(-3.039f, -0.607f)
                lineToRelative(1.772f, -2.954f)
                lineToRelative(0.417f, 0.625f)
                close()
            }
        }
        .build()
        return _bxRun!!
    }

private var _bxRun: ImageVector? = null
