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

public val ArrowsGroup.ArrowRightDownFill: ImageVector
    get() {
        if (_arrowRightDownFill != null) {
            return _arrowRightDownFill!!
        }
        _arrowRightDownFill = Builder(name = "ArrowRightDownFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.637f, 13.052f)
                lineTo(5.98f, 7.395f)
                lineTo(7.394f, 5.98f)
                lineTo(13.051f, 11.637f)
                lineTo(18.001f, 6.688f)
                verticalLineTo(18.001f)
                horizontalLineTo(6.687f)
                lineTo(11.637f, 13.052f)
                close()
            }
        }
        .build()
        return _arrowRightDownFill!!
    }

private var _arrowRightDownFill: ImageVector? = null
