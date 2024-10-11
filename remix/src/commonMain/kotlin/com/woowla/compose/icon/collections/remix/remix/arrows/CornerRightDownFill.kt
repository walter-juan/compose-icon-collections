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

public val ArrowsGroup.CornerRightDownFill: ImageVector
    get() {
        if (_cornerRightDownFill != null) {
            return _cornerRightDownFill!!
        }
        _cornerRightDownFill = Builder(name = "CornerRightDownFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                lineTo(5.0f, 7.0f)
                lineTo(12.0f, 7.0f)
                lineTo(12.0f, 14.586f)
                horizontalLineTo(6.586f)
                lineTo(13.0f, 21.0f)
                lineTo(19.414f, 14.586f)
                lineTo(14.0f, 14.586f)
                lineTo(14.0f, 5.0f)
                close()
            }
        }
        .build()
        return _cornerRightDownFill!!
    }

private var _cornerRightDownFill: ImageVector? = null