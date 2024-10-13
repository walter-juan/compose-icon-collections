package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxVial: ImageVector
    get() {
        if (_bxVial != null) {
            return _bxVial!!
        }
        _bxVial = Builder(name = "BxVial", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.95f, 3.564f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(-9.193f, 9.193f)
                curveTo(2.521f, 14.408f, 2.0f, 15.664f, 2.0f, 17.0f)
                reflectiveCurveToRelative(0.521f, 2.592f, 1.465f, 3.535f)
                curveTo(4.408f, 21.479f, 5.664f, 22.0f, 7.0f, 22.0f)
                reflectiveCurveToRelative(2.592f, -0.521f, 3.535f, -1.465f)
                lineToRelative(9.193f, -9.193f)
                lineToRelative(0.707f, 0.708f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-8.485f, -8.486f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(9.121f, 19.121f)
                curveToRelative(-1.133f, 1.133f, -3.109f, 1.133f, -4.242f, 0.0f)
                curveTo(4.313f, 18.555f, 4.0f, 17.802f, 4.0f, 17.0f)
                reflectiveCurveToRelative(0.313f, -1.555f, 0.879f, -2.121f)
                lineTo(5.758f, 14.0f)
                horizontalLineToRelative(8.484f)
                lineToRelative(-5.121f, 5.121f)
                close()
                moveTo(16.242f, 12.0f)
                horizontalLineTo(7.758f)
                lineToRelative(6.314f, -6.314f)
                lineToRelative(4.242f, 4.242f)
                lineTo(16.242f, 12.0f)
                close()
            }
        }
        .build()
        return _bxVial!!
    }

private var _bxVial: ImageVector? = null
