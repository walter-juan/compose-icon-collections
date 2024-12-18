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

public val ArrowsGroup.ArrowRightDownLongFill: ImageVector
    get() {
        if (_arrowRightDownLongFill != null) {
            return _arrowRightDownLongFill!!
        }
        _arrowRightDownLongFill = Builder(name = "ArrowRightDownLongFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.636f, 4.222f)
                lineTo(4.222f, 5.636f)
                lineTo(13.828f, 15.243f)
                lineTo(10.0f, 19.071f)
                lineTo(19.071f, 19.071f)
                lineTo(19.071f, 10.0f)
                lineTo(15.243f, 13.828f)
                lineTo(5.636f, 4.222f)
                close()
            }
        }
        .build()
        return _arrowRightDownLongFill!!
    }

private var _arrowRightDownLongFill: ImageVector? = null
