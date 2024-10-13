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

public val RegularGroup.BxVideoOff: ImageVector
    get() {
        if (_bxVideoOff != null) {
            return _bxVideoOff!!
        }
        _bxVideoOff = Builder(name = "BxVideoOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(6.414f, 5.0f)
                lineTo(3.707f, 2.293f)
                lineTo(2.293f, 3.707f)
                lineToRelative(18.0f, 18.0f)
                lineToRelative(1.414f, -1.414f)
                lineTo(18.0f, 16.586f)
                verticalLineToRelative(-2.919f)
                lineTo(22.0f, 17.0f)
                lineTo(22.0f, 7.0f)
                lineToRelative(-4.0f, 3.333f)
                lineTo(18.0f, 7.0f)
                close()
                moveTo(16.0f, 14.586f)
                lineTo(8.414f, 7.0f)
                lineTo(16.0f, 7.0f)
                verticalLineToRelative(7.586f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineToRelative(10.879f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(4.0f, 17.0f)
                lineTo(4.0f, 8.121f)
                lineTo(2.145f, 6.265f)
                arcTo(1.977f, 1.977f, 0.0f, false, false, 2.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxVideoOff!!
    }

private var _bxVideoOff: ImageVector? = null
