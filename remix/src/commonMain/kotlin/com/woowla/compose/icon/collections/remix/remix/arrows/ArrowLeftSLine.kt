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

public val ArrowsGroup.ArrowLeftSLine: ImageVector
    get() {
        if (_arrowLeftSLine != null) {
            return _arrowLeftSLine!!
        }
        _arrowLeftSLine = Builder(name = "ArrowLeftSLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.828f, 12.001f)
                lineTo(15.778f, 16.95f)
                lineTo(14.364f, 18.365f)
                lineTo(8.0f, 12.001f)
                lineTo(14.364f, 5.637f)
                lineTo(15.778f, 7.051f)
                lineTo(10.828f, 12.001f)
                close()
            }
        }
        .build()
        return _arrowLeftSLine!!
    }

private var _arrowLeftSLine: ImageVector? = null
