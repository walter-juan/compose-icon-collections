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

public val DesignGroup.MarkupLine: ImageVector
    get() {
        if (_markupLine != null) {
            return _markupLine!!
        }
        _markupLine = Builder(name = "MarkupLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.497f)
                lineTo(11.038f, 6.862f)
                curveTo(11.19f, 6.331f, 11.744f, 6.023f, 12.275f, 6.175f)
                curveTo(12.607f, 6.27f, 12.867f, 6.53f, 12.962f, 6.862f)
                lineTo(14.0f, 10.497f)
                verticalLineTo(11.997f)
                horizontalLineTo(14.719f)
                curveTo(15.178f, 11.997f, 15.578f, 12.309f, 15.689f, 12.754f)
                lineTo(17.051f, 18.201f)
                curveTo(18.851f, 16.734f, 20.0f, 14.5f, 20.0f, 11.997f)
                curveTo(20.0f, 7.578f, 16.418f, 3.997f, 12.0f, 3.997f)
                curveTo(7.582f, 3.997f, 4.0f, 7.578f, 4.0f, 11.997f)
                curveTo(4.0f, 14.5f, 5.149f, 16.734f, 6.949f, 18.201f)
                lineTo(8.311f, 12.754f)
                curveTo(8.422f, 12.309f, 8.822f, 11.997f, 9.281f, 11.997f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.497f)
                close()
                moveTo(12.0f, 19.997f)
                curveTo(12.241f, 19.997f, 12.481f, 19.986f, 12.719f, 19.965f)
                curveTo(13.619f, 19.885f, 14.476f, 19.656f, 15.265f, 19.302f)
                lineTo(13.938f, 13.997f)
                horizontalLineTo(10.062f)
                lineTo(8.735f, 19.302f)
                curveTo(9.524f, 19.656f, 10.381f, 19.885f, 11.281f, 19.965f)
                curveTo(11.519f, 19.986f, 11.759f, 19.997f, 12.0f, 19.997f)
                close()
                moveTo(12.0f, 21.997f)
                curveTo(6.477f, 21.997f, 2.0f, 17.52f, 2.0f, 11.997f)
                curveTo(2.0f, 6.474f, 6.477f, 1.997f, 12.0f, 1.997f)
                curveTo(17.523f, 1.997f, 22.0f, 6.474f, 22.0f, 11.997f)
                curveTo(22.0f, 17.52f, 17.523f, 21.997f, 12.0f, 21.997f)
                close()
            }
        }
        .build()
        return _markupLine!!
    }

private var _markupLine: ImageVector? = null
