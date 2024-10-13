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

public val SolidGroup.BxsMobileVibration: ImageVector
    get() {
        if (_bxsMobileVibration != null) {
            return _bxsMobileVibration!!
        }
        _bxsMobileVibration = Builder(name = "BxsMobileVibration", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.535f, 2.808f)
                arcToRelative(2.003f, 2.003f, 0.0f, false, false, -2.828f, 0.0f)
                lineToRelative(-9.899f, 9.899f)
                arcToRelative(2.001f, 2.001f, 0.0f, false, false, 0.0f, 2.828f)
                lineToRelative(5.657f, 5.657f)
                curveToRelative(0.39f, 0.39f, 0.902f, 0.585f, 1.414f, 0.585f)
                reflectiveCurveToRelative(1.024f, -0.195f, 1.414f, -0.585f)
                lineToRelative(9.899f, -9.899f)
                curveToRelative(0.78f, -0.779f, 0.78f, -2.049f, 0.0f, -2.828f)
                lineToRelative(-5.657f, -5.657f)
                close()
                moveTo(8.707f, 16.707f)
                arcToRelative(0.999f, 0.999f, 0.0f, true, true, -1.414f, -1.414f)
                arcToRelative(0.999f, 0.999f, 0.0f, true, true, 1.414f, 1.414f)
                close()
                moveTo(15.707f, 21.707f)
                lineTo(14.293f, 20.293f)
                lineTo(20.293f, 14.293f)
                lineTo(21.707f, 15.708f)
                close()
                moveTo(8.293f, 2.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(-1.414f, -1.415f)
                close()
            }
        }
        .build()
        return _bxsMobileVibration!!
    }

private var _bxsMobileVibration: ImageVector? = null
