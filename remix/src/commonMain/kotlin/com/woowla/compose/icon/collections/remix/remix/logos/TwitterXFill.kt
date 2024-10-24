package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.TwitterXFill: ImageVector
    get() {
        if (_twitterXFill != null) {
            return _twitterXFill!!
        }
        _twitterXFill = Builder(name = "TwitterXFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.687f, 3.063f)
                lineTo(12.691f, 8.774f)
                lineTo(8.37f, 3.063f)
                horizontalLineTo(2.113f)
                lineTo(9.59f, 12.839f)
                lineTo(2.504f, 20.938f)
                horizontalLineTo(5.538f)
                lineTo(11.007f, 14.689f)
                lineTo(15.786f, 20.938f)
                horizontalLineTo(21.889f)
                lineTo(14.095f, 10.634f)
                lineTo(20.72f, 3.063f)
                horizontalLineTo(17.687f)
                close()
                moveTo(16.623f, 19.122f)
                lineTo(5.654f, 4.782f)
                horizontalLineTo(7.457f)
                lineTo(18.303f, 19.122f)
                horizontalLineTo(16.623f)
                close()
            }
        }
        .build()
        return _twitterXFill!!
    }

private var _twitterXFill: ImageVector? = null
