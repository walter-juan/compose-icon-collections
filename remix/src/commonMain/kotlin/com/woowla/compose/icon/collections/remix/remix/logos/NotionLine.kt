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

public val LogosGroup.NotionLine: ImageVector
    get() {
        if (_notionLine != null) {
            return _notionLine!!
        }
        _notionLine = Builder(name = "NotionLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.285f, 2.955f)
                curveTo(15.928f, 2.717f, 15.501f, 2.608f, 15.074f, 2.645f)
                lineTo(4.015f, 3.606f)
                curveTo(3.504f, 3.651f, 3.111f, 4.079f, 3.111f, 4.592f)
                lineTo(3.111f, 16.167f)
                curveTo(3.111f, 16.575f, 3.244f, 16.973f, 3.489f, 17.3f)
                lineTo(6.256f, 20.989f)
                curveTo(6.459f, 21.26f, 6.786f, 21.408f, 7.123f, 21.382f)
                lineTo(19.976f, 20.393f)
                curveTo(20.491f, 20.354f, 20.889f, 19.924f, 20.889f, 19.407f)
                verticalLineTo(6.527f)
                curveTo(20.889f, 6.213f, 20.732f, 5.92f, 20.471f, 5.746f)
                lineTo(16.285f, 2.955f)
                close()
                moveTo(15.228f, 4.416f)
                curveTo(15.253f, 4.414f, 15.278f, 4.42f, 15.299f, 4.434f)
                lineTo(18.045f, 6.265f)
                lineTo(7.839f, 7.081f)
                lineTo(5.978f, 5.22f)
                lineTo(15.228f, 4.416f)
                close()
                moveTo(19.111f, 18.677f)
                lineTo(8.389f, 19.502f)
                verticalLineTo(8.821f)
                lineTo(19.111f, 7.963f)
                verticalLineTo(18.677f)
                close()
                moveTo(4.889f, 6.646f)
                lineTo(6.611f, 8.368f)
                lineTo(6.611f, 18.5f)
                lineTo(4.911f, 16.233f)
                curveTo(4.897f, 16.214f, 4.889f, 16.191f, 4.889f, 16.167f)
                lineTo(4.889f, 6.646f)
                close()
                moveTo(11.979f, 10.123f)
                lineTo(10.002f, 10.253f)
                verticalLineTo(17.815f)
                lineTo(11.998f, 17.685f)
                verticalLineTo(13.348f)
                lineTo(15.51f, 17.517f)
                lineTo(17.486f, 17.387f)
                verticalLineTo(9.825f)
                lineTo(15.49f, 9.956f)
                verticalLineTo(14.292f)
                lineTo(11.979f, 10.123f)
                close()
            }
        }
        .build()
        return _notionLine!!
    }

private var _notionLine: ImageVector? = null
