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

public val ArrowsGroup.ArrowRightDownLongLine: ImageVector
    get() {
        if (_arrowRightDownLongLine != null) {
            return _arrowRightDownLongLine!!
        }
        _arrowRightDownLongLine = Builder(name = "ArrowRightDownLongLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.222f, 5.636f)
                lineTo(5.636f, 4.222f)
                lineTo(17.071f, 15.657f)
                verticalLineTo(10.071f)
                horizontalLineTo(19.071f)
                lineTo(19.071f, 19.071f)
                lineTo(10.071f, 19.071f)
                lineTo(10.071f, 17.071f)
                lineTo(15.657f, 17.071f)
                lineTo(4.222f, 5.636f)
                close()
            }
        }
        .build()
        return _arrowRightDownLongLine!!
    }

private var _arrowRightDownLongLine: ImageVector? = null
