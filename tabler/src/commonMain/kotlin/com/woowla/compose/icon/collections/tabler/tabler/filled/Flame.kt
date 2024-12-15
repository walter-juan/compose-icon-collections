package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                curveToRelative(0.0f, -0.88f, 1.056f, -1.331f, 1.692f, -0.722f)
                curveToRelative(1.958f, 1.876f, 3.096f, 5.995f, 1.75f, 9.12f)
                lineToRelative(-0.08f, 0.174f)
                lineToRelative(0.012f, 0.003f)
                curveToRelative(0.625f, 0.133f, 1.203f, -0.43f, 2.303f, -2.173f)
                lineToRelative(0.14f, -0.224f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.582f, -0.153f)
                curveToRelative(1.334f, 1.435f, 2.601f, 4.377f, 2.601f, 6.27f)
                curveToRelative(0.0f, 4.265f, -3.591f, 7.705f, -8.0f, 7.705f)
                reflectiveCurveToRelative(-8.0f, -3.44f, -8.0f, -7.706f)
                curveToRelative(0.0f, -2.252f, 1.022f, -4.716f, 2.632f, -6.301f)
                lineToRelative(0.605f, -0.589f)
                curveToRelative(0.241f, -0.236f, 0.434f, -0.43f, 0.618f, -0.624f)
                curveToRelative(1.43f, -1.512f, 2.145f, -2.924f, 2.145f, -4.78f)
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
