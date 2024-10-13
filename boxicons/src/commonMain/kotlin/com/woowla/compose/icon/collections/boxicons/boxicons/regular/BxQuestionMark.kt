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

public val RegularGroup.BxQuestionMark: ImageVector
    get() {
        if (_bxQuestionMark != null) {
            return _bxQuestionMark!!
        }
        _bxQuestionMark = Builder(name = "BxQuestionMark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(9.243f, 4.0f, 7.0f, 6.243f, 7.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.069f, -0.454f, 1.465f, -1.481f, 2.255f)
                curveToRelative(-0.382f, 0.294f, -0.813f, 0.626f, -1.226f, 1.038f)
                curveTo(10.981f, 13.604f, 10.995f, 14.897f, 11.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.009f)
                curveToRelative(0.0f, -0.024f, 0.023f, -0.601f, 0.707f, -1.284f)
                curveToRelative(0.32f, -0.32f, 0.682f, -0.598f, 1.031f, -0.867f)
                curveTo(15.798f, 12.024f, 17.0f, 11.1f, 17.0f, 9.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(11.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _bxQuestionMark!!
    }

private var _bxQuestionMark: ImageVector? = null
