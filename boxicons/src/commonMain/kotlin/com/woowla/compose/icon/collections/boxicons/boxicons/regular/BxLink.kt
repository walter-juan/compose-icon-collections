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

public val RegularGroup.BxLink: ImageVector
    get() {
        if (_bxLink != null) {
            return _bxLink!!
        }
        _bxLink = Builder(name = "BxLink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.465f, 11.293f)
                curveToRelative(1.133f, -1.133f, 3.109f, -1.133f, 4.242f, 0.0f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-0.707f, -0.707f)
                curveToRelative(-0.943f, -0.944f, -2.199f, -1.465f, -3.535f, -1.465f)
                reflectiveCurveToRelative(-2.592f, 0.521f, -3.535f, 1.465f)
                lineTo(4.929f, 12.0f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, 0.0f, 7.071f)
                arcToRelative(4.983f, 4.983f, 0.0f, false, false, 3.535f, 1.462f)
                arcTo(4.982f, 4.982f, 0.0f, false, false, 12.0f, 19.071f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-0.707f, 0.707f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, true, -4.243f, 0.0f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, true, 0.0f, -4.243f)
                lineToRelative(2.122f, -2.121f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 4.929f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(0.707f, -0.707f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, true, 4.243f, 0.0f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, true, 0.0f, 4.243f)
                lineToRelative(-2.122f, 2.121f)
                curveToRelative(-1.133f, 1.133f, -3.109f, 1.133f, -4.242f, 0.0f)
                lineTo(10.586f, 12.0f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(0.707f, 0.707f)
                curveToRelative(0.943f, 0.944f, 2.199f, 1.465f, 3.535f, 1.465f)
                reflectiveCurveToRelative(2.592f, -0.521f, 3.535f, -1.465f)
                lineTo(19.071f, 12.0f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, 0.0f, -7.071f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -7.071f, 0.0f)
                close()
            }
        }
        .build()
        return _bxLink!!
    }

private var _bxLink: ImageVector? = null
