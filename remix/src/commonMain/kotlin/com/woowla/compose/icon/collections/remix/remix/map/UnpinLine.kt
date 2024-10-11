package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.UnpinLine: ImageVector
    get() {
        if (_unpinLine != null) {
            return _unpinLine!!
        }
        _unpinLine = Builder(name = "UnpinLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.97f, 17.172f)
                lineTo(19.556f, 18.586f)
                lineTo(16.021f, 15.051f)
                lineTo(15.948f, 15.125f)
                lineTo(15.241f, 18.661f)
                lineTo(13.826f, 20.075f)
                lineTo(9.584f, 15.832f)
                lineTo(4.634f, 20.782f)
                lineTo(3.22f, 19.368f)
                lineTo(8.169f, 14.418f)
                lineTo(3.927f, 10.175f)
                lineTo(5.341f, 8.761f)
                lineTo(8.877f, 8.054f)
                lineTo(8.95f, 7.98f)
                lineTo(5.414f, 4.444f)
                lineTo(6.828f, 3.03f)
                lineTo(20.97f, 17.172f)
                close()
                moveTo(10.365f, 9.394f)
                lineTo(9.863f, 9.896f)
                lineTo(7.041f, 10.461f)
                lineTo(13.541f, 16.961f)
                lineTo(14.105f, 14.139f)
                lineTo(14.607f, 13.637f)
                lineTo(10.365f, 9.394f)
                close()
                moveTo(18.776f, 9.468f)
                lineTo(17.436f, 10.809f)
                lineTo(18.85f, 12.223f)
                lineTo(20.19f, 10.882f)
                lineTo(20.897f, 11.59f)
                lineTo(22.312f, 10.175f)
                lineTo(13.826f, 1.69f)
                lineTo(12.412f, 3.104f)
                lineTo(13.119f, 3.811f)
                lineTo(11.779f, 5.152f)
                lineTo(13.193f, 6.566f)
                lineTo(14.533f, 5.226f)
                lineTo(18.776f, 9.468f)
                close()
            }
        }
        .build()
        return _unpinLine!!
    }

private var _unpinLine: ImageVector? = null
