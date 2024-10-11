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

public val ArrowsGroup.ArrowLeftDownFill: ImageVector
    get() {
        if (_arrowLeftDownFill != null) {
            return _arrowLeftDownFill!!
        }
        _arrowLeftDownFill = Builder(name = "ArrowLeftDownFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.361f, 13.052f)
                lineTo(17.31f, 18.001f)
                horizontalLineTo(5.997f)
                verticalLineTo(6.688f)
                lineTo(10.947f, 11.637f)
                lineTo(16.603f, 5.98f)
                lineTo(18.018f, 7.395f)
                lineTo(12.361f, 13.052f)
                close()
            }
        }
        .build()
        return _arrowLeftDownFill!!
    }

private var _arrowLeftDownFill: ImageVector? = null
