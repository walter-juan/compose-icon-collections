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
                moveTo(18.205f, 2.25f)
                horizontalLineTo(21.513f)
                lineTo(14.286f, 10.51f)
                lineTo(22.788f, 21.75f)
                horizontalLineTo(16.131f)
                lineTo(10.917f, 14.933f)
                lineTo(4.951f, 21.75f)
                horizontalLineTo(1.641f)
                lineTo(9.371f, 12.915f)
                lineTo(1.215f, 2.25f)
                horizontalLineTo(8.041f)
                lineTo(12.754f, 8.481f)
                lineTo(18.205f, 2.25f)
                close()
                moveTo(17.044f, 19.77f)
                horizontalLineTo(18.877f)
                lineTo(7.045f, 4.126f)
                horizontalLineTo(5.078f)
                lineTo(17.044f, 19.77f)
                close()
            }
        }
        .build()
        return _twitterXFill!!
    }

private var _twitterXFill: ImageVector? = null
