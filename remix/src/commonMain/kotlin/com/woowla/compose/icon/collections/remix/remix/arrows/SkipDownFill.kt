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

public val ArrowsGroup.SkipDownFill: ImageVector
    get() {
        if (_skipDownFill != null) {
            return _skipDownFill!!
        }
        _skipDownFill = Builder(name = "SkipDownFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                lineTo(6.0f, 15.0f)
                lineTo(18.0f, 15.0f)
                lineTo(18.0f, 17.0f)
                close()
                moveTo(12.0f, 13.0f)
                lineTo(18.0f, 7.0f)
                horizontalLineTo(6.0f)
                lineTo(12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _skipDownFill!!
    }

private var _skipDownFill: ImageVector? = null
