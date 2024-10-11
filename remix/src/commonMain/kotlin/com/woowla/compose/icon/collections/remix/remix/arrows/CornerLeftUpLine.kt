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

public val ArrowsGroup.CornerLeftUpLine: ImageVector
    get() {
        if (_cornerLeftUpLine != null) {
            return _cornerLeftUpLine!!
        }
        _cornerLeftUpLine = Builder(name = "CornerLeftUpLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 19.0f)
                lineTo(19.0f, 19.0f)
                lineTo(19.0f, 17.0f)
                lineTo(12.0f, 17.0f)
                lineTo(12.0f, 6.828f)
                lineTo(15.95f, 10.778f)
                lineTo(17.364f, 9.364f)
                lineTo(11.0f, 3.0f)
                lineTo(4.636f, 9.364f)
                lineTo(6.05f, 10.778f)
                lineTo(10.0f, 6.828f)
                lineTo(10.0f, 19.0f)
                close()
            }
        }
        .build()
        return _cornerLeftUpLine!!
    }

private var _cornerLeftUpLine: ImageVector? = null
