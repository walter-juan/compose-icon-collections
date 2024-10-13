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

public val RegularGroup.BxMicrophone: ImageVector
    get() {
        if (_bxMicrophone != null) {
            return _bxMicrophone!!
        }
        _bxMicrophone = Builder(name = "BxMicrophone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                lineTo(16.0f, 6.0f)
                curveToRelative(0.0f, -2.217f, -1.785f, -4.021f, -3.979f, -4.021f)
                arcToRelative(0.933f, 0.933f, 0.0f, false, false, -0.209f, 0.025f)
                arcTo(4.006f, 4.006f, 0.0f, false, false, 8.0f, 6.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                close()
                moveTo(10.0f, 12.0f)
                lineTo(10.0f, 6.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, false, 0.163f, -0.015f)
                curveTo(13.188f, 4.06f, 14.0f, 4.935f, 14.0f, 6.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                horizontalLineTo(4.0f)
                curveToRelative(0.0f, 4.072f, 3.061f, 7.436f, 7.0f, 7.931f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.069f)
                curveToRelative(3.939f, -0.495f, 7.0f, -3.858f, 7.0f, -7.931f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _bxMicrophone!!
    }

private var _bxMicrophone: ImageVector? = null
