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

public val ArrowsGroup.ArrowRightDoubleLine: ImageVector
    get() {
        if (_arrowRightDoubleLine != null) {
            return _arrowRightDoubleLine!!
        }
        _arrowRightDoubleLine = Builder(name = "ArrowRightDoubleLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.164f, 12.0f)
                lineTo(12.957f, 5.793f)
                lineTo(11.543f, 7.207f)
                lineTo(16.336f, 12.0f)
                lineTo(11.543f, 16.793f)
                lineTo(12.957f, 18.207f)
                lineTo(19.164f, 12.0f)
                close()
                moveTo(13.514f, 12.0f)
                lineTo(7.307f, 5.793f)
                lineTo(5.893f, 7.207f)
                lineTo(10.686f, 12.0f)
                lineTo(5.893f, 16.793f)
                lineTo(7.307f, 18.207f)
                lineTo(13.514f, 12.0f)
                close()
            }
        }
        .build()
        return _arrowRightDoubleLine!!
    }

private var _arrowRightDoubleLine: ImageVector? = null
