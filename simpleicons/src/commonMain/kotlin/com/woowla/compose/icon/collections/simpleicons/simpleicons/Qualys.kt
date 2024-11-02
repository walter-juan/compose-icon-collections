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

public val Simpleicons.Qualys: ImageVector
    get() {
        if (_qualys != null) {
            return _qualys!!
        }
        _qualys = Builder(name = "Qualys", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.999f, 0.0f)
                curveTo(5.435f, 0.0f, 2.138f, 3.512f, 2.138f, 3.512f)
                reflectiveCurveToRelative(-0.377f, 2.599f, -0.137f, 7.833f)
                curveTo(2.365f, 19.251f, 11.999f, 24.0f, 12.0f, 24.0f)
                curveToRelative(0.001f, -0.001f, 9.635f, -4.749f, 9.998f, -12.655f)
                curveToRelative(0.241f, -5.234f, -0.136f, -7.833f, -0.136f, -7.833f)
                reflectiveCurveTo(18.562f, 0.0f, 11.999f, 0.0f)
                close()
                moveTo(11.32f, 2.919f)
                arcToRelative(7.366f, 7.366f, 0.0f, false, true, 8.045f, 7.334f)
                arcToRelative(7.116f, 7.116f, 0.0f, false, true, -2.771f, 5.634f)
                curveToRelative(-1.179f, -0.108f, -2.41f, -0.442f, -2.968f, -0.761f)
                curveToRelative(1.438f, -0.918f, 3.304f, -2.703f, 3.304f, -4.874f)
                arcToRelative(4.936f, 4.936f, 0.0f, false, false, -4.931f, -4.931f)
                curveToRelative(-2.717f, 0.0f, -4.927f, 2.274f, -4.927f, 5.07f)
                curveToRelative(0.0f, 2.332f, 1.235f, 4.162f, 3.672f, 5.44f)
                curveToRelative(1.594f, 0.836f, 3.972f, 1.449f, 6.485f, 1.772f)
                curveToRelative(-0.418f, 0.623f, -1.533f, 1.686f, -2.185f, 2.046f)
                curveToRelative(-3.009f, -0.493f, -5.651f, -1.535f, -7.458f, -3.096f)
                curveToRelative(-1.932f, -1.67f, -2.954f, -3.849f, -2.954f, -6.302f)
                arcToRelative(7.366f, 7.366f, 0.0f, false, true, 6.686f, -7.334f)
                close()
            }
        }
        .build()
        return _qualys!!
    }

private var _qualys: ImageVector? = null
