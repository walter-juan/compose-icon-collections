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

public val ArrowsGroup.ArrowRightWideLine: ImageVector
    get() {
        if (_arrowRightWideLine != null) {
            return _arrowRightWideLine!!
        }
        _arrowRightWideLine = Builder(name = "ArrowRightWideLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.632f, 12.0f)
                lineTo(10.884f, 3.032f)
                lineTo(9.116f, 3.968f)
                lineTo(13.368f, 12.0f)
                lineTo(9.116f, 20.032f)
                lineTo(10.884f, 20.968f)
                lineTo(15.632f, 12.0f)
                close()
            }
        }
        .build()
        return _arrowRightWideLine!!
    }

private var _arrowRightWideLine: ImageVector? = null
