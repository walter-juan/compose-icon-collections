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

public val RegularGroup.BxGasPump: ImageVector
    get() {
        if (_bxGasPump != null) {
            return _bxGasPump!!
        }
        _bxGasPump = Builder(name = "BxGasPump", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.616f, 6.48f)
                lineToRelative(0.014f, -0.017f)
                lineToRelative(-4.0f, -3.24f)
                lineToRelative(-1.26f, 1.554f)
                lineToRelative(2.067f, 1.674f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, -1.395f, 3.058f)
                curveToRelative(0.149f, 0.899f, 0.766f, 1.676f, 1.565f, 2.112f)
                curveToRelative(0.897f, 0.49f, 1.685f, 0.446f, 2.384f, 0.197f)
                lineTo(18.976f, 18.0f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, true, -1.39f, 0.922f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, true, -0.318f, -0.217f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, true, -0.291f, -0.705f)
                lineTo(17.0f, 16.0f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, false, -0.877f, -2.119f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 14.0f, 13.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(13.0f, 5.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(4.0f, 3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.136f, 0.0f, 0.267f, 0.027f, 0.391f, 0.078f)
                arcToRelative(1.028f, 1.028f, 0.0f, false, true, 0.531f, 0.533f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 15.0f, 16.0f)
                lineToRelative(-0.024f, 2.0f)
                curveToRelative(0.0f, 0.406f, 0.079f, 0.799f, 0.236f, 1.168f)
                curveToRelative(0.151f, 0.359f, 0.368f, 0.68f, 0.641f, 0.951f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, false, 2.123f, 0.881f)
                curveToRelative(0.406f, 0.0f, 0.798f, -0.078f, 1.168f, -0.236f)
                curveToRelative(0.358f, -0.15f, 0.68f, -0.367f, 0.951f, -0.641f)
                arcTo(2.983f, 2.983f, 0.0f, false, false, 20.976f, 18.0f)
                lineTo(21.0f, 9.0f)
                arcToRelative(2.997f, 2.997f, 0.0f, false, false, -1.384f, -2.52f)
                close()
                moveTo(4.0f, 5.0f)
                horizontalLineToRelative(7.0f)
                lineToRelative(0.001f, 4.0f)
                lineTo(4.0f, 9.0f)
                lineTo(4.0f, 5.0f)
                close()
                moveTo(4.0f, 19.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(7.001f)
                lineToRelative(0.001f, 8.0f)
                lineTo(4.0f, 19.0f)
                close()
                moveTo(18.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxGasPump!!
    }

private var _bxGasPump: ImageVector? = null
