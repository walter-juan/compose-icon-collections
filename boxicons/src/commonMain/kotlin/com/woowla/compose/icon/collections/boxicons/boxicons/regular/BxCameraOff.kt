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

public val RegularGroup.BxCameraOff: ImageVector
    get() {
        if (_bxCameraOff != null) {
            return _bxCameraOff!!
        }
        _bxCameraOff = Builder(name = "BxCameraOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.014f, 12.135f)
                curveToRelative(0.074f, 2.062f, 1.789f, 3.777f, 3.851f, 3.851f)
                lineToRelative(-3.851f, -3.851f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(11.879f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(4.0f, 18.0f)
                lineTo(4.0f, 8.121f)
                lineTo(2.144f, 6.265f)
                arcTo(1.976f, 1.976f, 0.0f, false, false, 2.0f, 7.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(20.0f, 5.0f)
                horizontalLineToRelative(-2.586f)
                lineToRelative(-2.707f, -2.707f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 14.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, -0.707f, 0.293f)
                lineTo(6.586f, 5.0f)
                horizontalLineToRelative(-0.172f)
                lineTo(3.707f, 2.293f)
                lineTo(2.293f, 3.707f)
                lineToRelative(18.0f, 18.0f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-0.626f, -0.626f)
                arcTo(1.98f, 1.98f, 0.0f, false, false, 22.0f, 18.0f)
                lineTo(22.0f, 7.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(13.919f, 12.505f)
                lineTo(11.495f, 10.08f)
                curveToRelative(0.163f, -0.046f, 0.331f, -0.08f, 0.505f, -0.08f)
                curveToRelative(1.065f, 0.0f, 2.0f, 0.935f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.174f, -0.033f, 0.342f, -0.081f, 0.505f)
                close()
                moveTo(15.421f, 14.006f)
                arcTo(3.881f, 3.881f, 0.0f, false, false, 16.0f, 12.0f)
                curveToRelative(0.0f, -2.168f, -1.832f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-0.729f, 0.0f, -1.412f, 0.22f, -2.007f, 0.579f)
                lineTo(7.914f, 6.5f)
                lineToRelative(2.5f, -2.5f)
                horizontalLineToRelative(3.172f)
                lineToRelative(2.707f, 2.707f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 17.0f, 7.0f)
                lineToRelative(3.0f, -0.001f)
                lineTo(20.0f, 18.0f)
                horizontalLineToRelative(-0.586f)
                lineToRelative(-3.993f, -3.994f)
                close()
            }
        }
        .build()
        return _bxCameraOff!!
    }

private var _bxCameraOff: ImageVector? = null
