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

public val LogosGroup.PerplexityFill: ImageVector
    get() {
        if (_perplexityFill != null) {
            return _perplexityFill!!
        }
        _perplexityFill = Builder(name = "PerplexityFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.735f, 2.0f)
                lineTo(11.43f, 7.247f)
                verticalLineTo(7.246f)
                verticalLineTo(2.012f)
                horizontalLineTo(12.538f)
                verticalLineTo(7.271f)
                lineTo(18.259f, 2.0f)
                verticalLineTo(7.983f)
                horizontalLineTo(20.608f)
                verticalLineTo(16.612f)
                horizontalLineTo(18.266f)
                verticalLineTo(21.939f)
                lineTo(12.538f, 16.907f)
                verticalLineTo(21.997f)
                horizontalLineTo(11.43f)
                verticalLineTo(16.99f)
                lineTo(5.741f, 22.0f)
                verticalLineTo(16.612f)
                horizontalLineTo(3.393f)
                verticalLineTo(7.983f)
                horizontalLineTo(5.735f)
                verticalLineTo(2.0f)
                close()
                moveTo(10.594f, 9.078f)
                horizontalLineTo(4.501f)
                verticalLineTo(15.517f)
                horizontalLineTo(5.74f)
                verticalLineTo(13.486f)
                lineTo(10.594f, 9.078f)
                close()
                moveTo(6.85f, 13.972f)
                verticalLineTo(19.556f)
                lineTo(11.43f, 15.523f)
                verticalLineTo(9.811f)
                lineTo(6.85f, 13.972f)
                close()
                moveTo(12.57f, 15.469f)
                lineTo(17.158f, 19.499f)
                verticalLineTo(16.612f)
                horizontalLineTo(17.152f)
                verticalLineTo(13.966f)
                lineTo(12.57f, 9.806f)
                verticalLineTo(15.469f)
                close()
                moveTo(18.266f, 15.517f)
                horizontalLineTo(19.499f)
                verticalLineTo(9.078f)
                horizontalLineTo(13.452f)
                lineTo(18.266f, 13.44f)
                verticalLineTo(15.517f)
                close()
                moveTo(17.15f, 7.983f)
                verticalLineTo(4.519f)
                lineTo(13.391f, 7.983f)
                horizontalLineTo(17.15f)
                close()
                moveTo(10.603f, 7.983f)
                lineTo(6.843f, 4.519f)
                verticalLineTo(7.983f)
                horizontalLineTo(10.603f)
                close()
            }
        }
        .build()
        return _perplexityFill!!
    }

private var _perplexityFill: ImageVector? = null
