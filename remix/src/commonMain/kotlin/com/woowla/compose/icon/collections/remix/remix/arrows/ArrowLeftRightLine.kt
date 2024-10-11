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

public val ArrowsGroup.ArrowLeftRightLine: ImageVector
    get() {
        if (_arrowLeftRightLine != null) {
            return _arrowLeftRightLine!!
        }
        _arrowLeftRightLine = Builder(name = "ArrowLeftRightLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.05f, 12.05f)
                lineTo(21.0f, 17.0f)
                lineTo(16.05f, 21.949f)
                lineTo(14.636f, 20.535f)
                lineTo(17.172f, 17.999f)
                lineTo(4.0f, 18.0f)
                verticalLineTo(16.0f)
                lineTo(17.172f, 15.999f)
                lineTo(14.636f, 13.464f)
                lineTo(16.05f, 12.05f)
                close()
                moveTo(7.95f, 2.05f)
                lineTo(9.364f, 3.464f)
                lineTo(6.828f, 5.999f)
                lineTo(20.0f, 6.0f)
                verticalLineTo(8.0f)
                lineTo(6.828f, 7.999f)
                lineTo(9.364f, 10.535f)
                lineTo(7.95f, 11.949f)
                lineTo(3.0f, 7.0f)
                lineTo(7.95f, 2.05f)
                close()
            }
        }
        .build()
        return _arrowLeftRightLine!!
    }

private var _arrowLeftRightLine: ImageVector? = null
