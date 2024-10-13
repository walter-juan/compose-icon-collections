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

public val SolidGroup.BxsHappy: ImageVector
    get() {
        if (_bxsHappy != null) {
            return _bxsHappy!!
        }
        _bxsHappy = Builder(name = "BxsHappy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(15.493f, 9.0f)
                arcToRelative(1.494f, 1.494f, 0.0f, true, true, -0.001f, 2.987f)
                arcTo(1.494f, 1.494f, 0.0f, false, true, 15.493f, 9.0f)
                close()
                moveTo(8.5f, 9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -0.001f, 3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 9.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-4.0f, 0.0f, -5.0f, -4.0f, -5.0f, -4.0f)
                horizontalLineToRelative(10.0f)
                reflectiveCurveToRelative(-1.0f, 4.0f, -5.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bxsHappy!!
    }

private var _bxsHappy: ImageVector? = null
