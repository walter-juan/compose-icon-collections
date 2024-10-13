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

public val SolidGroup.BxsBuoy: ImageVector
    get() {
        if (_bxsBuoy != null) {
            return _bxsBuoy!!
        }
        _bxsBuoy = Builder(name = "BxsBuoy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(19.736f, 10.0f)
                horizontalLineToRelative(-3.16f)
                arcTo(5.02f, 5.02f, 0.0f, false, false, 14.0f, 7.424f)
                lineTo(14.0f, 4.263f)
                arcTo(8.015f, 8.015f, 0.0f, false, true, 19.736f, 10.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(10.0f, 4.263f)
                verticalLineToRelative(3.161f)
                arcTo(5.02f, 5.02f, 0.0f, false, false, 7.424f, 10.0f)
                horizontalLineToRelative(-3.16f)
                arcTo(8.015f, 8.015f, 0.0f, false, true, 10.0f, 4.263f)
                close()
                moveTo(4.264f, 14.0f)
                horizontalLineToRelative(3.16f)
                arcTo(5.02f, 5.02f, 0.0f, false, false, 10.0f, 16.576f)
                verticalLineToRelative(3.161f)
                arcTo(8.015f, 8.015f, 0.0f, false, true, 4.264f, 14.0f)
                close()
                moveTo(14.0f, 19.737f)
                verticalLineToRelative(-3.161f)
                arcTo(5.02f, 5.02f, 0.0f, false, false, 16.576f, 14.0f)
                horizontalLineToRelative(3.16f)
                arcTo(8.015f, 8.015f, 0.0f, false, true, 14.0f, 19.737f)
                close()
            }
        }
        .build()
        return _bxsBuoy!!
    }

private var _bxsBuoy: ImageVector? = null
