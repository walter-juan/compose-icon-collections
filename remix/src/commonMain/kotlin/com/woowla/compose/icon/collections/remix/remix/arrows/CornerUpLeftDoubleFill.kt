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

public val ArrowsGroup.CornerUpLeftDoubleFill: ImageVector
    get() {
        if (_cornerUpLeftDoubleFill != null) {
            return _cornerUpLeftDoubleFill!!
        }
        _cornerUpLeftDoubleFill = Builder(name = "CornerUpLeftDoubleFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.0f)
                lineTo(20.0f, 10.0f)
                lineTo(14.414f, 10.0f)
                verticalLineTo(4.586f)
                lineTo(8.0f, 11.0f)
                lineTo(14.414f, 17.414f)
                verticalLineTo(12.0f)
                lineTo(18.0f, 12.0f)
                lineTo(18.0f, 19.0f)
                lineTo(20.0f, 19.0f)
                close()
                moveTo(10.164f, 6.05f)
                lineTo(8.75f, 4.636f)
                lineTo(2.386f, 11.0f)
                lineTo(8.75f, 17.364f)
                lineTo(10.164f, 15.95f)
                lineTo(5.214f, 11.0f)
                lineTo(10.164f, 6.05f)
                close()
            }
        }
        .build()
        return _cornerUpLeftDoubleFill!!
    }

private var _cornerUpLeftDoubleFill: ImageVector? = null
