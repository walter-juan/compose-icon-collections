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

public val MapGroup.UnpinFill: ImageVector
    get() {
        if (_unpinFill != null) {
            return _unpinFill!!
        }
        _unpinFill = Builder(name = "UnpinFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.971f, 17.171f)
                lineTo(19.557f, 18.586f)
                lineTo(16.022f, 15.051f)
                lineTo(15.949f, 15.125f)
                lineTo(15.241f, 18.66f)
                lineTo(13.827f, 20.075f)
                lineTo(9.585f, 15.832f)
                lineTo(4.635f, 20.782f)
                lineTo(3.221f, 19.368f)
                lineTo(8.17f, 14.418f)
                lineTo(3.928f, 10.175f)
                lineTo(5.342f, 8.761f)
                lineTo(8.878f, 8.054f)
                lineTo(8.951f, 7.98f)
                lineTo(5.415f, 4.444f)
                lineTo(6.829f, 3.029f)
                lineTo(20.971f, 17.171f)
                close()
                moveTo(18.851f, 12.223f)
                lineTo(20.191f, 10.882f)
                lineTo(20.898f, 11.589f)
                lineTo(22.313f, 10.175f)
                lineTo(13.827f, 1.69f)
                lineTo(12.413f, 3.104f)
                lineTo(13.12f, 3.811f)
                lineTo(11.78f, 5.152f)
                lineTo(18.851f, 12.223f)
                close()
            }
        }
        .build()
        return _unpinFill!!
    }

private var _unpinFill: ImageVector? = null
