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

public val ArrowsGroup.CornerUpRightDoubleFill: ImageVector
    get() {
        if (_cornerUpRightDoubleFill != null) {
            return _cornerUpRightDoubleFill!!
        }
        _cornerUpRightDoubleFill = Builder(name = "CornerUpRightDoubleFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 19.0f)
                lineTo(4.0f, 10.0f)
                lineTo(9.586f, 10.0f)
                verticalLineTo(4.586f)
                lineTo(16.0f, 11.0f)
                lineTo(9.586f, 17.414f)
                verticalLineTo(12.0f)
                lineTo(6.0f, 12.0f)
                lineTo(6.0f, 19.0f)
                lineTo(4.0f, 19.0f)
                close()
                moveTo(13.836f, 6.05f)
                lineTo(15.25f, 4.636f)
                lineTo(21.614f, 11.0f)
                lineTo(15.25f, 17.364f)
                lineTo(13.836f, 15.95f)
                lineTo(18.786f, 11.0f)
                lineTo(13.836f, 6.05f)
                close()
            }
        }
        .build()
        return _cornerUpRightDoubleFill!!
    }

private var _cornerUpRightDoubleFill: ImageVector? = null
