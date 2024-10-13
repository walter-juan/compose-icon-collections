package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlDiscourse: ImageVector
    get() {
        if (_bxlDiscourse != null) {
            return _bxlDiscourse!!
        }
        _bxlDiscourse = Builder(name = "BxlDiscourse", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.077f, 3.0f)
                curveTo(7.149f, 3.0f, 3.0f, 6.96f, 3.0f, 11.843f)
                lineTo(3.0f, 21.0f)
                lineToRelative(9.075f, -0.01f)
                curveToRelative(4.928f, 0.0f, 8.925f, -4.11f, 8.925f, -8.993f)
                curveTo(21.0f, 7.113f, 17.0f, 3.0f, 12.077f, 3.0f)
                close()
                moveTo(15.997f, 15.859f)
                arcToRelative(5.568f, 5.568f, 0.0f, false, true, -6.102f, 1.043f)
                lineToRelative(-3.595f, 0.805f)
                lineToRelative(1.001f, -3.192f)
                arcToRelative(5.435f, 5.435f, 0.0f, false, true, 0.11f, -5.415f)
                arcToRelative(5.55f, 5.55f, 0.0f, false, true, 4.753f, -2.678f)
                verticalLineToRelative(0.001f)
                horizontalLineToRelative(0.006f)
                arcToRelative(5.533f, 5.533f, 0.0f, false, true, 5.131f, 3.438f)
                arcToRelative(5.442f, 5.442f, 0.0f, false, true, -1.304f, 5.998f)
                close()
            }
        }
        .build()
        return _bxlDiscourse!!
    }

private var _bxlDiscourse: ImageVector? = null
