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

public val ArrowsGroup.SkipLeftFill: ImageVector
    get() {
        if (_skipLeftFill != null) {
            return _skipLeftFill!!
        }
        _skipLeftFill = Builder(name = "SkipLeftFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(11.0f, 12.0f)
                lineTo(17.0f, 6.0f)
                verticalLineTo(18.0f)
                lineTo(11.0f, 12.0f)
                close()
            }
        }
        .build()
        return _skipLeftFill!!
    }

private var _skipLeftFill: ImageVector? = null