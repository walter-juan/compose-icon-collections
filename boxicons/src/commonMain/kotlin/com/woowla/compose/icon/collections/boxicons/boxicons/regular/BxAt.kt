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

public val RegularGroup.BxAt: ImageVector
    get() {
        if (_bxAt != null) {
            return _bxAt!!
        }
        _bxAt = Builder(name = "BxAt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(1.466f, 0.0f, 2.961f, -0.371f, 4.442f, -1.104f)
                lineToRelative(-0.885f, -1.793f)
                curveTo(14.353f, 19.698f, 13.156f, 20.0f, 12.0f, 20.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.589f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.692f, -0.313f, 2.0f, -1.5f, 2.0f)
                curveToRelative(-1.396f, 0.0f, -1.494f, -1.819f, -1.5f, -2.0f)
                lineTo(17.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.025f)
                arcTo(4.954f, 4.954f, 0.0f, false, false, 12.0f, 7.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                curveToRelative(1.45f, 0.0f, 2.748f, -0.631f, 3.662f, -1.621f)
                curveToRelative(0.524f, 0.89f, 1.408f, 1.621f, 2.838f, 1.621f)
                curveToRelative(2.273f, 0.0f, 3.5f, -2.061f, 3.5f, -4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _bxAt!!
    }

private var _bxAt: ImageVector? = null
