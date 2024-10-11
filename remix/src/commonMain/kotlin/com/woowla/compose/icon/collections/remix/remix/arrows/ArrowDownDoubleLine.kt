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

public val ArrowsGroup.ArrowDownDoubleLine: ImageVector
    get() {
        if (_arrowDownDoubleLine != null) {
            return _arrowDownDoubleLine!!
        }
        _arrowDownDoubleLine = Builder(name = "ArrowDownDoubleLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.164f)
                lineTo(18.207f, 12.957f)
                lineTo(16.793f, 11.543f)
                lineTo(12.0f, 16.336f)
                lineTo(7.207f, 11.543f)
                lineTo(5.793f, 12.957f)
                lineTo(12.0f, 19.164f)
                close()
                moveTo(12.0f, 13.514f)
                lineTo(18.207f, 7.307f)
                lineTo(16.793f, 5.893f)
                lineTo(12.0f, 10.686f)
                lineTo(7.207f, 5.893f)
                lineTo(5.793f, 7.307f)
                lineTo(12.0f, 13.514f)
                close()
            }
        }
        .build()
        return _arrowDownDoubleLine!!
    }

private var _arrowDownDoubleLine: ImageVector? = null
