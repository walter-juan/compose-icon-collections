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

public val SolidGroup.BxsSleepy: ImageVector
    get() {
        if (_bxsSleepy != null) {
            return _bxsSleepy!!
        }
        _bxsSleepy = Builder(name = "BxsSleepy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.0f, 11.01f)
                lineTo(6.0f, 10.99f)
                curveTo(6.017f, 9.386f, 7.095f, 7.0f, 10.0f, 7.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-1.924f, 0.0f, -1.998f, 1.805f, -2.0f, 2.01f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.119f, -3.0f, -2.5f)
                reflectiveCurveToRelative(1.343f, -2.5f, 3.0f, -2.5f)
                reflectiveCurveToRelative(3.0f, 1.119f, 3.0f, 2.5f)
                reflectiveCurveToRelative(-1.343f, 2.5f, -3.0f, 2.5f)
                close()
                moveTo(17.0f, 11.0f)
                lineTo(16.0f, 11.008f)
                curveTo(15.992f, 10.536f, 15.826f, 9.0f, 14.0f, 9.0f)
                lineTo(14.0f, 7.0f)
                curveToRelative(2.935f, 0.0f, 4.0f, 2.393f, 4.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _bxsSleepy!!
    }

private var _bxsSleepy: ImageVector? = null
