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

public val RegularGroup.BxDislike: ImageVector
    get() {
        if (_bxDislike != null) {
            return _bxDislike!!
        }
        _bxDislike = Builder(name = "BxDislike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                lineTo(6.693f, 3.0f)
                arcTo(2.01f, 2.01f, 0.0f, false, false, 4.82f, 4.298f)
                lineToRelative(-2.757f, 7.351f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 12.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(5.612f)
                lineTo(8.49f, 19.367f)
                arcToRelative(2.004f, 2.004f, 0.0f, false, false, 0.274f, 1.802f)
                curveToRelative(0.376f, 0.52f, 0.982f, 0.831f, 1.624f, 0.831f)
                lineTo(12.0f, 22.0f)
                curveToRelative(0.297f, 0.0f, 0.578f, -0.132f, 0.769f, -0.36f)
                lineToRelative(4.7f, -5.64f)
                lineTo(20.0f, 16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(11.531f, 20.0f)
                horizontalLineToRelative(-1.145f)
                lineToRelative(1.562f, -4.684f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 14.0f)
                lineTo(4.0f, 14.0f)
                verticalLineToRelative(-1.819f)
                lineTo(6.693f, 5.0f)
                lineTo(16.0f, 5.0f)
                verticalLineToRelative(9.638f)
                lineTo(11.531f, 20.0f)
                close()
                moveTo(18.0f, 14.0f)
                lineTo(18.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.001f, 9.0f)
                lineTo(18.0f, 14.0f)
                close()
            }
        }
        .build()
        return _bxDislike!!
    }

private var _bxDislike: ImageVector? = null
