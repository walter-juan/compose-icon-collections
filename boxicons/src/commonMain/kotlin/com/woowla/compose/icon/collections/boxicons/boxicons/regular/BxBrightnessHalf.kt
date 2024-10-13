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

public val RegularGroup.BxBrightnessHalf: ImageVector
    get() {
        if (_bxBrightnessHalf != null) {
            return _bxBrightnessHalf!!
        }
        _bxBrightnessHalf = Builder(name = "BxBrightnessHalf", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.707f, 11.293f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(19.0f, 8.586f)
                lineTo(19.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-2.586f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(8.586f, 5.0f)
                lineTo(6.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, 1.414f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(0.707f, 0.707f)
                lineTo(5.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(2.586f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(0.707f, -0.707f)
                lineTo(18.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-2.586f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, -1.414f)
                close()
                moveTo(17.293f, 14.293f)
                lineTo(17.0f, 14.586f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(-2.414f)
                lineToRelative(-0.293f, 0.293f)
                lineToRelative(-1.0f, 1.0f)
                lineTo(12.0f, 19.586f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(-1.0f, -1.0f)
                lineTo(9.414f, 17.0f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(-2.414f)
                lineToRelative(-0.293f, -0.293f)
                lineToRelative(-1.0f, -1.0f)
                lineTo(4.414f, 12.0f)
                lineToRelative(1.293f, -1.293f)
                lineToRelative(1.0f, -1.0f)
                lineTo(7.0f, 9.414f)
                lineTo(7.0f, 7.0f)
                horizontalLineToRelative(2.414f)
                lineToRelative(0.293f, -0.293f)
                lineToRelative(1.0f, -1.0f)
                lineTo(12.0f, 4.414f)
                lineToRelative(1.293f, 1.293f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(0.293f, 0.293f)
                lineTo(17.0f, 7.0f)
                verticalLineToRelative(2.414f)
                lineToRelative(0.293f, 0.293f)
                lineToRelative(1.0f, 1.0f)
                lineTo(19.586f, 12.0f)
                lineToRelative(-1.293f, 1.293f)
                lineToRelative(-1.0f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _bxBrightnessHalf!!
    }

private var _bxBrightnessHalf: ImageVector? = null
