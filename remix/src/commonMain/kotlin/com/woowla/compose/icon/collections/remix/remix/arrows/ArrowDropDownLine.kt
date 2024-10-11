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

public val ArrowsGroup.ArrowDropDownLine: ImageVector
    get() {
        if (_arrowDropDownLine != null) {
            return _arrowDropDownLine!!
        }
        _arrowDropDownLine = Builder(name = "ArrowDropDownLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.001f)
                lineTo(7.757f, 10.758f)
                lineTo(9.172f, 9.344f)
                lineTo(12.0f, 12.172f)
                lineTo(14.828f, 9.344f)
                lineTo(16.243f, 10.758f)
                lineTo(12.0f, 15.001f)
                close()
            }
        }
        .build()
        return _arrowDropDownLine!!
    }

private var _arrowDropDownLine: ImageVector? = null
