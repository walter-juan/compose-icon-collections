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

public val LogosGroup.CentosLine: ImageVector
    get() {
        if (_centosLine != null) {
            return _centosLine!!
        }
        _centosLine = Builder(name = "CentosLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(16.292f, 6.292f)
                lineTo(17.353f, 5.232f)
                lineTo(16.121f, 4.0f)
                lineTo(20.0f, 4.0f)
                lineTo(20.0f, 7.879f)
                lineTo(18.767f, 6.646f)
                lineTo(17.707f, 7.707f)
                lineTo(22.0f, 12.0f)
                lineTo(17.708f, 16.293f)
                lineTo(18.767f, 17.352f)
                lineTo(20.0f, 16.121f)
                lineTo(20.0f, 20.0f)
                lineTo(16.121f, 20.0f)
                lineTo(17.352f, 18.767f)
                lineTo(16.293f, 17.707f)
                lineTo(12.0f, 22.0f)
                lineTo(7.707f, 17.707f)
                lineTo(6.646f, 18.767f)
                lineTo(7.879f, 20.0f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 16.121f)
                lineTo(5.231f, 17.352f)
                lineTo(6.292f, 16.292f)
                lineTo(2.0f, 12.0f)
                lineTo(6.293f, 7.707f)
                lineTo(5.231f, 6.646f)
                lineTo(4.0f, 7.879f)
                lineTo(4.0f, 4.0f)
                lineTo(7.879f, 4.0f)
                lineTo(6.646f, 5.231f)
                lineTo(7.708f, 6.293f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(12.0f, 13.413f)
                lineTo(9.12f, 16.292f)
                lineTo(12.0f, 19.172f)
                lineTo(14.879f, 16.292f)
                lineTo(12.0f, 13.413f)
                close()
                moveTo(7.707f, 9.121f)
                lineTo(4.828f, 12.0f)
                lineTo(7.706f, 14.878f)
                lineTo(10.586f, 11.999f)
                lineTo(7.707f, 9.121f)
                close()
                moveTo(16.292f, 9.121f)
                lineTo(13.415f, 11.999f)
                lineTo(16.293f, 14.878f)
                lineTo(19.172f, 12.0f)
                lineTo(16.292f, 9.121f)
                close()
                moveTo(12.0f, 4.828f)
                lineTo(9.122f, 7.707f)
                lineTo(12.001f, 10.585f)
                lineTo(14.878f, 7.706f)
                lineTo(12.0f, 4.828f)
                close()
            }
        }
        .build()
        return _centosLine!!
    }

private var _centosLine: ImageVector? = null
