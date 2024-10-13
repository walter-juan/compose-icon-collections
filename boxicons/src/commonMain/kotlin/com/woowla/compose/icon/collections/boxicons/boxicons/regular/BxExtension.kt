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

public val RegularGroup.BxExtension: ImageVector
    get() {
        if (_bxExtension != null) {
            return _bxExtension!!
        }
        _bxExtension = Builder(name = "BxExtension", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                lineTo(19.0f, 7.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveTo(8.0f, 3.346f, 8.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(3.881f)
                lineToRelative(0.659f, 0.239f)
                curveTo(4.461f, 11.41f, 5.0f, 12.166f, 5.0f, 13.0f)
                reflectiveCurveToRelative(-0.539f, 1.59f, -1.341f, 1.88f)
                lineTo(3.0f, 15.119f)
                lineTo(3.0f, 19.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.881f)
                lineToRelative(0.239f, -0.659f)
                curveTo(9.41f, 19.539f, 10.166f, 19.0f, 11.0f, 19.0f)
                reflectiveCurveToRelative(1.59f, 0.539f, 1.88f, 1.341f)
                lineToRelative(0.239f, 0.659f)
                lineTo(17.0f, 21.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(19.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.003f, 5.0f)
                horizontalLineToRelative(-2.545f)
                curveToRelative(-0.711f, -1.22f, -2.022f, -2.0f, -3.452f, -2.0f)
                reflectiveCurveToRelative(-2.741f, 0.78f, -3.452f, 2.0f)
                lineTo(5.0f, 19.0f)
                verticalLineToRelative(-2.548f)
                curveTo(6.22f, 15.741f, 7.0f, 14.43f, 7.0f, 13.0f)
                reflectiveCurveToRelative(-0.78f, -2.741f, -2.0f, -3.452f)
                lineTo(5.0f, 7.0f)
                horizontalLineToRelative(5.0f)
                lineTo(10.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxExtension!!
    }

private var _bxExtension: ImageVector? = null
