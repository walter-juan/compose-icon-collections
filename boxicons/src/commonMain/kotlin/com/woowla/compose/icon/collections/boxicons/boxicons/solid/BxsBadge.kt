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

public val SolidGroup.BxsBadge: ImageVector
    get() {
        if (_bxsBadge != null) {
            return _bxsBadge!!
        }
        _bxsBadge = Builder(name = "BxsBadge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.965f, 8.521f)
                curveTo(19.988f, 8.347f, 20.0f, 8.173f, 20.0f, 8.0f)
                curveToRelative(0.0f, -2.379f, -2.143f, -4.288f, -4.521f, -3.965f)
                curveTo(14.786f, 2.802f, 13.466f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(-2.786f, 0.802f, -3.479f, 2.035f)
                curveTo(6.138f, 3.712f, 4.0f, 5.621f, 4.0f, 8.0f)
                curveToRelative(0.0f, 0.173f, 0.012f, 0.347f, 0.035f, 0.521f)
                curveTo(2.802f, 9.215f, 2.0f, 10.535f, 2.0f, 12.0f)
                reflectiveCurveToRelative(0.802f, 2.785f, 2.035f, 3.479f)
                arcTo(3.976f, 3.976f, 0.0f, false, false, 4.0f, 16.0f)
                curveToRelative(0.0f, 2.379f, 2.138f, 4.283f, 4.521f, 3.965f)
                curveTo(9.214f, 21.198f, 10.534f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(2.786f, -0.802f, 3.479f, -2.035f)
                curveTo(17.857f, 20.283f, 20.0f, 18.379f, 20.0f, 16.0f)
                curveToRelative(0.0f, -0.173f, -0.012f, -0.347f, -0.035f, -0.521f)
                curveTo(21.198f, 14.785f, 22.0f, 13.465f, 22.0f, 12.0f)
                reflectiveCurveToRelative(-0.802f, -2.785f, -2.035f, -3.479f)
                close()
            }
        }
        .build()
        return _bxsBadge!!
    }

private var _bxsBadge: ImageVector? = null
