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

public val LogosGroup.PerplexityLine: ImageVector
    get() {
        if (_perplexityLine != null) {
            return _perplexityLine!!
        }
        _perplexityLine = Builder(name = "PerplexityLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.173f, 3.26f)
                lineTo(5.5f, 1.74f)
                verticalLineTo(4.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.5f)
                verticalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(20.0f)
                verticalLineTo(22.261f)
                lineTo(7.173f, 20.74f)
                lineTo(11.0f, 17.261f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.261f)
                lineTo(16.827f, 20.74f)
                lineTo(18.5f, 22.261f)
                verticalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                verticalLineTo(8.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(20.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(4.0f)
                verticalLineTo(1.74f)
                lineTo(16.827f, 3.26f)
                lineTo(13.0f, 6.74f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.74f)
                lineTo(7.173f, 3.26f)
                close()
                moveTo(16.5f, 7.5f)
                horizontalLineTo(15.137f)
                lineTo(16.5f, 6.261f)
                verticalLineTo(7.5f)
                close()
                moveTo(8.863f, 7.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(6.261f)
                lineTo(8.863f, 7.5f)
                close()
                moveTo(9.963f, 9.5f)
                lineTo(5.827f, 13.26f)
                lineTo(5.5f, 13.558f)
                verticalLineTo(14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(9.963f)
                close()
                moveTo(14.037f, 9.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(14.0f)
                verticalLineTo(13.558f)
                lineTo(18.173f, 13.26f)
                lineTo(14.037f, 9.5f)
                close()
                moveTo(7.5f, 14.442f)
                lineTo(11.0f, 11.261f)
                verticalLineTo(14.558f)
                lineTo(7.5f, 17.74f)
                verticalLineTo(14.442f)
                close()
                moveTo(13.0f, 11.261f)
                lineTo(16.5f, 14.442f)
                verticalLineTo(17.74f)
                lineTo(13.0f, 14.558f)
                verticalLineTo(11.261f)
                close()
            }
        }
        .build()
        return _perplexityLine!!
    }

private var _perplexityLine: ImageVector? = null
