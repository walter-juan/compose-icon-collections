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

public val SystemGroup.CheckDoubleLine: ImageVector
    get() {
        if (_checkDoubleLine != null) {
            return _checkDoubleLine!!
        }
        _checkDoubleLine = Builder(name = "CheckDoubleLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.602f, 13.76f)
                lineTo(13.014f, 15.172f)
                lineTo(21.479f, 6.706f)
                lineTo(22.894f, 8.121f)
                lineTo(13.014f, 18.0f)
                lineTo(6.65f, 11.636f)
                lineTo(8.064f, 10.222f)
                lineTo(10.189f, 12.347f)
                lineTo(11.602f, 13.759f)
                lineTo(11.602f, 13.76f)
                close()
                moveTo(11.604f, 10.932f)
                lineTo(16.556f, 5.979f)
                lineTo(17.967f, 7.39f)
                lineTo(13.014f, 12.342f)
                lineTo(11.604f, 10.932f)
                close()
                moveTo(8.777f, 16.587f)
                lineTo(7.364f, 18.0f)
                lineTo(1.0f, 11.636f)
                lineTo(2.414f, 10.222f)
                lineTo(3.827f, 11.635f)
                lineTo(3.826f, 11.636f)
                lineTo(8.777f, 16.587f)
                close()
            }
        }
        .build()
        return _checkDoubleLine!!
    }

private var _checkDoubleLine: ImageVector? = null
