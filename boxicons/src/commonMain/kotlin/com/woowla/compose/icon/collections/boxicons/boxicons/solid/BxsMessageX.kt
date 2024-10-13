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

public val SolidGroup.BxsMessageX: ImageVector
    get() {
        if (_bxsMessageX != null) {
            return _bxsMessageX!!
        }
        _bxsMessageX = Builder(name = "BxsMessageX", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.894f, -2.0f, 1.992f)
                verticalLineToRelative(12.016f)
                curveTo(2.0f, 17.106f, 2.897f, 18.0f, 4.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(6.351f, -4.0f)
                lineTo(20.0f, 18.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.894f, 2.0f, -1.992f)
                lineTo(22.0f, 3.992f)
                arcTo(1.998f, 1.998f, 0.0f, false, false, 20.0f, 2.0f)
                close()
                moveTo(16.707f, 13.293f)
                lineTo(15.293f, 14.707f)
                lineTo(12.0f, 11.414f)
                lineToRelative(-3.293f, 3.293f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(10.586f, 10.0f)
                lineTo(7.293f, 6.707f)
                lineToRelative(1.414f, -1.414f)
                lineTo(12.0f, 8.586f)
                lineToRelative(3.293f, -3.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(13.414f, 10.0f)
                lineToRelative(3.293f, 3.293f)
                close()
            }
        }
        .build()
        return _bxsMessageX!!
    }

private var _bxsMessageX: ImageVector? = null
