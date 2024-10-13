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

public val SolidGroup.BxsAdjust: ImageVector
    get() {
        if (_bxsAdjust != null) {
            return _bxsAdjust!!
        }
        _bxsAdjust = Builder(name = "BxsAdjust", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.579f, 2.0f, 2.0f, 6.58f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.579f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.58f, 10.0f, -10.0f)
                reflectiveCurveTo(17.421f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 19.0f)
                lineTo(12.0f, 5.0f)
                curveToRelative(3.829f, 0.0f, 7.0f, 3.169f, 7.0f, 7.0f)
                curveToRelative(0.0f, 3.828f, -3.171f, 7.0f, -7.0f, 7.0f)
                close()
            }
        }
        .build()
        return _bxsAdjust!!
    }

private var _bxsAdjust: ImageVector? = null
