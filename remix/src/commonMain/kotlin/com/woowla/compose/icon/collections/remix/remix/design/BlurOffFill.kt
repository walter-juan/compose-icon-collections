package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.BlurOffFill: ImageVector
    get() {
        if (_blurOffFill != null) {
            return _blurOffFill!!
        }
        _blurOffFill = Builder(name = "BlurOffFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.432f, 6.843f)
                lineTo(1.394f, 2.804f)
                lineTo(2.808f, 1.39f)
                lineTo(22.607f, 21.189f)
                lineTo(21.192f, 22.603f)
                lineTo(18.154f, 19.565f)
                curveTo(14.625f, 22.874f, 9.082f, 22.806f, 5.636f, 19.361f)
                curveTo(2.191f, 15.915f, 2.123f, 10.372f, 5.432f, 6.843f)
                close()
                moveTo(8.243f, 4.026f)
                lineTo(12.0f, 0.269f)
                lineTo(18.364f, 6.633f)
                curveTo(20.95f, 9.219f, 21.633f, 12.986f, 20.414f, 16.197f)
                lineTo(8.243f, 4.026f)
                close()
            }
        }
        .build()
        return _blurOffFill!!
    }

private var _blurOffFill: ImageVector? = null
