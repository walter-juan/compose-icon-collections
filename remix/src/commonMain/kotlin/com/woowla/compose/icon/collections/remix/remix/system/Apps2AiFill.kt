package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.Apps2AiFill: ImageVector
    get() {
        if (_apps2AiFill != null) {
            return _apps2AiFill!!
        }
        _apps2AiFill = Builder(name = "Apps2AiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 7.0f)
                curveTo(2.5f, 9.485f, 4.515f, 11.5f, 7.0f, 11.5f)
                curveTo(9.485f, 11.5f, 11.5f, 9.485f, 11.5f, 7.0f)
                curveTo(11.5f, 4.515f, 9.485f, 2.5f, 7.0f, 2.5f)
                curveTo(4.515f, 2.5f, 2.5f, 4.515f, 2.5f, 7.0f)
                close()
                moveTo(2.5f, 17.0f)
                curveTo(2.5f, 19.485f, 4.515f, 21.5f, 7.0f, 21.5f)
                curveTo(9.485f, 21.5f, 11.5f, 19.485f, 11.5f, 17.0f)
                curveTo(11.5f, 14.515f, 9.485f, 12.5f, 7.0f, 12.5f)
                curveTo(4.515f, 12.5f, 2.5f, 14.515f, 2.5f, 17.0f)
                close()
                moveTo(12.5f, 17.0f)
                curveTo(12.5f, 19.485f, 14.515f, 21.5f, 17.0f, 21.5f)
                curveTo(19.485f, 21.5f, 21.5f, 19.485f, 21.5f, 17.0f)
                curveTo(21.5f, 14.515f, 19.485f, 12.5f, 17.0f, 12.5f)
                curveTo(14.515f, 12.5f, 12.5f, 14.515f, 12.5f, 17.0f)
                close()
                moveTo(17.525f, 11.155f)
                lineTo(17.803f, 10.519f)
                curveTo(18.297f, 9.384f, 19.188f, 8.481f, 20.299f, 7.986f)
                lineTo(21.153f, 7.606f)
                curveTo(21.615f, 7.401f, 21.615f, 6.728f, 21.153f, 6.523f)
                lineTo(20.347f, 6.164f)
                curveTo(19.207f, 5.657f, 18.3f, 4.72f, 17.814f, 3.547f)
                lineTo(17.529f, 2.859f)
                curveTo(17.331f, 2.38f, 16.669f, 2.38f, 16.471f, 2.859f)
                lineTo(16.186f, 3.547f)
                curveTo(15.7f, 4.72f, 14.793f, 5.657f, 13.653f, 6.164f)
                lineTo(12.847f, 6.523f)
                curveTo(12.384f, 6.728f, 12.384f, 7.401f, 12.847f, 7.606f)
                lineTo(13.701f, 7.986f)
                curveTo(14.812f, 8.481f, 15.703f, 9.384f, 16.197f, 10.519f)
                lineTo(16.475f, 11.155f)
                curveTo(16.678f, 11.621f, 17.322f, 11.621f, 17.525f, 11.155f)
                close()
            }
        }
        .build()
        return _apps2AiFill!!
    }

private var _apps2AiFill: ImageVector? = null
