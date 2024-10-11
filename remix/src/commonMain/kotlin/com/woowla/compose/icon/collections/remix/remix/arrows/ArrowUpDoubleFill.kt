package com.woowla.compose.icon.collections.remix.remix.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.ArrowsGroup

public val ArrowsGroup.ArrowUpDoubleFill: ImageVector
    get() {
        if (_arrowUpDoubleFill != null) {
            return _arrowUpDoubleFill!!
        }
        _arrowUpDoubleFill = Builder(name = "ArrowUpDoubleFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.836f)
                lineTo(5.793f, 11.043f)
                lineTo(7.207f, 12.457f)
                lineTo(12.0f, 7.664f)
                lineTo(16.793f, 12.457f)
                lineTo(18.207f, 11.043f)
                lineTo(12.0f, 4.836f)
                close()
                moveTo(12.0f, 10.486f)
                lineTo(5.793f, 16.693f)
                lineTo(7.207f, 18.107f)
                lineTo(12.0f, 13.314f)
                lineTo(16.793f, 18.107f)
                lineTo(18.207f, 16.693f)
                lineTo(12.0f, 10.486f)
                close()
            }
        }
        .build()
        return _arrowUpDoubleFill!!
    }

private var _arrowUpDoubleFill: ImageVector? = null
