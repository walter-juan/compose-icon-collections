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

public val LogosGroup.TwitchFill: ImageVector
    get() {
        if (_twitchFill != null) {
            return _twitchFill!!
        }
        _twitchFill = Builder(name = "TwitchFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.001f, 3.0f)
                verticalLineTo(14.739f)
                lineTo(16.305f, 19.435f)
                horizontalLineTo(12.392f)
                lineTo(9.955f, 21.783f)
                horizontalLineTo(6.914f)
                verticalLineTo(19.435f)
                horizontalLineTo(3.001f)
                verticalLineTo(6.13f)
                lineTo(4.228f, 3.0f)
                horizontalLineTo(21.001f)
                close()
                moveTo(19.436f, 4.565f)
                horizontalLineTo(6.131f)
                verticalLineTo(16.304f)
                horizontalLineTo(9.262f)
                verticalLineTo(18.652f)
                lineTo(11.61f, 16.304f)
                horizontalLineTo(16.305f)
                lineTo(19.436f, 13.174f)
                verticalLineTo(4.565f)
                close()
                moveTo(16.305f, 7.696f)
                verticalLineTo(12.391f)
                horizontalLineTo(14.74f)
                verticalLineTo(7.696f)
                horizontalLineTo(16.305f)
                close()
                moveTo(12.392f, 7.696f)
                verticalLineTo(12.391f)
                horizontalLineTo(10.827f)
                verticalLineTo(7.696f)
                horizontalLineTo(12.392f)
                close()
            }
        }
        .build()
        return _twitchFill!!
    }

private var _twitchFill: ImageVector? = null
