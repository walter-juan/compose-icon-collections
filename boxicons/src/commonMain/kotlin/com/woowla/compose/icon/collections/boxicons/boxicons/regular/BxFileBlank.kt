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

public val RegularGroup.BxFileBlank: ImageVector
    get() {
        if (_bxFileBlank != null) {
            return _bxFileBlank!!
        }
        _bxFileBlank = Builder(name = "BxFileBlank", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.937f, 8.68f)
                curveToRelative(-0.011f, -0.032f, -0.02f, -0.063f, -0.033f, -0.094f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, -0.196f, -0.293f)
                lineToRelative(-6.0f, -6.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, -0.293f, -0.196f)
                curveToRelative(-0.03f, -0.014f, -0.062f, -0.022f, -0.094f, -0.033f)
                arcToRelative(0.991f, 0.991f, 0.0f, false, false, -0.259f, -0.051f)
                curveTo(13.04f, 2.011f, 13.021f, 2.0f, 13.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -0.021f, -0.011f, -0.04f, -0.013f, -0.062f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, false, -0.05f, -0.258f)
                close()
                moveTo(16.586f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.414f)
                lineTo(16.586f, 8.0f)
                close()
                moveTo(6.0f, 20.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(0.002f, 10.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _bxFileBlank!!
    }

private var _bxFileBlank: ImageVector? = null
