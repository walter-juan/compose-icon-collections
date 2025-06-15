package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Onestream: ImageVector
    get() {
        if (_onestream != null) {
            return _onestream!!
        }
        _onestream = Builder(name = "Onestream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.457f, 8.42f)
                horizontalLineToRelative(-2.311f)
                arcToRelative(9.79f, 9.79f, 0.0f, false, true, 0.676f, 3.58f)
                curveToRelative(0.0f, 5.425f, -4.397f, 9.822f, -9.822f, 9.822f)
                arcToRelative(9.767f, 9.767f, 0.0f, false, true, -4.98f, -1.357f)
                arcToRelative(9.12f, 9.12f, 0.0f, false, false, 5.625f, -6.457f)
                lineToRelative(0.817f, -3.529f)
                arcToRelative(6.918f, 6.918f, 0.0f, false, true, 2.488f, -3.903f)
                arcToRelative(6.221f, 6.221f, 0.0f, false, true, 1.52f, -0.87f)
                arcToRelative(7.616f, 7.616f, 0.0f, false, true, 2.765f, -0.51f)
                lineToRelative(1.642f, -0.003f)
                curveTo(19.711f, 2.063f, 16.094f, 0.0f, 12.0f, 0.0f)
                curveTo(5.372f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                curveToRelative(0.0f, 1.247f, 0.19f, 2.448f, 0.543f, 3.579f)
                horizontalLineToRelative(2.31f)
                arcTo(9.79f, 9.79f, 0.0f, false, true, 2.179f, 12.0f)
                curveToRelative(0.0f, -5.424f, 4.398f, -9.822f, 9.822f, -9.822f)
                curveToRelative(1.819f, 0.0f, 3.52f, 0.495f, 4.98f, 1.357f)
                arcToRelative(9.118f, 9.118f, 0.0f, false, false, -5.625f, 6.457f)
                lineToRelative(-0.816f, 3.53f)
                arcToRelative(6.917f, 6.917f, 0.0f, false, true, -2.488f, 3.903f)
                arcToRelative(6.22f, 6.22f, 0.0f, false, true, -1.52f, 0.869f)
                curveToRelative(-0.737f, 0.295f, -1.655f, 0.51f, -2.887f, 0.51f)
                lineToRelative(-1.522f, 0.002f)
                curveTo(4.288f, 21.936f, 7.906f, 24.0f, 12.0f, 24.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.543f, -3.58f)
                close()
            }
        }
        .build()
        return _onestream!!
    }

private var _onestream: ImageVector? = null
