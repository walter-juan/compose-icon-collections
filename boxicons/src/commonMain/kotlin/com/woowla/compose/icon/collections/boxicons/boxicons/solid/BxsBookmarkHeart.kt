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

public val SolidGroup.BxsBookmarkHeart: ImageVector
    get() {
        if (_bxsBookmarkHeart != null) {
            return _bxsBookmarkHeart!!
        }
        _bxsBookmarkHeart = Builder(name = "BxsBookmarkHeart", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 22.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(18.0f)
                lineToRelative(7.0f, -4.666f)
                lineTo(19.0f, 22.0f)
                close()
                moveTo(8.006f, 8.056f)
                curveToRelative(0.0f, -0.568f, 0.224f, -1.083f, 0.585f, -1.456f)
                curveToRelative(0.361f, -0.372f, 0.86f, -0.603f, 1.412f, -0.603f)
                curveToRelative(0.0f, 0.0f, 0.996f, -0.003f, 1.997f, 1.029f)
                curveToRelative(1.001f, -1.032f, 1.997f, -1.029f, 1.997f, -1.029f)
                curveToRelative(0.552f, 0.0f, 1.051f, 0.23f, 1.412f, 0.603f)
                reflectiveCurveToRelative(0.585f, 0.888f, 0.585f, 1.456f)
                reflectiveCurveToRelative(-0.224f, 1.084f, -0.585f, 1.456f)
                lineTo(12.0f, 13.203f)
                lineTo(8.591f, 9.512f)
                arcToRelative(2.083f, 2.083f, 0.0f, false, true, -0.585f, -1.456f)
                close()
            }
        }
        .build()
        return _bxsBookmarkHeart!!
    }

private var _bxsBookmarkHeart: ImageVector? = null
