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

public val ArrowsGroup.ExpandRightFill: ImageVector
    get() {
        if (_expandRightFill != null) {
            return _expandRightFill!!
        }
        _expandRightFill = Builder(name = "ExpandRightFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 5.0f)
                lineTo(21.0f, 12.0f)
                lineTo(14.0f, 19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                lineTo(8.0f, 11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(4.0f, 19.0f)
                lineTo(4.0f, 5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _expandRightFill!!
    }

private var _expandRightFill: ImageVector? = null