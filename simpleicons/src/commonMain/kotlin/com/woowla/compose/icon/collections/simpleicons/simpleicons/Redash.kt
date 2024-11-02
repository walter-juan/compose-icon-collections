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

public val Simpleicons.Redash: ImageVector
    get() {
        if (_redash != null) {
            return _redash!!
        }
        _redash = Builder(name = "Redash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(6.775f, 0.0f, 2.546f, 4.238f, 2.546f, 9.455f)
                curveToRelative(0.0f, 4.971f, 3.842f, 9.05f, 8.727f, 9.423f)
                verticalLineTo(24.0f)
                curveToRelative(3.405f, -3.49f, 5.837f, -6.072f, 7.307f, -7.756f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 1.532f, -1.93f)
                lineToRelative(0.005f, -0.006f)
                quadToRelative(0.003f, -0.007f, 0.007f, -0.014f)
                arcToRelative(9.4f, 9.4f, 0.0f, false, false, 1.33f, -4.84f)
                curveTo(21.455f, 4.238f, 17.226f, 0.0f, 12.0f, 0.0f)
                moveToRelative(3.821f, 5.818f)
                horizontalLineToRelative(1.385f)
                curveToRelative(0.337f, 0.001f, 0.611f, 0.25f, 0.612f, 0.558f)
                verticalLineToRelative(6.157f)
                curveToRelative(-0.001f, 0.308f, -0.275f, 0.557f, -0.612f, 0.558f)
                horizontalLineTo(15.82f)
                curveToRelative(-0.337f, -0.001f, -0.611f, -0.25f, -0.612f, -0.558f)
                verticalLineTo(6.376f)
                curveToRelative(0.0f, -0.307f, 0.275f, -0.557f, 0.612f, -0.558f)
                moveTo(9.297f, 7.921f)
                horizontalLineToRelative(1.386f)
                curveToRelative(0.338f, 0.0f, 0.611f, 0.25f, 0.613f, 0.558f)
                verticalLineToRelative(4.054f)
                curveToRelative(-0.002f, 0.308f, -0.275f, 0.557f, -0.613f, 0.558f)
                horizontalLineTo(9.297f)
                curveToRelative(-0.337f, -0.001f, -0.61f, -0.25f, -0.61f, -0.558f)
                verticalLineTo(8.479f)
                curveToRelative(0.0f, -0.308f, 0.273f, -0.558f, 0.61f, -0.558f)
                moveToRelative(3.222f, 1.534f)
                horizontalLineToRelative(1.396f)
                curveToRelative(0.337f, 0.0f, 0.61f, 0.25f, 0.61f, 0.558f)
                verticalLineToRelative(2.52f)
                curveToRelative(0.0f, 0.308f, -0.273f, 0.557f, -0.61f, 0.558f)
                horizontalLineToRelative(-1.396f)
                curveToRelative(-0.338f, -0.001f, -0.612f, -0.25f, -0.613f, -0.558f)
                verticalLineToRelative(-2.52f)
                curveToRelative(0.001f, -0.308f, 0.275f, -0.558f, 0.613f, -0.558f)
                moveTo(6.067f, 10.71f)
                horizontalLineToRelative(1.396f)
                curveToRelative(0.337f, 0.001f, 0.61f, 0.25f, 0.61f, 0.559f)
                verticalLineToRelative(1.264f)
                curveToRelative(0.0f, 0.308f, -0.273f, 0.557f, -0.61f, 0.558f)
                horizontalLineTo(6.067f)
                curveToRelative(-0.338f, -0.001f, -0.611f, -0.25f, -0.612f, -0.558f)
                verticalLineToRelative(-1.264f)
                curveToRelative(0.0f, -0.308f, 0.274f, -0.558f, 0.612f, -0.559f)
            }
        }
        .build()
        return _redash!!
    }

private var _redash: ImageVector? = null
