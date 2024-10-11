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

public val ArrowsGroup.ArrowDownWideLine: ImageVector
    get() {
        if (_arrowDownWideLine != null) {
            return _arrowDownWideLine!!
        }
        _arrowDownWideLine = Builder(name = "ArrowDownWideLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.632f)
                lineTo(20.968f, 10.884f)
                lineTo(20.032f, 9.116f)
                lineTo(12.0f, 13.368f)
                lineTo(3.968f, 9.116f)
                lineTo(3.032f, 10.884f)
                lineTo(12.0f, 15.632f)
                close()
            }
        }
        .build()
        return _arrowDownWideLine!!
    }

private var _arrowDownWideLine: ImageVector? = null
