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

public val LogosGroup.TwitterXLine: ImageVector
    get() {
        if (_twitterXLine != null) {
            return _twitterXLine!!
        }
        _twitterXLine = Builder(name = "TwitterXLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.488f, 14.651f)
                lineTo(15.25f, 21.0f)
                horizontalLineTo(22.25f)
                lineTo(14.392f, 10.522f)
                lineTo(20.931f, 3.0f)
                horizontalLineTo(18.281f)
                lineTo(13.164f, 8.886f)
                lineTo(8.75f, 3.0f)
                horizontalLineTo(1.75f)
                lineTo(9.261f, 13.014f)
                lineTo(2.319f, 21.0f)
                horizontalLineTo(4.969f)
                lineTo(10.488f, 14.651f)
                close()
                moveTo(16.25f, 19.0f)
                lineTo(5.75f, 5.0f)
                horizontalLineTo(7.75f)
                lineTo(18.25f, 19.0f)
                horizontalLineTo(16.25f)
                close()
            }
        }
        .build()
        return _twitterXLine!!
    }

private var _twitterXLine: ImageVector? = null
