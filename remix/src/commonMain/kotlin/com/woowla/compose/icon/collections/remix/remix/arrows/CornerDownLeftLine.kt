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

public val ArrowsGroup.CornerDownLeftLine: ImageVector
    get() {
        if (_cornerDownLeftLine != null) {
            return _cornerDownLeftLine!!
        }
        _cornerDownLeftLine = Builder(name = "CornerDownLeftLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 14.0f)
                lineTo(19.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                lineTo(17.0f, 12.0f)
                lineTo(6.828f, 12.0f)
                lineTo(10.778f, 8.05f)
                lineTo(9.364f, 6.636f)
                lineTo(3.0f, 13.0f)
                lineTo(9.364f, 19.364f)
                lineTo(10.778f, 17.95f)
                lineTo(6.828f, 14.0f)
                lineTo(19.0f, 14.0f)
                close()
            }
        }
        .build()
        return _cornerDownLeftLine!!
    }

private var _cornerDownLeftLine: ImageVector? = null
