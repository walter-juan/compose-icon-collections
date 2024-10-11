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

public val ArrowsGroup.CornerUpLeftFill: ImageVector
    get() {
        if (_cornerUpLeftFill != null) {
            return _cornerUpLeftFill!!
        }
        _cornerUpLeftFill = Builder(name = "CornerUpLeftFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                lineTo(19.0f, 19.0f)
                lineTo(17.0f, 19.0f)
                lineTo(17.0f, 12.0f)
                lineTo(9.414f, 12.0f)
                verticalLineTo(17.414f)
                lineTo(3.0f, 11.0f)
                lineTo(9.414f, 4.586f)
                lineTo(9.414f, 10.0f)
                lineTo(19.0f, 10.0f)
                close()
            }
        }
        .build()
        return _cornerUpLeftFill!!
    }

private var _cornerUpLeftFill: ImageVector? = null
