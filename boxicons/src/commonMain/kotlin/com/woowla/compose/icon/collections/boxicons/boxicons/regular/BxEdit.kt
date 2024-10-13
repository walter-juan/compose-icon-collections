package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxEdit: ImageVector
    get() {
        if (_bxEdit != null) {
            return _bxEdit!!
        }
        _bxEdit = Builder(name = "BxEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 17.013f)
                lineToRelative(4.413f, -0.015f)
                lineToRelative(9.632f, -9.54f)
                curveToRelative(0.378f, -0.378f, 0.586f, -0.88f, 0.586f, -1.414f)
                reflectiveCurveToRelative(-0.208f, -1.036f, -0.586f, -1.414f)
                lineToRelative(-1.586f, -1.586f)
                curveToRelative(-0.756f, -0.756f, -2.075f, -0.752f, -2.825f, -0.003f)
                lineTo(7.0f, 12.583f)
                verticalLineToRelative(4.43f)
                close()
                moveTo(18.045f, 4.458f)
                lineToRelative(1.589f, 1.583f)
                lineToRelative(-1.597f, 1.582f)
                lineToRelative(-1.586f, -1.585f)
                lineToRelative(1.594f, -1.58f)
                close()
                moveTo(9.0f, 13.417f)
                lineToRelative(6.03f, -5.973f)
                lineToRelative(1.586f, 1.586f)
                lineToRelative(-6.029f, 5.971f)
                lineTo(9.0f, 15.006f)
                verticalLineToRelative(-1.589f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-8.668f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.158f)
                curveToRelative(-0.026f, 0.0f, -0.053f, 0.01f, -0.079f, 0.01f)
                curveToRelative(-0.033f, 0.0f, -0.066f, -0.009f, -0.1f, -0.01f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(6.847f)
                lineToRelative(2.0f, -2.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxEdit!!
    }

private var _bxEdit: ImageVector? = null
