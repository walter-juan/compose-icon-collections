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

public val ArrowsGroup.ArrowRightLongLine: ImageVector
    get() {
        if (_arrowRightLongLine != null) {
            return _arrowRightLongLine!!
        }
        _arrowRightLongLine = Builder(name = "ArrowRightLongLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 13.0f)
                lineTo(2.0f, 11.0f)
                lineTo(18.171f, 11.0f)
                lineTo(14.222f, 7.05f)
                lineTo(15.636f, 5.636f)
                lineTo(22.0f, 12.0f)
                lineTo(15.636f, 18.364f)
                lineTo(14.222f, 16.95f)
                lineTo(18.172f, 13.0f)
                lineTo(2.0f, 13.0f)
                close()
            }
        }
        .build()
        return _arrowRightLongLine!!
    }

private var _arrowRightLongLine: ImageVector? = null
