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

public val ArrowsGroup.ArrowLeftDoubleFill: ImageVector
    get() {
        if (_arrowLeftDoubleFill != null) {
            return _arrowLeftDoubleFill!!
        }
        _arrowLeftDoubleFill = Builder(name = "ArrowLeftDoubleFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.836f, 12.0f)
                lineTo(11.043f, 18.207f)
                lineTo(12.457f, 16.793f)
                lineTo(7.664f, 12.0f)
                lineTo(12.457f, 7.207f)
                lineTo(11.043f, 5.793f)
                lineTo(4.836f, 12.0f)
                close()
                moveTo(10.486f, 12.0f)
                lineTo(16.693f, 18.207f)
                lineTo(18.107f, 16.793f)
                lineTo(13.314f, 12.0f)
                lineTo(18.107f, 7.207f)
                lineTo(16.693f, 5.793f)
                lineTo(10.486f, 12.0f)
                close()
            }
        }
        .build()
        return _arrowLeftDoubleFill!!
    }

private var _arrowLeftDoubleFill: ImageVector? = null
