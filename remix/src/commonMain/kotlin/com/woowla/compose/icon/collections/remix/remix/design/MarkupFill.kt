package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.MarkupFill: ImageVector
    get() {
        if (_markupFill != null) {
            return _markupFill!!
        }
        _markupFill = Builder(name = "MarkupFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.997f)
                curveTo(6.477f, 21.997f, 2.0f, 17.52f, 2.0f, 11.997f)
                curveTo(2.0f, 6.474f, 6.477f, 1.997f, 12.0f, 1.997f)
                curveTo(17.523f, 1.997f, 22.0f, 6.474f, 22.0f, 11.997f)
                curveTo(22.0f, 17.52f, 17.523f, 21.997f, 12.0f, 21.997f)
                close()
                moveTo(17.051f, 18.201f)
                lineTo(16.189f, 14.754f)
                curveTo(16.078f, 14.309f, 15.678f, 13.997f, 15.219f, 13.997f)
                horizontalLineTo(8.781f)
                curveTo(8.322f, 13.997f, 7.922f, 14.309f, 7.811f, 14.754f)
                lineTo(6.949f, 18.201f)
                curveTo(8.326f, 19.323f, 10.085f, 19.997f, 12.0f, 19.997f)
                curveTo(13.915f, 19.997f, 15.674f, 19.323f, 17.051f, 18.201f)
                close()
                moveTo(10.0f, 11.997f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.497f)
                lineTo(12.962f, 6.862f)
                curveTo(12.867f, 6.53f, 12.607f, 6.27f, 12.275f, 6.175f)
                curveTo(11.744f, 6.023f, 11.19f, 6.331f, 11.038f, 6.862f)
                lineTo(10.0f, 10.497f)
                verticalLineTo(11.997f)
                close()
            }
        }
        .build()
        return _markupFill!!
    }

private var _markupFill: ImageVector? = null
