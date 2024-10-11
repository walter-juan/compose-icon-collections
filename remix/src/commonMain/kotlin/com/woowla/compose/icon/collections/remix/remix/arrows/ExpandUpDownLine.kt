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

public val ArrowsGroup.ExpandUpDownLine: ImageVector
    get() {
        if (_expandUpDownLine != null) {
            return _expandUpDownLine!!
        }
        _expandUpDownLine = Builder(name = "ExpandUpDownLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.207f, 9.043f)
                lineTo(12.0f, 2.836f)
                lineTo(5.793f, 9.043f)
                lineTo(7.207f, 10.457f)
                lineTo(12.0f, 5.664f)
                lineTo(16.793f, 10.457f)
                lineTo(18.207f, 9.043f)
                close()
                moveTo(5.793f, 14.957f)
                lineTo(12.0f, 21.164f)
                lineTo(18.207f, 14.957f)
                lineTo(16.793f, 13.543f)
                lineTo(12.0f, 18.336f)
                lineTo(7.207f, 13.543f)
                lineTo(5.793f, 14.957f)
                close()
            }
        }
        .build()
        return _expandUpDownLine!!
    }

private var _expandUpDownLine: ImageVector? = null
