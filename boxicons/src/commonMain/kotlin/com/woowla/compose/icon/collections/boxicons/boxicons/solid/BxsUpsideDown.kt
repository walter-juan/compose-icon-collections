package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsUpsideDown: ImageVector
    get() {
        if (_bxsUpsideDown != null) {
            return _bxsUpsideDown!!
        }
        _bxsUpsideDown = Builder(name = "BxsUpsideDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.507f, 15.0f)
                arcToRelative(1.494f, 1.494f, 0.0f, true, true, 0.001f, -2.987f)
                arcTo(1.494f, 1.494f, 0.0f, false, true, 8.507f, 15.0f)
                close()
                moveTo(12.808f, 8.081f)
                arcToRelative(4.108f, 4.108f, 0.0f, false, false, -1.616f, 0.0f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, false, -0.751f, 0.233f)
                curveToRelative(-0.234f, 0.1f, -0.463f, 0.224f, -0.678f, 0.368f)
                arcToRelative(4.077f, 4.077f, 0.0f, false, false, -1.08f, 1.082f)
                lineTo(7.024f, 8.646f)
                arcToRelative(6.026f, 6.026f, 0.0f, false, true, 2.639f, -2.175f)
                arcToRelative(6.097f, 6.097f, 0.0f, false, true, 1.128f, -0.35f)
                arcToRelative(6.061f, 6.061f, 0.0f, false, true, 2.415f, 0.0f)
                arcToRelative(5.919f, 5.919f, 0.0f, false, true, 2.148f, 0.903f)
                arcToRelative(6.078f, 6.078f, 0.0f, false, true, 1.621f, 1.622f)
                lineToRelative(-1.658f, 1.117f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, false, -0.488f, -0.59f)
                arcToRelative(3.988f, 3.988f, 0.0f, false, false, -2.021f, -1.092f)
                close()
                moveTo(15.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 15.0f)
                close()
            }
        }
        .build()
        return _bxsUpsideDown!!
    }

private var _bxsUpsideDown: ImageVector? = null
