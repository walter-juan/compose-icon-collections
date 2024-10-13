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

public val RegularGroup.BxTv: ImageVector
    get() {
        if (_bxTv != null) {
            return _bxTv!!
        }
        _bxTv = Builder(name = "BxTv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineToRelative(-5.586f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(12.0f, 5.586f)
                lineTo(8.707f, 2.293f)
                lineTo(7.293f, 3.707f)
                lineTo(9.586f, 6.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(4.0f, 19.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(16.0f)
                lineToRelative(0.002f, 11.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _bxTv!!
    }

private var _bxTv: ImageVector? = null
