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

public val ArrowsGroup.ArrowUpSLine: ImageVector
    get() {
        if (_arrowUpSLine != null) {
            return _arrowUpSLine!!
        }
        _arrowUpSLine = Builder(name = "ArrowUpSLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.828f)
                lineTo(7.05f, 15.778f)
                lineTo(5.636f, 14.364f)
                lineTo(12.0f, 8.0f)
                lineTo(18.364f, 14.364f)
                lineTo(16.95f, 15.778f)
                lineTo(12.0f, 10.828f)
                close()
            }
        }
        .build()
        return _arrowUpSLine!!
    }

private var _arrowUpSLine: ImageVector? = null
