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

public val Simpleicons.Vueuse: ImageVector
    get() {
        if (_vueuse != null) {
            return _vueuse!!
        }
        _vueuse = Builder(name = "Vueuse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.876f, 0.001f)
                verticalLineToRelative(12.873f)
                curveTo(0.876f, 19.018f, 5.856f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(11.124f, -4.982f, 11.124f, -11.126f)
                lineTo(23.124f, 0.0f)
                horizontalLineToRelative(-9.218f)
                verticalLineToRelative(12.874f)
                curveToRelative(0.0f, 2.543f, -3.812f, 2.543f, -3.812f, 0.0f)
                lineTo(10.094f, 0.0f)
                close()
                moveTo(5.485f, 1.002f)
                horizontalLineToRelative(3.608f)
                verticalLineToRelative(11.872f)
                curveTo(9.089f, 14.555f, 10.354f, 15.79f, 12.0f, 15.79f)
                reflectiveCurveToRelative(2.911f, -1.236f, 2.907f, -2.916f)
                lineTo(14.907f, 1.002f)
                horizontalLineToRelative(3.608f)
                verticalLineToRelative(11.872f)
                arcToRelative(6.515f, 6.515f, 0.0f, false, true, -13.03f, 0.0f)
                close()
            }
        }
        .build()
        return _vueuse!!
    }

private var _vueuse: ImageVector? = null
