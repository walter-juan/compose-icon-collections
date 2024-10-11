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

public val ArrowsGroup.CornerRightUpLine: ImageVector
    get() {
        if (_cornerRightUpLine != null) {
            return _cornerRightUpLine!!
        }
        _cornerRightUpLine = Builder(name = "CornerRightUpLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 17.0f)
                lineTo(12.0f, 17.0f)
                lineTo(12.0f, 6.828f)
                lineTo(8.05f, 10.778f)
                lineTo(6.636f, 9.364f)
                lineTo(13.0f, 3.0f)
                lineTo(19.364f, 9.364f)
                lineTo(17.95f, 10.778f)
                lineTo(14.0f, 6.828f)
                lineTo(14.0f, 19.0f)
                close()
            }
        }
        .build()
        return _cornerRightUpLine!!
    }

private var _cornerRightUpLine: ImageVector? = null
